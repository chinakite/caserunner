/**
 * 
 */
package com.ideamoment.caserunner.runner;

import java.util.List;

import com.ideamoment.caserunner.model.parameterize.ParamMethod;

/**
 * @author Chinakite
 *
 */
public interface RunContext {
	public String resolveValue(List<ParamMethod> paramMethods);
}
