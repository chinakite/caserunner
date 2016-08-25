package com.ideamoment.caserunner.model;

import com.ideamoment.caserunner.model.dict.*;
import com.ideamoment.caserunner.model.dict.CommandExecuteResultType;
import com.ideamoment.caserunner.model.dict.CommandType;
import com.ideamoment.caserunner.util.NumericUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.math.BigDecimal;

/**
 * Created by zhangzhonghua on 2016/7/25.
 */
public class BinaryAssertCommand extends AssertCommand{

    private BinaryPartStatement left;

    private BinaryPartStatement right;

    private BinaryOp op;

    public BinaryPartStatement getLeft() {
        return left;
    }

    public void setLeft(BinaryPartStatement left) {
        this.left = left;
    }

    public BinaryPartStatement getRight() {
        return right;
    }

    public void setRight(BinaryPartStatement right) {
        this.right = right;
    }

    public BinaryOp getOp() {
        return op;
    }

    public void setOp(BinaryOp op) {
        this.op = op;
    }

    @Override
    public CommandType getType() {
        return CommandType.ASSERT;
    }

    @Override
    public CommandExecuteResult doExecute(WebDriver driver, CommandExecuteResult result) {
        result.setCommand(this);
        
        try {
            BinaryPartStatement left = this.getLeft();
            BinaryPartStatement right = this.getRight();

            Object leftValue = getBinaryPartValue(driver, result, left);
            Object rightValue = getBinaryPartValue(driver, result, right);

            boolean binResult = false;
            BinaryOp op = this.getOp();
            if(BinaryOp.EQ == op) {
                if(leftValue == null && rightValue == null) {
                    binResult = true;
                }else if(leftValue == null || rightValue == null){
                    binResult = false;
                }else{
                    binResult = leftValue.toString().equals(rightValue.toString());
                }
            }else if(BinaryOp.NE == op) {
                if(leftValue == null && rightValue == null) {
                    binResult = false;
                }else if(leftValue == null || rightValue == null){
                    binResult = true;
                }else{
                    binResult = !leftValue.toString().equals(rightValue.toString());
                }
            }else if(BinaryOp.GT == op) {
                if(leftValue == null || rightValue == null) {
                    binResult = false;
                }else if(!NumericUtils.isNumeric(leftValue.toString()) || !NumericUtils.isNumeric(rightValue.toString())) {
                    binResult = false;
                }else{
                    leftValue = new BigDecimal(leftValue.toString());
                    rightValue = new BigDecimal(rightValue.toString());
                    binResult = ((BigDecimal)leftValue).compareTo((BigDecimal)rightValue) == 1;
                }
            }
            if(binResult) {
                result.setResult(com.ideamoment.caserunner.model.dict.CommandExecuteResultType.SUCCESS);
            }else{
                result.setResult(com.ideamoment.caserunner.model.dict.CommandExecuteResultType.FAILED);
            }
            return result;
        }catch(NoSuchElementException ex) {
            result.setResult(CommandExecuteResultType.FAILED);
            return result;
        }

    }

    private Object getBinaryPartValue(WebDriver driver, CommandExecuteResult result, BinaryPartStatement left) {
        Object leftValue = null;
        BinaryPartType leftPartType = left.getType();
        if(BinaryPartType.METHOD == leftPartType) {
            String leftTarget = left.getTarget();
            ValueMethod leftValueMethod = left.getValueMethod();
            WebElement webElement = driver.findElement(By.cssSelector(leftTarget));
            if(webElement != null) {
                if(leftValueMethod != null) {
                    if(MethodType.CSS == leftValueMethod.getMethodType()) {
                        leftValue = webElement.getCssValue(leftValueMethod.getParam());
                    }else if(MethodType.ATTR == leftValueMethod.getMethodType()){
                        leftValue = webElement.getAttribute(leftValueMethod.getParam());
                    }else if(MethodType.TEXT == leftValueMethod.getMethodType()){
                        leftValue = webElement.getText();
                    }else if(MethodType.VAL == leftValueMethod.getMethodType()){
                        if(webElement.getTagName().toLowerCase().equals("textarea")) {
                            leftValue = webElement.getText();
                        }else {
                            leftValue = webElement.getAttribute("value");
                        }
                    }
                }
            }else{
                result.setResult(CommandExecuteResultType.FAILED);
            }
        }else if(BinaryPartType.STRING == leftPartType){
            leftValue = left.getStrValue();
        }else if(BinaryPartType.INTEGER == leftPartType){
            leftValue = left.getIntValue();
        }else if(BinaryPartType.DECIMAL == leftPartType){
            leftValue = left.getDecimalValue();
        }
        return leftValue;
    }
}
