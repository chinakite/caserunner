package com.ideamoment.caserunner.model;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by zhangzhonghua on 2016/6/6.
 */
public class CaseFile {

    private Map<String, CaseGroup> groups = new TreeMap<String, CaseGroup>();

    private Map<String, Case> cases = new TreeMap<String, Case>();

    public void addCaseGroup(CaseGroup group) {
        groups.put(group.getName(), group);
    }

    public void addCase(Case caze) {
        cases.put(caze.getName(), caze);
    }

    public Map<String, CaseGroup> getGroups() {
        return groups;
    }

    public Map<String, Case> getCases() {
        return cases;
    }
}
