package com.nextBaseCRM.tests.jamila;

import com.nextBaseCRM.Utilities.AutomationTest;
import com.nextBaseCRM.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class UserCanLoginPos extends AutomationTest {
    public static void main(String[] args) throws InterruptedException {
        // setup driver http://login2.nextbasecrm.com/
        WebDriver driver=driverSetUp("chrome");
        driver.get("http://login2.nextbasecrm.com/");

        // enter user name Username:helpdesk45@cybertekschool.com    tagName[attribute='value']
         driver.findElement(By.cssSelector("input[name='USER_LOGIN']")).sendKeys("helpdesk45@cybertekschool.com");
        //enter password Password:UserUser
        driver.findElement(By.cssSelector("input[name='USER_PASSWORD']")).sendKeys("UserUser");
        driver.findElement(By.cssSelector(".login-btn")).click();

        Thread.sleep(2000);
        // verify login successful
        String expectedTitle="(9) Portal";
        String actualTitle=driver.getTitle();

        testResultEquals(expectedTitle,actualTitle);
        driver.close();
    }
}
