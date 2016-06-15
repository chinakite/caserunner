package com.ideamoment.caserunner.model;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by zhangzhonghua on 2016/6/7.
 */
public class ExistsAssertCommand extends AssertCommand {

    @Override
    public CommandExecuteResult execute(WebDriver driver) {
        CommandExecuteResult result = new CommandExecuteResult();
        try {
            WebElement webElement = driver.findElement(By.cssSelector(this.getTarget()));

            if(webElement != null) {
                result.setResult("success");
            }else{
                result.setResult("failed");
            }
            return result;
        }catch(NoSuchElementException ex) {
            result.setResult("failed");
            return result;
        }
    }
}
