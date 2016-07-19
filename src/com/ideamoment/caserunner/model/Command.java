package com.ideamoment.caserunner.model;

import com.ideamoment.caserunner.result.RunResultHandler;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzhonghua on 2016/6/1.
 */
public abstract class Command {

    protected CommandType type;
    
    protected int startLine;
    
    protected int endLine;
    
    protected String text;

    public abstract CommandType getType();

    public void setType(CommandType type) {
        this.type = type;
    }

    public abstract CommandExecuteResult execute(WebDriver driver);

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

}
