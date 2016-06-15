package com.ideamoment.caserunner.model;

import org.openqa.selenium.WebDriver;

/**
 * Created by zhangzhonghua on 2016/6/1.
 */
public abstract class Command {

    protected CommandType type;

    public abstract CommandType getType();

    public void setType(CommandType type) {
        this.type = type;
    }

    public abstract CommandExecuteResult execute(WebDriver driver);
}
