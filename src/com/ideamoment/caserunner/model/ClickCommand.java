/**
 * 
 */
package com.ideamoment.caserunner.model;

import com.ideamoment.caserunner.model.condition.ExistsCondition;
import com.ideamoment.caserunner.model.condition.ShownCondition;
import com.ideamoment.caserunner.model.dict.CommandExecuteResultType;
import com.ideamoment.caserunner.model.dict.CommandType;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
     * @return the param
     */
    public String getTarget() {
        return target;
    }
    
    /**
     * @param target the param to set
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
    public CommandExecuteResult doExecute(WebDriver driver, CommandExecuteResult result) {
        result.setCommand(this);
        
        try {
            if(condition != null) {
                if(condition.getType() == ConditionType.EXISTS) {
                    final ExistsCondition existCondition = (ExistsCondition)condition;
                    long timeout = condition.getTimeout();
                    WebDriverWait wait = new WebDriverWait(driver, timeout / 1000);
                    try {
                        WebElement webElement = wait.until(new ExpectedCondition<WebElement>() {
                            @Override
                            public WebElement apply(WebDriver d) {
                                return d.findElement(By.cssSelector(existCondition.getTarget()));
                            }
                        });

                        if(webElement != null) {
                            WebElement targetElement = driver.findElement(By.cssSelector(this.getTarget()));
                            if(targetElement != null) {
                                targetElement.click();
                            }
                        }
                    }catch(TimeoutException te) {
                        te.printStackTrace();
                        result.setResult(CommandExecuteResultType.FAILED);
                        return result;
                    }
                }else if(condition.getType() == ConditionType.SHOWN) {
                    ShownCondition showCondition = (ShownCondition)condition;
                    long timeout = condition.getTimeout();
                    WebDriverWait wait = new WebDriverWait(driver, timeout / 1000);
                    try {
                        WebElement webElement = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(showCondition.getTarget()))));
                        if (webElement != null) {
                            WebElement targetElement = driver.findElement(By.cssSelector(this.getTarget()));
                            if (targetElement != null) {
                                targetElement.click();
                            }
                        }
                    }catch(TimeoutException te) {
                        te.printStackTrace();
                        result.setResult(CommandExecuteResultType.FAILED);
                        return result;
                    }
                }
            }else{
                WebElement webElement = driver.findElement(By.cssSelector(this.getTarget()));
                webElement.click();
            }
            result.setResult(CommandExecuteResultType.SUCCESS);
            return result;
        }catch(NoSuchElementException ex) {
            result.setResult(CommandExecuteResultType.FAILED);
            return result;
        }
    }

}
