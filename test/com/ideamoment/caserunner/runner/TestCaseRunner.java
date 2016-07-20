package com.ideamoment.caserunner.runner;

import com.ideamoment.caserunner.model.*;
import com.ideamoment.caserunner.model.dict.BrowserType;
import com.ideamoment.caserunner.model.dict.EnvType;
import com.ideamoment.caserunner.parser.CaseFileParser;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhangzhonghua on 2016/6/1.
 */
public class TestCaseRunner {
    @Test
    public void testRun() {
        File file = new File("D:\\gitrepos\\caserunner\\test\\com\\ideamoment\\caserunner\\testcase2.icr");
//        File file = new File("E:\\iWorkspace\\java\\caserunner\\test\\com\\ideamoment\\caserunner\\testcase2.icr");
        try {
            FileInputStream source = new FileInputStream(file);
            CaseFileParser parser = new CaseFileParser();
            CaseFile casefile = parser.parse(source);

            Env env = new Env();
            env.setType(EnvType.LOCAL);
            env.setBrowser(BrowserType.CHROME);

            LocalCaseRunner runner = new LocalCaseRunner();
            Map<String, Case> cases = casefile.getCases();
            runner.run(env, cases.get("openLoginPage"));
            runner.run(env, cases.get("login"));
            runner.run(env, cases.get("writeEmail"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
