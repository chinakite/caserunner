/**
 * 
 */
package com.ideamoment.caserunner.model;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * @author Chinakite
 *
 */
public class ClickCommand extends Command {

    private String target;
    
    /* (non-Javadoc)
     * @see com.ideamoment.caserunner.model.Command#getType()
     */
    @Override
    public CommandType getType() {
        return CommandType.CLICK;
    }
    
    /**
     * @return the target
     */
    public String getTarget() {
        return target;
    }
    
    /**
     * @param target the target to set
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /* (non-Javadoc)
     * @see com.ideamoment.caserunner.model.Command#execute(org.openqa.selenium.WebDriver)
     */
    @Override
    public CommandExecuteResult execute(WebDriver driver) {
        CommandExecuteResult result = new CommandExecuteResult();
        try {
            WebElement webElement = driver.findElement(By.cssSelector(this.getTarget()));
            webElement.click();

            result.setResult("success");
            return result;
        }catch(NoSuchElementException ex) {
            result.setResult("failed");
            return result;
        }
    }

}
