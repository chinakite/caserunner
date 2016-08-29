/**
 * 
 */
package com.ideamoment.caserunner.runner;

import java.lang.reflect.InvocationTargetException;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.ideamoment.caserunner.model.parameterize.*;
import com.ideamoment.caserunner.util.NumericUtils;
import org.apache.commons.beanutils.PropertyUtils;

/**
 * @author Chinakite
 *
 */
public class MemoryRunContext implements RunContext {

	private ConcurrentHashMap context = new ConcurrentHashMap();

	private ConcurrentHashMap<String, Integer> seqIndex = new ConcurrentHashMap<String, Integer>();

//	private ConcurrentHashMap<String, Integer> uniqueIndex = new ConcurrentHashMap<String, Integer>();

	@Override
	public String resolveValue(List<ParamMethod> paramMethods) {
		Object curObj = context;

		for(ParamMethod method : paramMethods) {
			if(method.getType() == ParamValueType.PROP) {
				PropertyMethod propMethod = (PropertyMethod)method;
				String propName = propMethod.getInputParam1();
				String aliasName = propMethod.getInputParam2();

				curObj = resolvePropertyValue(curObj, propName, aliasName);
			}else if(method.getType() == ParamValueType.RAND){
				RandomMethod randMethod = (RandomMethod)method;
				String propName = randMethod.getDataName();
				String aliasName = randMethod.getAliasName();
				curObj = resolveRandomValue(curObj, propName, aliasName);
			}else if(method.getType() == ParamValueType.SEQ){
				SequenceMethod seqMethod = (SequenceMethod)method;
				String propName = seqMethod.getDataName();
				String aliasName = seqMethod.getAliasName();

				curObj = resolveSequenceValue(curObj, propName, aliasName);
			}else if(method.getType() == ParamValueType.UNIQUE){
				UniqueMethod uniqueMethod = (UniqueMethod)method;
				String propName = uniqueMethod.getDataName();
				String aliasName = uniqueMethod.getAliasName();

				curObj = resolveSequenceValue(curObj, propName, aliasName);
			}else if(method.getType() == ParamValueType.REF){
				ReferenceMethod refMethod = (ReferenceMethod)method;
				String refName = refMethod.getInputParam1();
				curObj = context.get(refName);
			}
		}

		return curObj.toString();
	}

	@Override
	public void setContext(ConcurrentHashMap context) {
		this.context = context;
	}

	protected Object resolvePropertyValue(Object obj, String propName, String aliasName) {
		try {
			Object retObj = PropertyUtils.getProperty(obj, propName);
			if(aliasName != null) {
				context.put(aliasName, retObj);
			}
			return retObj;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}

	protected Object resolveRandomValue(Object obj, String propName, String aliasName) {
		try {
			Object retObj = PropertyUtils.getProperty(obj, propName);

			if(retObj instanceof List) {
				List listObj = (List)retObj;
				int listSize = listObj.size();
				int randNum = NumericUtils.randomNum(0, listSize-1);
				retObj = listObj.get(randNum);
			}else if(retObj instanceof Set) {
				Set setObj = (Set)retObj;
				int setSize = setObj.size();
				int randNum = NumericUtils.randomNum(0, setSize-1);
				retObj = setObj.toArray()[randNum];
			}

			if(aliasName != null) {
				context.put(aliasName, retObj);
			}
			return retObj;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}

	protected synchronized Object resolveSequenceValue(Object obj, String propName, String aliasName) {
		try {
			String seqIndexKey = obj.hashCode() + "." + propName;
			Integer index = seqIndex.get(seqIndexKey);
			if(index == null) {
				index = 0;
			}
			Object retObj = PropertyUtils.getProperty(obj, propName);

			if(retObj instanceof List) {
				List listObj = (List)retObj;
				retObj = listObj.get(index);
			}else if(retObj instanceof Set) {
				Set setObj = (Set)retObj;
				retObj = setObj.toArray()[index];
			}

			if(aliasName != null) {
				context.put(aliasName, retObj);
			}

			index++;
			seqIndex.put(seqIndexKey, index);
			return retObj;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}
}
