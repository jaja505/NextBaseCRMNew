package com.nextBaseCRM.tests.esma.userStory13;

import com.nextBaseCRM.Utilities.LogIn_LogOut_CRM;
import com.nextBaseCRM.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HR_MarketingPositiveTest {
WebDriver driver;
int i;

    @BeforeMethod
    public void setUp() {
       driver= WebDriverFactory.getDriver("chrome");

        LogIn_LogOut_CRM.login(Credentials.getUserNameMarketing_HR().get(i++), Credentials.getPasswordAll(),driver);

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
        LogIn_LogOut_CRM.logOut(driver);
    }
}
