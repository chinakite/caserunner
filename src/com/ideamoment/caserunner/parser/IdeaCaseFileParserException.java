package com.ideamoment.caserunner.parser;

/**
 * Created by zhangzhonghua on 2016/6/7.
 */
public class IdeaCaseFileParserException extends RuntimeException {

    private String code;

    public IdeaCaseFileParserException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
