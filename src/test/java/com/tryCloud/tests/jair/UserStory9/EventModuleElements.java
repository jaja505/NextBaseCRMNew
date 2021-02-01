package com.tryCloud.tests.jair.UserStory9;

import com.tryCloud.Utilities.LogIn_LogOut_CRM;
import com.tryCloud.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class EventModuleElements {
    WebDriver driver;




    @BeforeClass
    public void setDriver() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LogIn_LogOut_CRM.login("helpdesk45@cybertekschool.com", "UserUser", driver);




    }


}


