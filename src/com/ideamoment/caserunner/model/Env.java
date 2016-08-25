package com.ideamoment.caserunner.model;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import com.ideamoment.caserunner.model.dict.BrowserType;
import com.ideamoment.caserunner.model.dict.EnvType;
import com.ideamoment.caserunner.model.dict.OSType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.ideamoment.caserunner.CaseRunnerException;
import com.ideamoment.caserunner.CaseRunnerExceptionCode;

/**
 * Created by zhangzhonghua on 2016/6/8.
 */
public class Env {

    private OSType os;

    private BrowserType browser;
    
    private WebDriver driver;
    
    private EnvType type;
    
    protected String address;
    
    protected String port;
    
    protected DesiredCapabilities desiredCap = null;

    public OSType getOs() {
        return os;
    }

    public void setOs(OSType os) {
        this.os = os;
    }

    public BrowserType getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserType browser) {
        this.browser = browser;
    }
    
    /**
     * @return the type
     */
    public EnvType getType() {
        return type;
    }
    
    /**
     * @param type the type to set
     */
    public void setType(EnvType type) {
        this.type = type;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * @return the port
     */
    public String getPort() {
        return port;
    }
    
    /**
     * @param port the port to set
     */
    public void setPort(String port) {
        this.port = port;
    }

    public WebDriver getWebDriver(){
        if(driver != null)
            return driver;
        
        if(type == EnvType.LOCAL) {
            if(browser == BrowserType.CHROME) {
                System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
                driver = new ChromeDriver();
            }else if(browser == BrowserType.FIREFOX) {
                File pathBinary = new File("D:\\Mozilla Firefox\\firefox.exe");
                FirefoxBinary bin = new FirefoxBinary(pathBinary);
                FirefoxProfile firefoxPro = new FirefoxProfile();
                driver = new FirefoxDriver(bin, firefoxPro);
            }
        }else{
            if(BrowserType.CHROME == browser) {
                System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
                desiredCap = DesiredCapabilities.chrome();
            }
            
            try {
                driver = new RemoteWebDriver(new URL("http://" + address + ":" + port + "/wd/hub"), desiredCap);
            } catch (MalformedURLException e) {
                e.printStackTrace();
                throw new CaseRunnerException(CaseRunnerExceptionCode.CONNECT_HUB_ERROR, String.format("Connect to remote hub error [{0}:{1}]", address, port));
            }
        }
        
        
        return driver;
    }
}
