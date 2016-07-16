package com.ideamoment.caserunner.model;

import org.openqa.selenium.WebDriver;

/**
 * Created by zhangzhonghua on 2016/6/1.
 */
public class GetCommand extends Command {

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public CommandType getType() {
        return CommandType.GET;
    }

    @Override
    public CommandExecuteResult execute(WebDriver driver) {
        driver.get(url);
        CommandExecuteResult result = new CommandExecuteResult();
        result.setResult("success");
        return result;
    }
}
