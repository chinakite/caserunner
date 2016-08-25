/**
 * 
 */
package com.ideamoment.caserunner.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ideamoment.caserunner.model.dict.CommandExecuteResultType;

/**
 * @author Chinakite
 *
 */
public class CaseExecuteResult {
	
	private Case caze;
	
	private Date startTime;
	
	private Date endTime;
	
	private List<CommandExecuteResult> commandResults = new ArrayList<CommandExecuteResult>();

	public Case getCaze() {
		return caze;
	}

	public void setCaze(Case caze) {
		this.caze = caze;
	}
	
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<CommandExecuteResult> getCommandResults() {
		return commandResults;
	}

	public void setCommandResults(List<CommandExecuteResult> commandResults) {
		this.commandResults = commandResults;
	}
	
	public void addCommandResult(CommandExecuteResult commandResult) {
		this.commandResults.add(commandResult);
	}
	
	public void removeCommandResult(CommandExecuteResult commandResult) {
		this.commandResults.remove(commandResult);
	}
	
	public boolean isSuccess() {
		boolean result = true;
		for(CommandExecuteResult commandResult : commandResults) {
			result = result && (commandResult.getResult() == CommandExecuteResultType.SUCCESS);
		}
		return result;
	}
}
