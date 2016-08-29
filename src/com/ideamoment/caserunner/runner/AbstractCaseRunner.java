package com.ideamoment.caserunner.runner;

import com.ideamoment.caserunner.model.Command;
import com.ideamoment.caserunner.model.CommandExecuteResult;
import com.ideamoment.caserunner.result.RunResultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzhonghua on 2016/7/19.
 */
public class AbstractCaseRunner {

    protected RunContext runContext;

    protected List<RunResultHandler> resultHandlers = new ArrayList<RunResultHandler>();

    public boolean addResultHandler(RunResultHandler handler) {
        return this.resultHandlers.add(handler);
    }

    public boolean removeResultHandler(RunResultHandler handler) {
        return this.resultHandlers.remove(handler);
    }

    public void setResultHandlers(List<RunResultHandler> handlers) {
        this.resultHandlers = handlers;
    }

    public List<RunResultHandler> getResultHandlers() {
        return this.resultHandlers;
    }

    protected void handleCommandResult(Command command, CommandExecuteResult result) {
        if(this.resultHandlers != null) {
            for(RunResultHandler handler : this.resultHandlers) {
                handler.handleCommandResult(command, result);
            }
        }
    }

    public void setRunContext(RunContext runContext) {
        this.runContext = runContext;
    }

    public RunContext getRunContext() {
        return this.runContext;
    }
}
