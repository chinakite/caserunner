package com.ideamoment.caserunner.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzhonghua on 2016/6/1.
 */
public class Case {
    private String namespace;

    private String name;
    
    private int startLine;
    
    private int endLine;

    private List<Command> commands = new ArrayList<Command>();

    public Case() {
    }

    public Case(String namespace, String name) {
        this.namespace = namespace;
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public void addCommand(Command command) {
        commands.add(command);
    }
    
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
    
    
}
