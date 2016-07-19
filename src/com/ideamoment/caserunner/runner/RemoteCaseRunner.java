/**
 * 
 */
package com.ideamoment.caserunner.runner;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.ideamoment.caserunner.model.Case;
import com.ideamoment.caserunner.model.Command;
import com.ideamoment.caserunner.model.CommandExecuteResult;
import com.ideamoment.caserunner.model.CommandExecuteResultType;
import com.ideamoment.caserunner.model.CommandType;
import com.ideamoment.caserunner.model.Env;
import com.ideamoment.caserunner.result.RunResultHandler;


/**
 * @author Chinakite
 *
 */
public class RemoteCaseRunner extends AbstractCaseRunner implements CaseRunner {

    WebDriver driver;
    
    /* (non-Javadoc)
     * @see com.ideamoment.caserunner.runner.CaseRunner#run(com.ideamoment.caserunner.model.Env, com.ideamoment.caserunner.model.Case)
     */
    @Override
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
                }
            }
        }
    }
}
