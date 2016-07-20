package com.ideamoment.caserunner.parser;

import com.ideamoment.caserunner.model.*;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

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
}
