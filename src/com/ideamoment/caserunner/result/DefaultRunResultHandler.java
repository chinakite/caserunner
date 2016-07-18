package com.ideamoment.caserunner.result;

import com.ideamoment.caserunner.model.CommandExecuteResult;
import com.ideamoment.caserunner.model.CommandExecuteResultType;

/**
 * Created by zhangzhonghua on 2016/7/18.
 */
public class DefaultRunResultHandler implements RunResultHandler{

    @Override
    public void handle(CommandExecuteResult result) {
        CommandExecuteResultType resultType = result.getResult();

    }
}
