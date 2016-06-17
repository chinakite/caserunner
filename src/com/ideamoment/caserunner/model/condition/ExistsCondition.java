package com.ideamoment.caserunner.model.condition;

/**
 * Created by zhangzhonghua on 2016/6/17.
 */
public class ExistsCondition extends Condition {
    protected String target;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public ConditionType getType() {
        return ConditionType.EXISTS;
    }
}
