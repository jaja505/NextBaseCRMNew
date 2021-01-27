package com.nextBaseCRM.tests.jair.UserStory9;

import com.nextBaseCRM.Utilities.LogIn_LogOut_CRM;
import com.nextBaseCRM.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
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


