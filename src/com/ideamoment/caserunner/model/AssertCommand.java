package com.ideamoment.caserunner.model;

import com.ideamoment.caserunner.model.dict.CommandType;

/**
 * Created by zhangzhonghua on 2016/6/1.
 */
public abstract class AssertCommand extends Command {

    protected String target;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public CommandType getType() {
        return CommandType.ASSERT;
    }
    
}
