package com.ideamoment.caserunner.model;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ideamoment.caserunner.runner.RunContext;

/**
 * Created by zhangzhonghua on 2016/7/25.
 */
public class ShownAssertCommand extends AssertCommand {

    @Override
    public CommandExecuteResult doExecute(WebDriver driver, CommandExecuteResult result, RunContext context) {
        result.setCommand(this);
        
        try {
            WebElement webElement = driver.findElement(By.cssSelector(this.getTarget()));

            if(webElement != null) {
                if(webElement.isDisplayed()){
                    result.setResult(com.ideamoment.caserunner.model.dict.CommandExecuteResultType.SUCCESS);
                }else{
                    result.setResult(com.ideamoment.caserunner.model.dict.CommandExecuteResultType.FAILED);
                }
            }else{
                result.setResult(com.ideamoment.caserunner.model.dict.CommandExecuteResultType.FAILED);
            }
            return result;
        }catch(NoSuchElementException ex) {
            result.setResult(com.ideamoment.caserunner.model.dict.CommandExecuteResultType.FAILED);
            return result;
        }
    }
}
