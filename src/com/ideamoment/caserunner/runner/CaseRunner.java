/**
 * 
 */
package com.ideamoment.caserunner.runner;

import com.ideamoment.caserunner.model.Case;
import com.ideamoment.caserunner.model.Env;

/**
 * @author Chinakite
 *
 */
public interface CaseRunner {
    public void run(Env env, Case caze);
}
