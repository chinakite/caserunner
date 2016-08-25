package com.ideamoment.caserunner.model;

import com.ideamoment.caserunner.model.dict.CommandExecuteResultType;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by zhangzhonghua on 2016/6/7.
 */
public class ExistsAssertCommand extends AssertCommand {

    @Override
    public CommandExecuteResult doExecute(WebDriver driver, CommandExecuteResult result) {
        result.setCommand(this);
        
        try {
            WebElement webElement = driver.findElement(By.cssSelector(this.getTarget()));

            if(webElement != null) {
                result.setResult(CommandExecuteResultType.SUCCESS);
            }else{
                result.setResult(CommandExecuteResultType.FAILED);
            }
            return result;
        }catch(NoSuchElementException ex) {
            result.setResult(CommandExecuteResultType.FAILED);
            return result;
        }
    }
}
