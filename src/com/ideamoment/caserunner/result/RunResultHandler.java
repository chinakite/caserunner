package com.ideamoment.caserunner.result;

import com.ideamoment.caserunner.model.Command;
import com.ideamoment.caserunner.model.CommandExecuteResult;

/**
 * Created by zhangzhonghua on 2016/7/18.
 */
public interface RunResultHandler {
    public void handle(Command command, CommandExecuteResult result);
}
