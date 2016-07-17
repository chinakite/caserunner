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
//        File file = new File("D:\\gitrepos\\caserunner\\test\\com\\ideamoment\\caserunner\\testcase1.icr");
        File file = new File("E:\\iWorkspace\\java\\caserunner\\test\\com\\ideamoment\\caserunner\\testcase1.icr");
        try {
            FileInputStream source = new FileInputStream(file);
            CaseFileParser parser = new CaseFileParser();
            CaseFile casefile = parser.parse(source);

            assertEquals(1, casefile.getGroups().size());
            assertEquals(2, casefile.getCases().size());

            Map<String, Case> cases = casefile.getCases();
            Case loginCase = cases.get("login");

            assertEquals("login", loginCase.getName());

            List<Command> commands = loginCase.getCommands();
            assertEquals(3, commands.size());
            GetCommand getCommand = (GetCommand)commands.get(0);
            assertEquals("http://pass-b2b.jcloud.com/login", getCommand.getUrl());

            WaitCommand waitCommand = (WaitCommand)commands.get(1);
            assertEquals(2000, waitCommand.getWaitSeconds());

            ExistsAssertCommand existsCommand = (ExistsAssertCommand)commands.get(2);
            assertEquals("#pin", existsCommand.getTarget());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
