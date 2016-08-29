package com.ideamoment.caserunner.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.ideamoment.caserunner.model.BinaryAssertCommand;
import com.ideamoment.caserunner.model.BinaryPartStatement;
import com.ideamoment.caserunner.model.Case;
import com.ideamoment.caserunner.model.CaseFile;
import com.ideamoment.caserunner.model.Command;
import com.ideamoment.caserunner.model.ExistsAssertCommand;
import com.ideamoment.caserunner.model.GetCommand;
import com.ideamoment.caserunner.model.InputCommand;
import com.ideamoment.caserunner.model.LogicAssertCommand;
import com.ideamoment.caserunner.model.ShownAssertCommand;
import com.ideamoment.caserunner.model.ValueMethod;
import com.ideamoment.caserunner.model.dict.BinaryOp;
import com.ideamoment.caserunner.model.dict.BinaryPartType;
import com.ideamoment.caserunner.model.dict.LogicConditionType;
import com.ideamoment.caserunner.model.dict.MethodType;
import com.ideamoment.caserunner.model.parameterize.ParamValueType;
import com.ideamoment.caserunner.model.parameterize.PropertyMethod;
import com.ideamoment.caserunner.model.parameterize.RandomMethod;
import com.ideamoment.caserunner.model.parameterize.ReferenceMethod;
import com.ideamoment.caserunner.model.parameterize.SequenceMethod;
import com.ideamoment.caserunner.model.parameterize.UniqueMethod;

/**
 * Created by zhangzhonghua on 2016/6/6.
 */
