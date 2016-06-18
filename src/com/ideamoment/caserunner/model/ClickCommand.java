/**
 * 
 */
package com.ideamoment.caserunner.model;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ideamoment.caserunner.model.condition.Condition;
import com.ideamoment.caserunner.model.condition.ConditionType;


/**
 * @author Chinakite
 *
 */
public class ClickCommand extends Command {

    private String target;
    
    private Condition condition;
    
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
    
    /**
     * @return the condition
     */
    public Condition getCondition() {
        return condition;
    }
    
    /**
     * @param condition the condition to set
     */
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    /* (non-Javadoc)
     * @see com.ideamoment.caserunner.model.Command#execute(org.openqa.selenium.WebDriver)
     */
    @Override
    public CommandExecuteResult execute(WebDriver driver) {
        CommandExecuteResult result = new CommandExecuteResult();
        try {
            if(condition != null) {
                if(condition.getType() == ConditionType.EXISTS) {
                    WebDriverWait wait = new WebDriverWait(driver, condition.getTimeout());
                    wait.until(new ExpectedCondition<WebElement>(){  
                        @Override  
                        public WebElement apply(WebDriver d) {  
                            return d.findElement(By.cssSelector(target));  
                        }
                    }).click();
                }
            }else{
                WebElement webElement = driver.findElement(By.cssSelector(this.getTarget()));
                webElement.click();
            }
            result.setResult("success");
            return result;
        }catch(NoSuchElementException ex) {
            result.setResult("failed");
            return result;
        }
    }

}
