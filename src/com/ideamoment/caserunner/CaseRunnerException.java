package com.ideamoment.caserunner;

/**
 * Created by zhangzhonghua on 2016/7/19.
 */
public class CaseRunnerException extends RuntimeException {

    protected String code ;

    public CaseRunnerException(String code, String msg) {
        super(msg);
        this.code = code;
    }

    public CaseRunnerException(String code, String msg, Throwable t) {
        super(msg, t);
        this.code = code;
    }
}
