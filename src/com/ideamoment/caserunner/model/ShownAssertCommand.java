package com.ideamoment.caserunner.model;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by zhangzhonghua on 2016/7/25.
 */
public class ShownAssertCommand extends AssertCommand {

    @Override
    public CommandExecuteResult execute(WebDriver driver) {
        CommandExecuteResult result = new CommandExecuteResult();

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
