package com.ideamoment.caserunner.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzhonghua on 2016/6/1.
 */
public class CaseGroup {
    private String namespace;

    private String name;

    private List<String> caseIds = new ArrayList<String>();

    public CaseGroup() {
    }

    public CaseGroup(String namespace, String name) {
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

    public void addCaseId(String caseId) {
        caseIds.add(caseId);
    }

    public List<String> getCaseIds() {
        return caseIds;
    }
}
