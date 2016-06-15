package com.ideamoment.caserunner.model;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by zhangzhonghua on 2016/6/13.
 */
public class InputCommand extends Command {

    private String value;

    private String target;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public CommandType getType() {
        return CommandType.INPUT;
    }

    @Override
    public CommandExecuteResult execute(WebDriver driver) {
        CommandExecuteResult result = new CommandExecuteResult();
        try {
            WebElement webElement = driver.findElement(By.cssSelector(this.getTarget()));
            webElement.sendKeys(this.getValue());

            result.setResult("success");
            return result;
        }catch(NoSuchElementException ex) {
            result.setResult("failed");
            return result;
        }
    }
}
