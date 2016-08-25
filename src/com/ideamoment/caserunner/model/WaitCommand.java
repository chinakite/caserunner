package com.ideamoment.caserunner.model;

import com.ideamoment.caserunner.model.dict.CommandExecuteResultType;
import com.ideamoment.caserunner.model.dict.CommandType;
import org.openqa.selenium.WebDriver;

/**
 * Created by zhangzhonghua on 2016/6/6.
 */
public class WaitCommand extends Command {
    private int waitSeconds = 0;

    private boolean waitResponse = false;

    private int timeoutSeconds = 0;

    public int getWaitSeconds() {
        return waitSeconds;
    }

    public void setWaitSeconds(int waitSeconds) {
        this.waitSeconds = waitSeconds;
    }

    public boolean isWaitResponse() {
        return waitResponse;
    }

    public void setWaitResponse(boolean waitResponse) {
        this.waitResponse = waitResponse;
    }

    public int getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(int timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    @Override
    public CommandType getType() {
        return CommandType.WAIT;
    }

    @Override
    public CommandExecuteResult doExecute(WebDriver driver, CommandExecuteResult result) {
        result.setCommand(this);
        
        try {
            Thread.sleep(this.waitSeconds);
            result.setResult(CommandExecuteResultType.SUCCESS);
        } catch (InterruptedException e) {
            e.printStackTrace();
            result.setResult(CommandExecuteResultType.FAILED);
        }
        return result;
    }
}
