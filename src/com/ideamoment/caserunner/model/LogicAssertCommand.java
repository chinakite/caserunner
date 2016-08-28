package com.ideamoment.caserunner.model;

import com.ideamoment.caserunner.CaseRunnerException;
import com.ideamoment.caserunner.CaseRunnerExceptionCode;
import com.ideamoment.caserunner.model.dict.*;
import com.ideamoment.caserunner.model.dict.CommandExecuteResultType;
import com.ideamoment.caserunner.runner.RunContext;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

/**
 * Created by zhangzhonghua on 2016/7/25.
 */
public class LogicAssertCommand extends AssertCommand{

    private BinaryPartStatement left;

    private BinaryPartStatement right;

    private LogicConditionType logicType;

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

    public LogicConditionType getLogicType() {
        return logicType;
    }

    @Override
    public CommandExecuteResult doExecute(WebDriver driver, CommandExecuteResult result, RunContext context) {
        result.setCommand(this);
        
        try {
            AssertCommand leftAssertCommand = null, rightAssertCommand = null;
            if(BinaryPartType.ASSERT_COMMAND == left.getType()) {
                leftAssertCommand = left.getAssertCommand();
            }
            if(BinaryPartType.ASSERT_COMMAND == right.getType()){
                rightAssertCommand = left.getAssertCommand();
            }

            if(leftAssertCommand == null || rightAssertCommand == null) {
                throw new CaseRunnerException(CaseRunnerExceptionCode.SYNTAX_ERROR, "LogicAssertCommand left or right is null.");
            }

            CommandExecuteResult leftResult = null;
            if(leftAssertCommand instanceof ExistsAssertCommand){
                leftResult = ((ExistsAssertCommand)leftAssertCommand).execute(driver, context);
            }else if(leftAssertCommand instanceof ShownAssertCommand){
                leftResult = ((ShownAssertCommand)leftAssertCommand).execute(driver, context);
            }else if(leftAssertCommand instanceof BinaryAssertCommand) {
                leftResult = ((BinaryAssertCommand)leftAssertCommand).execute(driver, context);
            }

            CommandExecuteResult rightResult = null;
            if(rightAssertCommand instanceof ExistsAssertCommand){
                rightResult = ((ExistsAssertCommand)rightAssertCommand).execute(driver, context);
            }else if(leftAssertCommand instanceof ShownAssertCommand){
                rightResult = ((ShownAssertCommand)rightAssertCommand).execute(driver, context);
            }else if(leftAssertCommand instanceof BinaryAssertCommand) {
                rightResult = ((BinaryAssertCommand)rightAssertCommand).execute(driver, context);
            }

            CommandExecuteResultType leftResultType = leftResult.getResult();
            CommandExecuteResultType rightResultType = rightResult.getResult();

            boolean leftBool = false;
            boolean rightBool = false;
            if(leftResultType == CommandExecuteResultType.SUCCESS) {
                leftBool = true;
            }

            if(rightResultType == CommandExecuteResultType.SUCCESS) {
                rightBool = true;
            }

            if(LogicConditionType.AND == this.getLogicType()) {
                if(leftBool && rightBool) {
                    result.setResult(CommandExecuteResultType.SUCCESS);
                }else{
                    result.setResult(CommandExecuteResultType.FAILED);
                }
            }else{
                if(leftBool || rightBool) {
                    result.setResult(CommandExecuteResultType.SUCCESS);
                }else{
                    result.setResult(CommandExecuteResultType.FAILED);
                }
            }

            return result;
        }catch(NoSuchElementException ex) {
            result.setResult(com.ideamoment.caserunner.model.dict.CommandExecuteResultType.FAILED);
            return result;
        }
    }

    public void setLogicType(LogicConditionType logicType) {
        this.logicType = logicType;
    }
}