public class TestCaseFileParser {
    @Test
    public void testParse() {
        File file = new File("D:\\gitrepos\\caserunner\\test\\com\\ideamoment\\caserunner\\testcase2.icr");
//        File file = new File("E:\\iWorkspace\\java\\caserunner\\test\\com\\ideamoment\\caserunner\\testcase2.icr");
        try {
            FileInputStream source = new FileInputStream(file);
            CaseFileParser parser = new CaseFileParser();
            CaseFile casefile = parser.parse(source);

            assertEquals(1, casefile.getGroups().size());
            assertEquals(3, casefile.getCases().size());

            Map<String, Case> cases = casefile.getCases();

            Case loginPageCase = cases.get("openLoginPage");
            assertEquals(2, loginPageCase.getCommands().size());
            List<Command> loginPageCommands = loginPageCase.getCommands();
            assertEquals(5000, ((GetCommand)loginPageCommands.get(0)).getTimeout());

            Case loginCase = cases.get("login");

            assertEquals("login", loginCase.getName());

            List<Command> loginCommands = loginCase.getCommands();

            ExistsAssertCommand existsCommand = (ExistsAssertCommand)loginCommands.get(0);
            assertEquals("#freename", existsCommand.getTarget());

            Case writeEmailCase = cases.get("writeEmail");
            assertEquals(1, writeEmailCase.getDepends().size());
            assertEquals("login", writeEmailCase.getDepends().get(0));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAssertParse() {
        File file = new File("D:\\gitrepos\\caserunner\\test\\com\\ideamoment\\caserunner\\testcase2.icr");
        try {
            FileInputStream source = new FileInputStream(file);
            CaseFileParser parser = new CaseFileParser();
            CaseFile casefile = parser.parse(source);

            Map<String, Case> cases = casefile.getCases();

            Case assertCase = cases.get("assertResult");
            List<Command> assertCommands = assertCase.getCommands();
            assertEquals(6, assertCommands.size());

            {
                Command command0 = assertCommands.get(0);
                assertTrue(command0 instanceof ShownAssertCommand);
                ShownAssertCommand shownCommand = (ShownAssertCommand)command0;
                assertEquals(".freeError", shownCommand.getTarget());
            }

            {
                Command command1 = assertCommands.get(1);
                assertTrue(command1 instanceof ExistsAssertCommand);
                ExistsAssertCommand existsCommand = (ExistsAssertCommand)command1;
                assertEquals(".freeError .tip11", existsCommand.getTarget());
            }

            {
                Command command2 = assertCommands.get(2);
                assertTrue(command2 instanceof BinaryAssertCommand);
                BinaryAssertCommand binaryCommand = (BinaryAssertCommand)command2;
                assertEquals(BinaryOp.EQ, binaryCommand.getOp());
                BinaryPartStatement left = binaryCommand.getLeft();
                assertEquals(".freeError .tip11", left.getTarget());
                assertEquals(BinaryPartType.METHOD, left.getType());
                ValueMethod valueMethod = left.getValueMethod();
                assertNotNull(valueMethod);
                assertEquals(MethodType.CSS, valueMethod.getMethodType());
                assertEquals("color", valueMethod.getParam());
                BinaryPartStatement right = binaryCommand.getRight();
                assertEquals(BinaryPartType.STRING, right.getType());
                assertEquals("#e32929", right.getStrValue());
            }

            {
                Command command3 = assertCommands.get(3);
                assertTrue(command3 instanceof LogicAssertCommand);
                LogicAssertCommand logicCommand1 = (LogicAssertCommand)command3;
                assertEquals(LogicConditionType.AND, logicCommand1.getLogicType());
                BinaryPartStatement left = (BinaryPartStatement)logicCommand1.getLeft();
                assertEquals(BinaryPartType.ASSERT_COMMAND, left.getType());
                assertTrue(left.getAssertCommand() instanceof BinaryAssertCommand);
                BinaryAssertCommand leftBinCommand = (BinaryAssertCommand)left.getAssertCommand();
                assertEquals(BinaryOp.EQ, leftBinCommand.getOp());
                BinaryPartStatement leftBinStatement = (BinaryPartStatement)leftBinCommand.getLeft();
                assertEquals(".freeError .tip11", leftBinStatement.getTarget());
                assertEquals(BinaryPartType.METHOD, leftBinStatement.getType());
                ValueMethod valueMethod = leftBinStatement.getValueMethod();
                assertNotNull(valueMethod);
                assertEquals(MethodType.CSS, valueMethod.getMethodType());
                assertEquals("color", valueMethod.getParam());
                BinaryPartStatement rightBinStatement = leftBinCommand.getRight();
                assertEquals(BinaryPartType.STRING, rightBinStatement.getType());
                assertEquals("#e32929", rightBinStatement.getStrValue());
                BinaryPartStatement right = (BinaryPartStatement)logicCommand1.getRight();
                assertEquals(BinaryPartType.ASSERT_COMMAND, right.getType());
                assertTrue(right.getAssertCommand() instanceof ShownAssertCommand);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInputParse() {
        File file = new File("D:\\gitrepos\\caserunner\\test\\com\\ideamoment\\caserunner\\testcase2.icr");
//        File file = new File("E:\\iWorkspace\\java\\caserunner\\test\\com\\ideamoment\\caserunner\\testcase2.icr");
        try {
            FileInputStream source = new FileInputStream(file);
            CaseFileParser parser = new CaseFileParser();
            CaseFile casefile = parser.parse(source);

            Map<String, Case> cases = casefile.getCases();

            Case inputCase = cases.get("inputSth");
            List<Command> inputCommands = inputCase.getCommands();
            assertEquals(4, inputCommands.size());

            {
                Command command0 = inputCommands.get(0);
                assertTrue(command0 instanceof InputCommand);
                InputCommand inputCommand0 = (InputCommand)command0;
                assertEquals("aaabbbccc", inputCommand0.getValue());
                assertEquals("#freename", inputCommand0.getTarget());
            }

            {
                Command command1 = inputCommands.get(1);
                assertTrue(command1 instanceof InputCommand);
                InputCommand inputCommand1 = (InputCommand)command1;
                assertEquals(2, inputCommand1.getParamMethods().size());
                assertEquals(ParamValueType.SEQ, ((SequenceMethod)inputCommand1.getParamMethods().get(0)).getType());
                assertEquals("user", ((SequenceMethod)inputCommand1.getParamMethods().get(0)).getDataName());
                assertEquals("user2", ((SequenceMethod)inputCommand1.getParamMethods().get(0)).getAliasName());
                assertEquals(ParamValueType.PROP, ((PropertyMethod)inputCommand1.getParamMethods().get(1)).getType());
                assertEquals("name", ((PropertyMethod)inputCommand1.getParamMethods().get(1)).getInputParam1());
            }
            
            {
                Command command2 = inputCommands.get(2);
                assertTrue(command2 instanceof InputCommand);
                InputCommand inputCommand2 = (InputCommand)command2;
                assertEquals(2, inputCommand2.getParamMethods().size());
                assertEquals(ParamValueType.UNIQUE, ((UniqueMethod)inputCommand2.getParamMethods().get(0)).getType());
                assertEquals("user", ((UniqueMethod)inputCommand2.getParamMethods().get(0)).getDataName());
                assertEquals("user4", ((UniqueMethod)inputCommand2.getParamMethods().get(0)).getAliasName());
                assertEquals(ParamValueType.RAND, ((RandomMethod)inputCommand2.getParamMethods().get(1)).getType());
                assertEquals("address", ((RandomMethod)inputCommand2.getParamMethods().get(1)).getInputParam1());
                assertEquals("user4_address1", ((RandomMethod)inputCommand2.getParamMethods().get(1)).getInputParam2());
            }
            
            {
                Command command3 = inputCommands.get(3);
                assertTrue(command3 instanceof InputCommand);
                InputCommand inputCommand3 = (InputCommand)command3;
                assertEquals(2, inputCommand3.getParamMethods().size());
                assertEquals(ParamValueType.REF, ((ReferenceMethod)inputCommand3.getParamMethods().get(0)).getType());
                assertEquals("user3", ((ReferenceMethod)inputCommand3.getParamMethods().get(0)).getInputParam1());
                assertEquals(ParamValueType.PROP, ((PropertyMethod)inputCommand3.getParamMethods().get(1)).getType());
                assertEquals("password", ((PropertyMethod)inputCommand3.getParamMethods().get(1)).getInputParam1());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
