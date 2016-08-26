package com.ideamoment.caserunner.model.parameterize;

/**
 * Created by zhangzhonghua on 2016/8/26.
 */
public class SequenceMethod extends AbstractParamMethod implements ParamMethod{
    @Override
    public ParamValueType getType() {
        return ParamValueType.SEQ;
    }

    public String getDataName() {
        return this.inputParam1;
    }

    public String getAliasName() {
        return this.inputParam2;
    }
}
