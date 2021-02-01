package com.tryCloud.tests.mypeer.inci;

import com.tryCloud.Utilities.LogIn_LogOut_CRM;
import com.tryCloud.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class UserStory8 extends LogIn_LogOut_CRM {
    WebDriver driver;

    @Test
    public void test1() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        LogIn_LogOut_CRM.login("hr45@cybertekschool.com", "UserUser", driver);
        WebElement taskModule = driver.findElement(By.xpath("//*[@id=\"bx_left_menu_menu_tasks\"]/a/span[1]"));
        Assert.assertTrue(taskModule.isDisplayed(), "it is not displayed opppsss");
        Thread.sleep(2000);
        driver.findElement(By.className("user-name")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Log out")).click();
        Thread.sleep(2000);
    }

    @Test
    public void test2() throws InterruptedException {
        LogIn_LogOut_CRM.login("marketing45@cybertekschool.com", "UserUser", driver);
        WebElement taskModule = driver.findElement(By.xpath("//*[@id=\"bx_left_menu_menu_tasks\"]/a/span[1]"));
        Assert.assertTrue(taskModule.isDisplayed(), "oppppsssss");
        logOut(driver);


    }

    @AfterClass
    public void finish() {
        driver.close();
    }
}

