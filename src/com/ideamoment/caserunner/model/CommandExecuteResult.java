package com.ideamoment.caserunner.model;

/**
 * Created by zhangzhonghua on 2016/6/8.
 */
public class CommandExecuteResult {
    private String statusCode;

    private String result;

    private String message;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
