/**
 * 
 */
package com.ideamoment.caserunner.runner;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.ideamoment.caserunner.model.parameterize.ParamMethod;

/**
 * @author Chinakite
 *
 */
public interface RunContext {

	public String resolveValue(List<ParamMethod> paramMethods);

	public void setContext(ConcurrentHashMap context);
}
