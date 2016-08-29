package com.ideamoment.caserunner.parser;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.ideamoment.caserunner.config.CaseRunnerConfig;
import com.ideamoment.caserunner.model.*;
import com.ideamoment.caserunner.model.condition.*;
import com.ideamoment.caserunner.model.dict.*;
import com.ideamoment.caserunner.model.dict.CommandType;
import com.ideamoment.caserunner.model.parameterize.*;
import com.ideamoment.caserunner.result.RunResultHandler;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.ideamoment.caserunner.util.StringUtils;

/**
 * Created by zhangzhonghua on 2016/6/6.
 */
public class CaseFileParser {

    public CaseFile parse(InputStream source) {
        try {
            String handlerClasses = CaseRunnerConfig.get("caserunner.resulthandler", null);
            List<RunResultHandler> handlers = null;
            if(handlerClasses != null) {
                handlers = new ArrayList<RunResultHandler>();
                String[] handlerClassArray = handlerClasses.split(",");
                for(String clazzDef : handlerClassArray) {
                    Class c = Class.forName(clazzDef);
                    RunResultHandler handler = (RunResultHandler)c.newInstance();
                    handlers.add(handler);
                }
            }

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

    private void parseCase(CaseFile caseFile,
                           IdeaCaseParser.ParseRootContext ctx) {
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

            IdeaCaseParser.DependStatementContext dependCtx = caseCtx.dependStatement();
            if(dependCtx != null) {
                List<TerminalNode> dependIds = dependCtx.ID();
                for(TerminalNode dependNode : dependIds) {
                    String dependId = dependNode.getText();
                    caze.addDepend(dependId);
                }
            }

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

    private void parseAssertCommand(Case caze,
                                    IdeaCaseParser.CommandStatementContext commandCtx) {
        int startLine = commandCtx.getStart().getLine();
        int stopLine = commandCtx.getStop().getLine();

        IdeaCaseParser.AssertStatementContext assertCtx = commandCtx.assertStatement();

        IdeaCaseParser.LogicStatementContext logicCtx = assertCtx.logicStatement();
        if(logicCtx != null) {
            LogicAssertCommand logicAssertCommand = parseLogicAssertCommand(logicCtx);
            caze.addCommand(logicAssertCommand);
        }

        IdeaCaseParser.BinaryStatementContext binaryCtx = assertCtx.binaryStatement();
        if(binaryCtx != null) {
            BinaryAssertCommand binaryAssertCommand = parseBinaryAssertCommand(binaryCtx);
            caze.addCommand(binaryAssertCommand);
        }

        IdeaCaseParser.ConditionStatamentContext conditionCtx = assertCtx.conditionStatament();
        if(conditionCtx != null) {
            IdeaCaseParser.ExistsStatementContext existsCtx = conditionCtx.existsStatement();
            if (existsCtx != null) {
                ExistsAssertCommand existsCommand = parseExistsCommand(existsCtx);
                existsCommand.setStartLine(startLine);
                existsCommand.setEndLine(stopLine);
                existsCommand.setText(commandCtx.getText());
                caze.addCommand(existsCommand);
            }

            IdeaCaseParser.ShownStatementContext shownCtx = conditionCtx.shownStatement();
            if (shownCtx != null) {
                ShownAssertCommand shownCommand = parseShownCommand(shownCtx);
                shownCommand.setStartLine(startLine);
                shownCommand.setEndLine(stopLine);
                shownCommand.setText(commandCtx.getText());
                caze.addCommand(shownCommand);
            }
        }
    }

    private LogicAssertCommand parseLogicAssertCommand(IdeaCaseParser.LogicStatementContext logicCtx) {
        LogicAssertCommand logicAssertCommand = new LogicAssertCommand();

        TerminalNode logicOpNode = logicCtx.LOGIC_OP();
        String logicOpText = logicOpNode.getText();
        LogicConditionType logicType = null;
        if(LogicConditionConstants.AND.equals(logicOpText)) {
            logicType = LogicConditionType.AND;
        }else if(LogicConditionConstants.OR.equals(logicOpText)) {
            logicType = LogicConditionType.OR;
        }
        logicAssertCommand.setLogicType(logicType);

        List<IdeaCaseParser.ConditionStatamentContext> logicConditionCtxs = logicCtx.conditionStatament();
        if(logicConditionCtxs == null || logicConditionCtxs.size() != 2) {
            throw new IdeaCaseFileParserException(IdeaCaseFileParserExceptionCode.SYNTAX_ERROR, "Logic command conditions size is not 2.");
        }
        int logicCount = 0;
        for(IdeaCaseParser.ConditionStatamentContext logicConditionCtx : logicConditionCtxs) {
            BinaryPartStatement binaryPartStatement = new BinaryPartStatement();
            IdeaCaseParser.ExistsStatementContext existsCtx = logicConditionCtx.existsStatement();
            if(existsCtx != null) {
                ExistsAssertCommand existsCommand = parseExistsCommand(existsCtx);
                binaryPartStatement.setType(BinaryPartType.ASSERT_COMMAND);
                binaryPartStatement.setAssertCommand(existsCommand);
            }
            IdeaCaseParser.ShownStatementContext shownCtx = logicConditionCtx.shownStatement();
            if(shownCtx != null) {
                ShownAssertCommand shownCommand = parseShownCommand(shownCtx);
                binaryPartStatement.setType(BinaryPartType.ASSERT_COMMAND);
                binaryPartStatement.setAssertCommand(shownCommand);
            }

            IdeaCaseParser.BinaryStatementContext binaryCtx = logicConditionCtx.binaryStatement();
            if(binaryCtx != null) {
                BinaryAssertCommand binaryCommand = parseBinaryAssertCommand(binaryCtx);
                binaryPartStatement.setType(BinaryPartType.ASSERT_COMMAND);
                binaryPartStatement.setAssertCommand(binaryCommand);
            }

            if(logicCount == 0) {
                logicAssertCommand.setLeft(binaryPartStatement);
            }else{
                logicAssertCommand.setRight(binaryPartStatement);
            }
            logicCount++;
        }
        return logicAssertCommand;
    }

    private BinaryAssertCommand parseBinaryAssertCommand(IdeaCaseParser.BinaryStatementContext binaryCtx) {
        BinaryAssertCommand binaryCommand = new BinaryAssertCommand();
        TerminalNode binOpNode = binaryCtx.BIN_OP();
        String binOpStr = binOpNode.getText();
        BinaryOp binaryOp = null;
        if(BinaryOpConstants.EQ.equals(binOpStr)) {
            binaryOp = BinaryOp.EQ;
        }else if(BinaryOpConstants.NE.equals(binOpStr)) {
            binaryOp = BinaryOp.NE;
        }else if(BinaryOpConstants.GT.equals(binOpStr)) {
            binaryOp = BinaryOp.GT;
        }else if(BinaryOpConstants.GE.equals(binOpStr)) {
            binaryOp = BinaryOp.GE;
        }else if(BinaryOpConstants.LT.equals(binOpStr)) {
            binaryOp = BinaryOp.LT;
        }else if(BinaryOpConstants.LE.equals(binOpStr)) {
            binaryOp = BinaryOp.LE;
        }

        binaryCommand.setOp(binaryOp);

        List<IdeaCaseParser.BinaryPartStatementContext> binaryPartStatementCtxs = binaryCtx.binaryPartStatement();
        int c=0;
        for(IdeaCaseParser.BinaryPartStatementContext binaryPartStatementCtx : binaryPartStatementCtxs) {
            BinaryPartStatement binaryPartStatement = new BinaryPartStatement();
            IdeaCaseParser.MethodStatementContext methodCtx = binaryPartStatementCtx.methodStatement();
            if(methodCtx != null) {
                ValueMethod valueMethod = new ValueMethod();
                TerminalNode cssMethodNode = methodCtx.M_CSS();
                TerminalNode attrMethodNode = methodCtx.M_ATTR();
                TerminalNode textMethodNode = methodCtx.M_TEXT();
                TerminalNode valMethodNode = methodCtx.M_VAL();
                if(cssMethodNode != null) {
                    valueMethod.setMethodType(MethodType.CSS);
                }else if(attrMethodNode != null) {
                    valueMethod.setMethodType(MethodType.ATTR);
                }else if(textMethodNode != null) {
                    valueMethod.setMethodType(MethodType.TEXT);
                }else if(valMethodNode != null) {
                    valueMethod.setMethodType(MethodType.VAL);
                }
                TerminalNode paramNode = methodCtx.StringLiteral();
                if(paramNode != null) {
                    String paramStr = paramNode.getText();
                    paramStr = StringUtils.extractRealString(paramStr);
                    valueMethod.setParam(paramStr);
                }

                String target = binaryPartStatementCtx.StringLiteral().getText();
                target = StringUtils.extractRealString(target);
                binaryPartStatement.setTarget(target);
                binaryPartStatement.setType(BinaryPartType.METHOD);
                binaryPartStatement.setValueMethod(valueMethod);
            }else if(binaryPartStatementCtx.StringLiteral() != null){
                String str = binaryPartStatementCtx.StringLiteral().getText();
                str = StringUtils.extractRealString(str);
                binaryPartStatement.setType(BinaryPartType.STRING);
                binaryPartStatement.setStrValue(str);
            }else if(binaryPartStatementCtx.NUMBER() != null){
                String numberStr = binaryPartStatementCtx.NUMBER().getText();
                if(numberStr.indexOf(".") > -1) {
                    BigDecimal decimalValue = new BigDecimal(numberStr);
                    binaryPartStatement.setDecimalValue(decimalValue);
                    binaryPartStatement.setType(BinaryPartType.DECIMAL);
                }else{
                    Integer intValue = Integer.valueOf(numberStr);
                    binaryPartStatement.setIntValue(intValue);
                    binaryPartStatement.setType(BinaryPartType.INTEGER);
                }
            }

            if(c == 0) {
                binaryCommand.setLeft(binaryPartStatement);
            }else{
                binaryCommand.setRight(binaryPartStatement);
            }
            c++;
        }

        return binaryCommand;
    }

    private ExistsAssertCommand parseExistsCommand(IdeaCaseParser.ExistsStatementContext existsCtx) {
        ExistsAssertCommand existsCommand = new ExistsAssertCommand();
        TerminalNode targetNode = existsCtx.StringLiteral();
        String target = targetNode.getText();
        target = StringUtils.extractRealString(target);
        if(target != null) {
            existsCommand.setTarget(target);
        }else{
            throw new IdeaCaseFileParserException(IdeaCaseFileParserExceptionCode.SYNTAX_ERROR, "Exists command param is null.");
        }
        return existsCommand;
    }

    private ShownAssertCommand parseShownCommand(IdeaCaseParser.ShownStatementContext shownCtx) {
        ShownAssertCommand shownCommand = new ShownAssertCommand();
        TerminalNode targetNode = shownCtx.StringLiteral();
        String target = targetNode.getText();
        target = StringUtils.extractRealString(target);
        if(target != null) {
            shownCommand.setTarget(target);
        }else{
            throw new IdeaCaseFileParserException(IdeaCaseFileParserExceptionCode.SYNTAX_ERROR, "Shown command param is null.");
        }
        return shownCommand;
    }

    private void parseClickCommand(Case caze,
                                   IdeaCaseParser.CommandStatementContext commandCtx) {
        ClickCommand clickCommand = new ClickCommand();
        
        IdeaCaseParser.ClickStatementContext clickCtx = commandCtx.clickStatement();
        if(clickCtx != null) {
            TerminalNode targetNode = clickCtx.StringLiteral();
            String target = targetNode.getText();
            target = StringUtils.extractRealString(target);
            if(target != null) {
                clickCommand.setTarget(target);
            }else{
                throw new IdeaCaseFileParserException(IdeaCaseFileParserExceptionCode.SYNTAX_ERROR, "Click command param is null.");
            }
            
            IdeaCaseParser.WhenStatementContext whenCtx = clickCtx.whenStatement();
            if(whenCtx != null) {
                IdeaCaseParser.ConditionStatamentContext conditionCtx = whenCtx.conditionStatament();
                Condition condition = null;
                if(conditionCtx != null) {
                    IdeaCaseParser.ExistsStatementContext existsCtx = conditionCtx.existsStatement();
                    if(existsCtx != null) {
                        condition = new ExistsCondition();
                        TerminalNode existsTargetNode = existsCtx.StringLiteral();
                        String existsTarget = existsTargetNode.getText();
                        existsTarget = StringUtils.extractRealString(existsTarget);

                        ((ExistsCondition)condition).setTarget(existsTarget);
                    }

                    IdeaCaseParser.ShownStatementContext shownCtx = conditionCtx.shownStatement();
                    if(shownCtx != null) {
                        condition = new ShownCondition();
                        TerminalNode shownTargetNode = shownCtx.StringLiteral();
                        String shownTarget = shownTargetNode.getText();
                        shownTarget = StringUtils.extractRealString(shownTarget);
                        ((ShownCondition)condition).setTarget(shownTarget);
                    }
                }else{
                    throw new IdeaCaseFileParserException(IdeaCaseFileParserExceptionCode.SYNTAX_ERROR, "When statement condition is null.");
                }

                IdeaCaseParser.TimeoutStatementContext timeoutCtx = whenCtx.timeoutStatement();
                if(timeoutCtx != null && condition != null) {
                    TerminalNode timeoutNumNode = timeoutCtx.NUMBER();
                    String timeoutNumStr = timeoutNumNode.getText();
                    int timeoutNum = Integer.parseInt(timeoutNumStr);
                    condition.setTimeout(timeoutNum);
                }

                clickCommand.setCondition(condition);
            }
        }

        int startLine = commandCtx.getStart().getLine();
        int stopLine = commandCtx.getStop().getLine();
        clickCommand.setStartLine(startLine);
        clickCommand.setEndLine(stopLine);
        clickCommand.setText(commandCtx.getText());
        
        caze.addCommand(clickCommand);
    }

    private void parseGetCommand(Case caze,
                                 IdeaCaseParser.CommandStatementContext commandCtx) {
        TerminalNode node = commandCtx.getStatement().StringLiteral();
        String url = node.getText();
        url = StringUtils.extractRealString(url);
        GetCommand getCommand = new GetCommand();
        getCommand.setBlockType(CommandBlockType.BLOCKED);
        getCommand.setType(CommandType.GET);
        getCommand.setUrl(url);

        IdeaCaseParser.TimeoutStatementContext timeoutCtx = commandCtx.getStatement().timeoutStatement();
        if(timeoutCtx != null) {
            TerminalNode timeoutNode = timeoutCtx.NUMBER();
            String timeoutStr = timeoutNode.getText();
            int timeout = Integer.parseInt(timeoutStr);
            getCommand.setTimeout(timeout);
        }

        int startLine = commandCtx.getStart().getLine();
        int stopLine = commandCtx.getStop().getLine();
        getCommand.setStartLine(startLine);
        getCommand.setEndLine(stopLine);
        getCommand.setText(commandCtx.getText());

        caze.addCommand(getCommand);
    }

    private void parseWaitCommand(Case caze,
                                  IdeaCaseParser.CommandStatementContext commandCtx) {
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
        waitCommand.setText(commandCtx.getText());
        
        caze.addCommand(waitCommand);
    }

    private void parseInputCommand(Case caze,
                                   IdeaCaseParser.CommandStatementContext commandCtx) {
        InputCommand inputCommand = new InputCommand();
        IdeaCaseParser.InputStatementContext inputCommandCtx = commandCtx.inputStatement();

        IdeaCaseParser.InputToContext inputToCtx = inputCommandCtx.inputTo();
        TerminalNode inputTargetNode = inputToCtx.StringLiteral();
        String inputTarget = inputTargetNode.getText();
        if(inputTarget != null) {
            String target = StringUtils.extractRealString(inputTarget);
            if(target != null) {
                inputCommand.setTarget(target);
            }else{
                throw new IdeaCaseFileParserException(IdeaCaseFileParserExceptionCode.SYNTAX_ERROR, "Input command param is null.");
            }
        }

        IdeaCaseParser.InputValueContext inputValueCtx = inputCommandCtx.inputValue();
        List<IdeaCaseParser.DataParameterizeStatementContext> dataParamCtxList = inputValueCtx.dataParameterizeStatement();
        TerminalNode inputValueNode = inputValueCtx.StringLiteral();
        if(dataParamCtxList != null && dataParamCtxList.size() > 0) {
            for(IdeaCaseParser.DataParameterizeStatementContext dataParamCtx : dataParamCtxList) {
                IdeaCaseParser.DataMethodStatementContext dataMethodCtx = dataParamCtx.dataMethodStatement();
                IdeaCaseParser.DataPropertyStatementContext dataPropCtx = dataParamCtx.dataPropertyStatement();
                if(dataMethodCtx != null) {
                    TerminalNode randMethodNode = dataMethodCtx.D_RAND();
                    TerminalNode seqMethodNode = dataMethodCtx.D_SEQ();
                    TerminalNode uniqueMethodNode = dataMethodCtx.D_UNIQUE();
                    TerminalNode refMethodNode = dataMethodCtx.D_REF();
                    TerminalNode propMethodNode = dataMethodCtx.D_PROP();
                    if(randMethodNode != null) {
                        RandomMethod randMethod = new RandomMethod();
                        IdeaCaseParser.DataMethodParam1Context param1Ctx = dataMethodCtx.dataMethodParam1();
                        TerminalNode param1Node = param1Ctx.StringLiteral();
                        if(param1Node != null) {
                            randMethod.setInputParam1(StringUtils.extractRealString(param1Node.getText()));
                        }
                        IdeaCaseParser.DataMethodParam2Context param2Ctx = dataMethodCtx.dataMethodParam2();
                        TerminalNode param2Node = param2Ctx.StringLiteral();
                        if(param2Node != null) {
                            randMethod.setInputParam2(StringUtils.extractRealString(param2Node.getText()));
                        }

                        inputCommand.addParamMethod(randMethod);
                    }else if(seqMethodNode != null) {
                        SequenceMethod seqMethod = new SequenceMethod();
                        IdeaCaseParser.DataMethodParam1Context param1Ctx = dataMethodCtx.dataMethodParam1();
                        TerminalNode param1Node = param1Ctx.StringLiteral();
                        if(param1Node != null) {
                            seqMethod.setInputParam1(StringUtils.extractRealString(param1Node.getText()));
                        }
                        IdeaCaseParser.DataMethodParam2Context param2Ctx = dataMethodCtx.dataMethodParam2();
                        TerminalNode param2Node = param2Ctx.StringLiteral();
                        if(param2Node != null) {
                            seqMethod.setInputParam2(StringUtils.extractRealString(param2Node.getText()));
                        }

                        inputCommand.addParamMethod(seqMethod);
                    }else if(uniqueMethodNode != null) {
                        UniqueMethod uniqueMethod = new UniqueMethod();
                        IdeaCaseParser.DataMethodParam1Context param1Ctx = dataMethodCtx.dataMethodParam1();
                        TerminalNode param1Node = param1Ctx.StringLiteral();
                        if(param1Node != null) {
                            uniqueMethod.setInputParam1(StringUtils.extractRealString(param1Node.getText()));
                        }
                        IdeaCaseParser.DataMethodParam2Context param2Ctx = dataMethodCtx.dataMethodParam2();
                        TerminalNode param2Node = param2Ctx.StringLiteral();
                        if(param2Node != null) {
                            uniqueMethod.setInputParam2(StringUtils.extractRealString(param2Node.getText()));
                        }

                        inputCommand.addParamMethod(uniqueMethod);
                    }else if(refMethodNode != null) {
                        ReferenceMethod refMethod = new ReferenceMethod();
                        IdeaCaseParser.DataMethodParam1Context param1Ctx = dataMethodCtx.dataMethodParam1();
                        TerminalNode param1Node = param1Ctx.StringLiteral();
                        if(param1Node != null) {
                            refMethod.setInputParam1(StringUtils.extractRealString(param1Node.getText()));
                        }

                        inputCommand.addParamMethod(refMethod);
                    }else if(propMethodNode != null) {
                        PropertyMethod propMethod = new PropertyMethod();

                        IdeaCaseParser.DataMethodParam1Context param1Ctx = dataMethodCtx.dataMethodParam1();
                        TerminalNode param1Node = param1Ctx.StringLiteral();
                        if(param1Node != null) {
                            propMethod.setInputParam1(StringUtils.extractRealString(param1Node.getText()));
                        }
                        IdeaCaseParser.DataMethodParam2Context param2Ctx = dataMethodCtx.dataMethodParam2();
                        TerminalNode param2Node = param2Ctx.StringLiteral();
                        if(param2Node != null) {
                            propMethod.setInputParam2(StringUtils.extractRealString(param2Node.getText()));
                        }

                        inputCommand.addParamMethod(propMethod);
                    }
                }else if(dataPropCtx != null) {
                    TerminalNode propNameCtx = dataPropCtx.ID();
                    String propName = propNameCtx.getText();
                    PropertyMethod propMethod = new PropertyMethod();
                    propMethod.setInputParam1(propName);

                    inputCommand.addParamMethod(propMethod);
                }
            }
        }else if(inputValueNode != null) {
            String inputValue = inputValueNode.getText();
            if(inputValue != null) {
                String value = StringUtils.extractRealString(inputValue);
                if(inputCommand.getTarget() != null) {
                    inputCommand.setValue(value);
                }else{
                    throw new IdeaCaseFileParserException(IdeaCaseFileParserExceptionCode.SYNTAX_ERROR, "Input command value is null.");
                }
            }
        }

        int startLine = commandCtx.getStart().getLine();
        int stopLine = commandCtx.getStop().getLine();
        inputCommand.setStartLine(startLine);
        inputCommand.setEndLine(stopLine);
        inputCommand.setText(commandCtx.getText());
        
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

    private void parseGroup(CaseFile caseFile,
                            IdeaCaseParser.ParseRootContext ctx) {
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
