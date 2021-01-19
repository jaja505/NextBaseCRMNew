package com.nextBaseCRM.tests.esma.UserStory6;

import com.nextBaseCRM.Utilities.LogIn_LogOut_CRM;
import com.nextBaseCRM.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClockInClockOut {
    WebDriver driver;
    int i;
    @BeforeMethod
    public void setUpClass(){
        driver= WebDriverFactory.getDriver("chrome");
       LogIn_LogOut_CRM.login(Credentials.getUserNameHR().get(i++),Credentials.getPassWord(),driver);
    }
    @Test
    public void clockIn(){
        WebElement userNameButton = driver.findElement(By.xpath("//span[@id='timeman-right']"));
        userNameButton.click();
        WebDriverFactory.sleep(3);
        WebElement clockInButton = driver.findElement(By.xpath("//span[contains(@class,'webform-small-button tm-popup')]"));
        clockInButton.click();
        WebDriverFactory.sleep(2);

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
