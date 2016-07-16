package com.ideamoment.caserunner.runner;

import com.ideamoment.caserunner.model.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.util.List;

/**
 * Created by zhangzhonghua on 2016/6/1.
 */
public class LocalCaseRunner implements CaseRunner {

    WebDriver driver;

    public void run(Env env, Case caze) {
        BrowserType browser = env.getBrowser();

        if(browser == BrowserType.CHROME) {
            System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
            driver =  new ChromeDriver();
        }else if(browser == BrowserType.FIREFOX) {
            File pathBinary = new File("D:\\Mozilla Firefox\\firefox.exe");
            FirefoxBinary bin = new FirefoxBinary(pathBinary);
            FirefoxProfile firefoxPro = new FirefoxProfile();

            driver =  new FirefoxDriver(bin, firefoxPro);
        }

        List<Command> commands = caze.getCommands();
        for(Command command : commands) {
            if(command.getType() == CommandType.GET
                    || command.getType() == CommandType.ASSERT
                    || command.getType() == CommandType.INPUT
                    || command.getType() == CommandType.CLICK
                    || command.getType() == CommandType.WAIT) {
                CommandExecuteResult result = command.execute(driver);
                if(result != null && result.getResult().equals("success")) {
                    System.out.println("YES");
                }else{
                    System.out.println("Fuck!");
                }
            }
        }

//        driver.quit();
    }
}
