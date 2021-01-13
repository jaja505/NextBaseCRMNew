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
int i;

    @BeforeMethod
    public void setUp() {
       driver= WebDriverFactory.getDriver("chrome");

        LogInToNextBaseCRM.login(Credentials.getUserNameMarketing_HR().get(i++), Credentials.getPasswordAll(),driver);

    }

    @Test
    public void testHR1() {

        for (WebElement each : mainModuleButtons.mainModule(driver)) {
            Assert.assertTrue(each.isDisplayed());
        }

    }
    @Test
    public void testHR2() {

        for (WebElement each : mainModuleButtons.mainModule(driver)) {
            Assert.assertTrue(each.isDisplayed());
        }

    }
    @Test
    public void testMAR1() {

        for (WebElement each : mainModuleButtons.mainModule(driver)) {
            Assert.assertTrue(each.isDisplayed());
        }

    }
    @Test
    public void testMAR2() {

        for (WebElement each : mainModuleButtons.mainModule(driver)) {
            Assert.assertTrue(each.isDisplayed());
        }

    }

    @AfterMethod
    public void teardown(){
        LogInToNextBaseCRM.logOut(driver);
    }
}
