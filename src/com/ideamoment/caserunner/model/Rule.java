package com.ideamoment.caserunner.model;

/**
 * Created by zhangzhonghua on 2016/6/1.
 */
public class Rule {
    private String namespace;

    private String name;

    public Rule() {
    }

    public Rule(String namespace, String name) {
        this.namespace = namespace;
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
