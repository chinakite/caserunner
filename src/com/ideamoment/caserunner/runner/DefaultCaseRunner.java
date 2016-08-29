package com.ideamoment.caserunner.runner;

import java.util.Date;
import java.util.List;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import org.openqa.selenium.WebDriver;

import com.ideamoment.caserunner.model.Case;
import com.ideamoment.caserunner.model.CaseExecuteResult;
import com.ideamoment.caserunner.model.Command;
import com.ideamoment.caserunner.model.CommandExecuteResult;
import com.ideamoment.caserunner.model.Env;
import com.ideamoment.caserunner.model.dict.CommandBlockType;
import com.ideamoment.caserunner.model.dict.CommandExecuteResultType;
import com.ideamoment.caserunner.model.dict.CommandType;
import com.ideamoment.caserunner.result.RunResultHandler;

/**
 * Created by zhangzhonghua on 2016/6/1.
 */
public class DefaultCaseRunner extends AbstractCaseRunner implements CaseRunner {

    protected WebDriver driver;

    public DefaultCaseRunner(RunContext context) {
        this.runContext = context;
    }

    public CaseExecuteResult run(Env env, Case caze) {
        driver = env.getWebDriver();

        CaseExecuteResult cazeExecuteResult = new CaseExecuteResult();
        
        cazeExecuteResult.setStartTime(new Date());
        
        List<Command> commands = caze.getCommands();
        for(Command command : commands) {
            if(command.getType() == CommandType.GET
                    || command.getType() == CommandType.ASSERT
                    || command.getType() == CommandType.INPUT
                    || command.getType() == CommandType.CLICK
                    || command.getType() == CommandType.WAIT) {
                CommandExecuteResult result = command.execute(driver, this.getRunContext());
                if(this.resultHandlers != null) {
                    for(RunResultHandler handler : this.resultHandlers) {
                        handler.handleCommandResult(command, result);
                    }
                }
                cazeExecuteResult.addCommandResult(result);
                if(result != null && result.getResult() == CommandExecuteResultType.SUCCESS) {
                    System.out.println("YES");
                }else{
                    System.out.println("Fuck!");
                    if(command.getBlockType() == CommandBlockType.BLOCKED) {
                        break;
                    }
                }
            }
        }
        
        cazeExecuteResult.setEndTime(new Date());
        
        if(this.resultHandlers != null) {
            for(RunResultHandler handler : this.resultHandlers) {
                handler.handleCaseResult(caze, cazeExecuteResult);
            }
        }
        
        return cazeExecuteResult;
    }

}
