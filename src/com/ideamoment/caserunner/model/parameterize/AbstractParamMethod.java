package com.ideamoment.caserunner.model.parameterize;

/**
 * Created by zhangzhonghua on 2016/8/26.
 */
public abstract class AbstractParamMethod {
    protected ParamValueType type;

    protected String inputParam1;

    protected String inputParam2;

    public abstract ParamValueType getType();

    public void setType(ParamValueType type) {
        this.type = type;
    }

    public String getInputParam1() {
        return inputParam1;
    }

    public void setInputParam1(String inputParam1) {
        this.inputParam1 = inputParam1;
    }

    public String getInputParam2() {
        return inputParam2;
    }

    public void setInputParam2(String inputParam2) {
        this.inputParam2 = inputParam2;
    }
}
