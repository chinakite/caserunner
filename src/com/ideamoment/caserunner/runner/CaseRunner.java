/**
 * 
 */
package com.ideamoment.caserunner.runner;

import com.ideamoment.caserunner.model.Case;
import com.ideamoment.caserunner.model.CaseExecuteResult;
import com.ideamoment.caserunner.model.Env;

/**
 * @author Chinakite
 *
 */
public interface CaseRunner {

    public CaseExecuteResult run(Env env, Case caze);

    public void setRunContext(RunContext runContext);

    public RunContext getRunContext();
}
