/**
 * 
 */
package com.ideamoment.caserunner.runner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.ideamoment.caserunner.model.BrowserType;
import com.ideamoment.caserunner.model.Case;
import com.ideamoment.caserunner.model.Command;
import com.ideamoment.caserunner.model.CommandExecuteResult;
import com.ideamoment.caserunner.model.CommandType;
import com.ideamoment.caserunner.model.Env;


/**
 * @author Chinakite
 *
 */
public class RemoteCaseRunner implements CaseRunner {

    protected String address;
    
    protected String port;
    
    /* (non-Javadoc)
     * @see com.ideamoment.caserunner.runner.CaseRunner#run(com.ideamoment.caserunner.model.Env, com.ideamoment.caserunner.model.Case)
     */
    @Override
    public void run(Env env, Case caze) {
        DesiredCapabilities desiredCap = null;
        
        if(BrowserType.CHROME == env.getBrowser()) {
            desiredCap = DesiredCapabilities.chrome();
        }

        try {
            WebDriver driver = new RemoteWebDriver(new URL("http://" + address + ":" + port + "/wd/hub"), desiredCap);
        
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
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
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

}
