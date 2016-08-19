package com.ideamoment.caserunner.model;

import com.ideamoment.caserunner.model.dict.CommandExecuteResultType;
import com.ideamoment.caserunner.model.dict.CommandType;
import com.ideamoment.caserunner.model.dict.ModelConstants;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhangzhonghua on 2016/6/1.
 */
public class GetCommand extends Command {

    private String url;

    private int timeout = ModelConstants.NO_TIMEOUT;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Override
    public CommandType getType() {
        return CommandType.GET;
    }

    @Override
    public CommandExecuteResult execute(WebDriver driver) {
        try{
            if(this.timeout > 0) {
                driver.manage().timeouts().pageLoadTimeout(this.timeout, TimeUnit.MILLISECONDS);
            }
            driver.get(url);
            CommandExecuteResult result = new CommandExecuteResult();

            result.setCommand(this);
            
            result.setResult(CommandExecuteResultType.SUCCESS);
            return result;
        }catch(Exception e) {
            e.printStackTrace();
            CommandExecuteResult result = new CommandExecuteResult();
            result.setResult(CommandExecuteResultType.FAILED);
            return result;
        }
    }
}
