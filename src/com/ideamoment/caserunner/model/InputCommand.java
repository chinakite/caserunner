package com.ideamoment.caserunner.model;

import com.ideamoment.caserunner.model.dict.CommandExecuteResultType;
import com.ideamoment.caserunner.model.dict.CommandType;
import com.ideamoment.caserunner.model.parameterize.ParamMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzhonghua on 2016/6/13.
 */
public class InputCommand extends Command {

    private String value;

    private List<ParamMethod> paramMethods = new ArrayList<ParamMethod>();

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
    public CommandExecuteResult doExecute(WebDriver driver, CommandExecuteResult result) {
        result.setCommand(this);
        
        try {
            WebElement webElement = driver.findElement(By.cssSelector(this.getTarget()));
            webElement.sendKeys(this.getValue());

            result.setResult(CommandExecuteResultType.SUCCESS);
            return result;
        }catch(NoSuchElementException ex) {
            result.setResult(CommandExecuteResultType.FAILED);
            return result;
        }
    }

    public List<ParamMethod> getParamMethods() {
        return paramMethods;
    }

    public void setParamMethods(List<ParamMethod> paramMethods) {
        this.paramMethods = paramMethods;
    }

    public void addParamMethod(ParamMethod paramMethod) {
        this.paramMethods.add(paramMethod);
    }
}
