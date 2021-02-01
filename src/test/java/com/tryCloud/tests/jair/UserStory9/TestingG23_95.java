package com.tryCloud.tests.jair.UserStory9;

import com.tryCloud.Utilities.LogIn_LogOut_CRM;
import com.tryCloud.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestingG23_95 {
    WebDriver driver;

    @BeforeMethod
    public void setDriver(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LogIn_LogOut_CRM.login("helpdesk45@cybertekschool.com","UserUser",driver);

    }
    //1. Verify users can send events by clicking "EVENT" tab
    //with at least an event name.

    @Test
    public void TestAC1(){
        WebElement eventButton = driver.findElement(By.id("feed-add-post-form-tab-calendar"));
        eventButton.click();
        WebElement inputEventName = driver.findElement(By.id("feed-cal-event-namecal_3Jcl"));
       inputEventName.sendKeys("test");


    }

    //2. Verify users can cancle events.
    //3. Veriy users can check timers
    //4. Verify users can choose all day for the event time

}
