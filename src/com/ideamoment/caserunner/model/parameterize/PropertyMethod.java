package com.ideamoment.caserunner.model.parameterize;

/**
 * Created by zhangzhonghua on 2016/8/26.
 */
public class PropertyMethod extends AbstractParamMethod implements ParamMethod{

    @Override
    public ParamValueType getType() {
        return ParamValueType.PROP;
    }

}
