package com.ideamoment.caserunner.parser;

import com.ideamoment.caserunner.model.*;
import com.ideamoment.caserunner.util.StringUtils;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;

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

            List<IdeaCaseParser.CommandStatementContext> commandCtxs = caseCtx.commandStatement();
            for(IdeaCaseParser.CommandStatementContext commandCtx : commandCtxs) {
                CommandType type = determineCommandType(commandCtx);
                switch(type) {
                    case GET : parseGetCommand(caze, commandCtx);
                        break;
                    case POST:
                        break;
                    case INPUT:
                        break;
                    case CLICK:
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
        IdeaCaseParser.ExistsStatementContext existsCtx = assertCtx.existsStatement();
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

        caze.addCommand(existsCommand);
    }

    private void parseGetCommand(Case caze, IdeaCaseParser.CommandStatementContext commandCtx) {
        TerminalNode node = commandCtx.getStatement().StringLiteral();
        String url = node.getText();
        url = StringUtils.extractRealString(url);
        GetCommand getCommand = new GetCommand();
        getCommand.setType(CommandType.GET);
        getCommand.setUrl(url);
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

        caze.addCommand(waitCommand);
    }

    private CommandType determineCommandType(IdeaCaseParser.CommandStatementContext commandCtx) {
        if(commandCtx.getStatement() != null) {
            return CommandType.GET;
        }else if(commandCtx.waitStatement() != null){
            return CommandType.WAIT;
        }else  if(commandCtx.assertStatement() != null){
            return CommandType.ASSERT;
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
