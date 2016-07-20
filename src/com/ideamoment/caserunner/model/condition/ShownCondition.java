package com.ideamoment.caserunner.model.condition;

/**
 * Created by zhangzhonghua on 2016/7/20.
 */
public class ShownCondition extends Condition {
    protected String target;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public ConditionType getType() {
        return ConditionType.SHOWN;
    }
}
