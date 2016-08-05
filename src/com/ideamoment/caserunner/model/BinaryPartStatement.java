package com.ideamoment.caserunner.model;

import com.ideamoment.caserunner.model.dict.BinaryPartType;

import java.math.BigDecimal;

/**
 * Created by zhangzhonghua on 2016/7/25.
 */
public class BinaryPartStatement {

    private String target;

    private BinaryPartType type;

    private String strValue;

    private BigDecimal decimalValue;

    private Integer intValue;

    private AssertCommand assertCommand;

    private ValueMethod valueMethod;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public BinaryPartType getType() {
        return type;
    }

    public void setType(BinaryPartType type) {
        this.type = type;
    }

    public String getStrValue() {
        return strValue;
    }

    public void setStrValue(String strValue) {
        this.strValue = strValue;
    }

    public BigDecimal getDecimalValue() {
        return decimalValue;
    }

    public void setDecimalValue(BigDecimal decimalValue) {
        this.decimalValue = decimalValue;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public AssertCommand getAssertCommand() {
        return assertCommand;
    }

    public void setAssertCommand(AssertCommand assertCommand) {
        this.assertCommand = assertCommand;
    }

    public ValueMethod getValueMethod() {
        return valueMethod;
    }

    public void setValueMethod(ValueMethod valueMethod) {
        this.valueMethod = valueMethod;
    }
}
