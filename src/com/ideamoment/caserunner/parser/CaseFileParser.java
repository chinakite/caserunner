package com.ideamoment.caserunner.parser;

import java.io.InputStream;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.ideamoment.caserunner.model.Case;
import com.ideamoment.caserunner.model.CaseFile;
import com.ideamoment.caserunner.model.CaseGroup;
import com.ideamoment.caserunner.model.ClickCommand;
import com.ideamoment.caserunner.model.CommandType;
import com.ideamoment.caserunner.model.ExistsAssertCommand;
import com.ideamoment.caserunner.model.GetCommand;
import com.ideamoment.caserunner.model.InputCommand;
import com.ideamoment.caserunner.model.WaitCommand;
import com.ideamoment.caserunner.model.condition.Condition;
import com.ideamoment.caserunner.model.condition.ExistsCondition;
import com.ideamoment.caserunner.util.StringUtils;

/**
 * Created by zhangzhonghua on 2016/6/6.
 */
public class CaseFileParser {

    public CaseFile parse(InputStream source) {
        try {
            ANTLRInputStream input = new ANTLRInputStream(source);
            IdeaCaseLexer lexer = new IdeaCaseLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            IdeaCaseParser parser = new IdeaCaseParser(tokens);
            CaseFile caseFile = new CaseFile();

            IdeaCaseParser.ParseRootContext ctx = parser.parseRoot();

            //读取group
            parseGroup(caseFile, ctx);

            //读取case
            parseCase(caseFile, ctx);

            return caseFile;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void parseCase(CaseFile caseFile, IdeaCaseParser.ParseRootContext ctx) {
        List<IdeaCaseParser.CaseStatementContext> caseStatements = ctx.caseStatement();
        for(IdeaCaseParser.CaseStatementContext caseCtx : caseStatements) {
            Case caze = new Case();
            TerminalNode caseNameNode = caseCtx.ID();
            String caseName = caseNameNode.getText();
            caze.setName(caseName);
            
            int startLine = caseCtx.getStart().getLine();
            int endLine = caseCtx.getStop().getLine();
            caze.setStartLine(startLine);
            caze.setEndLine(endLine);

            List<IdeaCaseParser.CommandStatementContext> commandCtxs = caseCtx.commandStatement();
            for(IdeaCaseParser.CommandStatementContext commandCtx : commandCtxs) {
                CommandType type = determineCommandType(commandCtx);
                switch(type) {
                    case GET : parseGetCommand(caze, commandCtx);
                        break;
                    case POST:
                        break;
                    case INPUT: parseInputCommand(caze, commandCtx);
                        break;
                    case CLICK: parseClickCommand(caze, commandCtx);
                        break;
                    case ASSERT: parseAssertCommand(caze, commandCtx);
                        break;
                    case WAIT: parseWaitCommand(caze, commandCtx);
                        break;
                    default:
                        break;
                }
            }

            caseFile.addCase(caze);
        }
    }

    private void parseAssertCommand(Case caze, IdeaCaseParser.CommandStatementContext commandCtx) {
        ExistsAssertCommand existsCommand = new ExistsAssertCommand();
        IdeaCaseParser.AssertStatementContext assertCtx = commandCtx.assertStatement();
        IdeaCaseParser.ConditionStatamentContext conditionCtx = assertCtx.conditionStatament();
        if(conditionCtx == null) {
            throw new IdeaCaseFileParserException(IdeaCaseFileParserExceptionCode.SYNTAX_ERROR, "Exists command condition is null.");
        }
        IdeaCaseParser.ExistsStatementContext existsCtx = conditionCtx.existsStatement();
        if(existsCtx != null) {
            TerminalNode targetNode = existsCtx.StringLiteral();
            String target = targetNode.getText();
            target = StringUtils.extractRealString(target);
            if(target != null) {
                existsCommand.setTarget(target);
            }else{
                throw new IdeaCaseFileParserException(IdeaCaseFileParserExceptionCode.SYNTAX_ERROR, "Exists command target is null.");
            }
        }

        int startLine = commandCtx.getStart().getLine();
        int stopLine = commandCtx.getStop().getLine();
        existsCommand.setStartLine(startLine);
        existsCommand.setEndLine(stopLine);
        
        caze.addCommand(existsCommand);
    }

    private void parseClickCommand(Case caze, IdeaCaseParser.CommandStatementContext commandCtx) {
        ClickCommand clickCommand = new ClickCommand();
        
        int startLine = commandCtx.getStart().getLine();
        int stopLine = commandCtx.getStop().getLine();
        clickCommand.setStartLine(startLine);
        clickCommand.setEndLine(stopLine);
        
        IdeaCaseParser.ClickStatementContext clickCtx = commandCtx.clickStatement();
        if(clickCtx != null) {
            TerminalNode targetNode = clickCtx.StringLiteral();
            String target = targetNode.getText();
            target = StringUtils.extractRealString(target);
            if(target != null) {
                clickCommand.setTarget(target);
            }else{
                throw new IdeaCaseFileParserException(IdeaCaseFileParserExceptionCode.SYNTAX_ERROR, "Click command target is null.");
            }
            
            IdeaCaseParser.WhenStatementContext whenCtx = clickCtx.whenStatement();
            if(whenCtx != null) {
                IdeaCaseParser.ConditionStatamentContext conditionCtx = whenCtx.conditionStatament();
                ExistsCondition condition = new ExistsCondition();
                if(conditionCtx != null) {
                    IdeaCaseParser.ExistsStatementContext existsCtx = conditionCtx.existsStatement();
                    if(existsCtx != null) {
                        TerminalNode existsTargetNode = existsCtx.StringLiteral();
                        String existsTarget = existsTargetNode.getText();
                        existsTarget = StringUtils.extractRealString(existsTarget);
                        condition.setTarget(existsTarget);
                    }
                }else{
                    throw new IdeaCaseFileParserException(IdeaCaseFileParserExceptionCode.SYNTAX_ERROR, "When statement condition is null.");
                }

                IdeaCaseParser.TimeoutStatementContext timeoutCtx = whenCtx.timeoutStatement();
                TerminalNode timeoutNumNode = timeoutCtx.NUMBER();
                if(timeoutNumNode != null) {
                    String timeoutNumStr = timeoutNumNode.getText();
                    int timeoutNum = Integer.parseInt(timeoutNumStr);
                    condition.setTimeout(timeoutNum);
                }

                clickCommand.setCondition(condition);
            }
        }

        caze.addCommand(clickCommand);
    }

    private void parseGetCommand(Case caze, IdeaCaseParser.CommandStatementContext commandCtx) {
        TerminalNode node = commandCtx.getStatement().StringLiteral();
        String url = node.getText();
        url = StringUtils.extractRealString(url);
        GetCommand getCommand = new GetCommand();
        getCommand.setType(CommandType.GET);
        getCommand.setUrl(url);
        
        int startLine = commandCtx.getStart().getLine();
        int stopLine = commandCtx.getStop().getLine();
        getCommand.setStartLine(startLine);
        getCommand.setEndLine(stopLine);
        
        caze.addCommand(getCommand);
    }

    private void parseWaitCommand(Case caze, IdeaCaseParser.CommandStatementContext commandCtx) {
        WaitCommand waitCommand = new WaitCommand();
        waitCommand.setType(CommandType.WAIT);

        IdeaCaseParser.WaitStatementContext waitCtx = commandCtx.waitStatement();
        TerminalNode numNode = waitCtx.NUMBER();
        TerminalNode resp = waitCtx.RESPONSE();
        if(numNode != null) {
            String numStr = numNode.getText();
            if(numStr != null) {
                Integer num = Integer.parseInt(numStr);
                waitCommand.setWaitSeconds(num);
            }else{
                throw new IdeaCaseFileParserException(IdeaCaseFileParserExceptionCode.SYNTAX_ERROR, "Waiting time is null.");
            }
        }else if(resp != null){
            waitCommand.setWaitResponse(true);
            IdeaCaseParser.TimeoutStatementContext timeoutCtx = waitCtx.timeoutStatement();
            if(timeoutCtx != null) {
                TerminalNode timeoutNode = timeoutCtx.NUMBER();
                String timeoutStr = timeoutNode.getText();
                Integer timeout = Integer.parseInt(timeoutStr);
                waitCommand.setTimeoutSeconds(timeout);
            }
        }

        int startLine = commandCtx.getStart().getLine();
        int stopLine = commandCtx.getStop().getLine();
        waitCommand.setStartLine(startLine);
        waitCommand.setEndLine(stopLine);
        
        caze.addCommand(waitCommand);
    }

    private void parseInputCommand(Case caze, IdeaCaseParser.CommandStatementContext commandCtx) {
        InputCommand inputCommand = new InputCommand();
        IdeaCaseParser.InputStatementContext inputCommandCtx = commandCtx.inputStatement();
        IdeaCaseParser.InputValueContext inputValueCtx = inputCommandCtx.inputValue();
        TerminalNode inputValueNode = inputValueCtx.StringLiteral();
        String inputValue = inputValueNode.getText();
        IdeaCaseParser.InputToContext inputToCtx = inputCommandCtx.inputTo();
        TerminalNode inputTargetNode = inputToCtx.StringLiteral();
        String inputTarget = inputTargetNode.getText();
        if(inputValue != null && inputTarget != null) {
            String value = StringUtils.extractRealString(inputValue);
            String target = StringUtils.extractRealString(inputTarget);
            if(target != null) {
                inputCommand.setTarget(target);
            }else{
                throw new IdeaCaseFileParserException(IdeaCaseFileParserExceptionCode.SYNTAX_ERROR, "Input command target is null.");
            }
            if(target != null) {
                inputCommand.setValue(value);
            }else{
                throw new IdeaCaseFileParserException(IdeaCaseFileParserExceptionCode.SYNTAX_ERROR, "Input command value is null.");
            }
        }

        int startLine = commandCtx.getStart().getLine();
        int stopLine = commandCtx.getStop().getLine();
        inputCommand.setStartLine(startLine);
        inputCommand.setEndLine(stopLine);
        
        caze.addCommand(inputCommand);
    }

    private CommandType determineCommandType(IdeaCaseParser.CommandStatementContext commandCtx) {
        if(commandCtx.getStatement() != null) {
            return CommandType.GET;
        }else if(commandCtx.waitStatement() != null){
            return CommandType.WAIT;
        }else  if(commandCtx.assertStatement() != null){
            return CommandType.ASSERT;
        }else  if(commandCtx.inputStatement() != null){
            return CommandType.INPUT;
        }else  if(commandCtx.clickStatement() != null){
            return CommandType.CLICK;
        }
        return null;
    }

    private void parseGroup(CaseFile caseFile, IdeaCaseParser.ParseRootContext ctx) {
        List<IdeaCaseParser.GroupStatementContext> groupStatements = ctx.groupStatement();
        for(IdeaCaseParser.GroupStatementContext groupCtx : groupStatements) {
            CaseGroup group = new CaseGroup();
            TerminalNode groupNameNode = groupCtx.ID();
            String groupName = groupNameNode.getText();
            group.setName(groupName);
            IdeaCaseParser.GroupBodyContext groupBodyCtx = groupCtx.groupBody();
            List<TerminalNode> caseIds = groupBodyCtx.ID();
            for(TerminalNode caseIdNode : caseIds) {
                String caseId = caseIdNode.getText();
                group.addCaseId(caseId);
            }
            caseFile.addCaseGroup(group);
        }
    }

}
