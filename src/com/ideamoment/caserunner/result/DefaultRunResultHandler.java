package com.ideamoment.caserunner.result;

import com.ideamoment.caserunner.model.Command;
import com.ideamoment.caserunner.model.CommandExecuteResult;
import com.ideamoment.caserunner.model.dict.CommandExecuteResultType;

/**
 * Created by zhangzhonghua on 2016/7/18.
 */
public class DefaultRunResultHandler implements RunResultHandler{

    @Override
    public void handle(Command command, CommandExecuteResult result) {
        CommandExecuteResultType resultType = result.getResult();
    }
}
