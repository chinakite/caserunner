package com.ideamoment.caserunner.runner;

import com.ideamoment.caserunner.model.*;
import com.ideamoment.caserunner.model.dict.CommandBlockType;
import com.ideamoment.caserunner.model.dict.CommandExecuteResultType;
import com.ideamoment.caserunner.model.dict.CommandType;
import com.ideamoment.caserunner.result.RunResultHandler;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by zhangzhonghua on 2016/6/1.
 */
public class DefaultCaseRunner extends AbstractCaseRunner implements CaseRunner {

    protected WebDriver driver;

    public void run(Env env, Case caze) {
        driver = env.getWebDriver();

        List<Command> commands = caze.getCommands();
        for(Command command : commands) {
            if(command.getType() == CommandType.GET
                    || command.getType() == CommandType.ASSERT
                    || command.getType() == CommandType.INPUT
                    || command.getType() == CommandType.CLICK
                    || command.getType() == CommandType.WAIT) {
                CommandExecuteResult result = command.execute(driver);
                if(this.resultHandlers != null) {
                    for(RunResultHandler handler : this.resultHandlers) {
                        handler.handle(command, result);
                    }
                }
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
    }
}
