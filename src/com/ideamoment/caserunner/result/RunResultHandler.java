package com.ideamoment.caserunner.result;

import com.ideamoment.caserunner.model.Case;
import com.ideamoment.caserunner.model.CaseExecuteResult;
import com.ideamoment.caserunner.model.Command;
import com.ideamoment.caserunner.model.CommandExecuteResult;

/**
 * Created by zhangzhonghua on 2016/7/18.
 */
public interface RunResultHandler {
    public void handleCommandResult(Command command, CommandExecuteResult result);
    
    public void handleCaseResult(Case caze, CaseExecuteResult cazeResult);
}
