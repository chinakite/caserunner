package com.ideamoment.caserunner.model;

import java.util.Date;

import org.openqa.selenium.WebDriver;

import com.ideamoment.caserunner.model.dict.CommandBlockType;
import com.ideamoment.caserunner.model.dict.CommandType;

/**
 * Created by zhangzhonghua on 2016/6/1.
 */
public abstract class Command {

    protected CommandType type;
    
    protected int startLine;
    
    protected int endLine;
    
    protected String text;

    protected CommandBlockType blockType = CommandBlockType.NON_BLOCKED;

    public abstract CommandType getType();

    public void setType(CommandType type) {
        this.type = type;
    }
    
    public CommandExecuteResult execute(WebDriver driver) {
    	CommandExecuteResult result = new CommandExecuteResult();
    	result.setStartTime(new Date());
    	result = doExecute(driver, result);
    	result.setEndTime(new Date());
    	return result;
    }

    public abstract CommandExecuteResult doExecute(WebDriver driver, CommandExecuteResult result);

    /**
     * @return the startLine
     */
    public int getStartLine() {
        return startLine;
    }
    
    /**
     * @param startLine the startLine to set
     */
    public void setStartLine(int startLine) {
        this.startLine = startLine;
    }
    
    /**
     * @return the endLine
     */
    public int getEndLine() {
        return endLine;
    }
    
    /**
     * @param endLine the endLine to set
     */
    public void setEndLine(int endLine) {
        this.endLine = endLine;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }
    
    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    public CommandBlockType getBlockType() {
        return blockType;
    }

    public void setBlockType(CommandBlockType blockType) {
        this.blockType = blockType;
    }
}
