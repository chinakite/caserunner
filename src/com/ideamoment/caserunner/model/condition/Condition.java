package com.ideamoment.caserunner.model.condition;

/**
 * Created by zhangzhonghua on 2016/6/17.
 */
public abstract class Condition {

    protected int timeout = 10000;

    public abstract ConditionType getType();

    public int getTimeout() {
        return this.timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
