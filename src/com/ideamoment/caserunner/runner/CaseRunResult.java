package com.ideamoment.caserunner.runner;

/**
 * Created by zhangzhonghua on 2016/7/19.
 */
public class CaseRunResult {

    private CaseRunResultType result;

    private String message;

    public CaseRunResultType getResult() {
        return result;
    }

    public void setResult(CaseRunResultType result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
