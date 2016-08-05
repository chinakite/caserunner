package com.ideamoment.caserunner.model;

import com.ideamoment.caserunner.model.dict.MethodType;

/**
 * Created by zhangzhonghua on 2016/7/25.
 */
public class ValueMethod {

    protected String param;

    protected MethodType methodType;

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public MethodType getMethodType() {
        return methodType;
    }

    public void setMethodType(MethodType methodType) {
        this.methodType = methodType;
    }
}
