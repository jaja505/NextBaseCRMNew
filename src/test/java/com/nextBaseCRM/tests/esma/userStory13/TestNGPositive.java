package com.nextBaseCRM.tests.esma.userStory13;

import com.nextBaseCRM.Utilities.LogInToNextBaseCRM;
import com.nextBaseCRM.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestNGPositive {
WebDriver driver;

    @BeforeMethod
    public void setUp() {
       driver= WebDriverFactory.getDriver("chrome");
        int i = 1;
        LogInToNextBaseCRM.login(Credentials.getUserNameMarketing().get(i), Credentials.getPasswordAll(),driver);
        i++;
    }

    @Test
    public void test1() {

        for (WebElement each : mainModuleButtons.mainModule(driver)) {
            Assert.assertTrue(each.isDisplayed());
        }

    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
