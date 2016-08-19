package com.ideamoment.caserunner.model;

import com.ideamoment.caserunner.model.dict.CommandExecuteResultType;

/**
 * Created by zhangzhonghua on 2016/6/8.
 */
public class CommandExecuteResult {
	
	private Command command;
	
    private String statusCode;

    private CommandExecuteResultType result;

    private String message;

    public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public CommandExecuteResultType getResult() {
        return result;
    }

    public void setResult(CommandExecuteResultType result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
