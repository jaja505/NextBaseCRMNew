package com.nextBaseCRM.Utilities;

import com.nextBaseCRM.tests.esma.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class LogIn_LogOut_CRM {
    public static int i;
    //***this class is for loging in with username and password. It returns a WEBDRIVER so that we can use later on***
//    public static void login(String userName, String password,WebDriver driver) {
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.get("https://login2.nextbasecrm.com/");
//        driver.findElement(By.className("login-inp")).clear();
//        driver.findElement(By.cssSelector("input[name='USER_LOGIN']")).sendKeys(userName);
//        com.nextBaseCRM.tests.esma.utilities.WebDriverFactory.sleep(3);
//        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
//
//        WebDriverFactory.sleep(3);
//        driver.findElement(By.cssSelector("input[value='Log In']")).click();
//
//
//    }


    public static void login(String userName, String password, WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");

        WebElement userNameBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userNameBox.clear();
        userNameBox.sendKeys(userName);

        WebElement passWordBox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passWordBox.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();




    }




    public static void logOut(WebDriver driver) {
        driver.findElement(By.className("user-name")).click();//getting to the logout link
        WebDriverFactory.sleep(2);
        driver.findElement(By.linkText("Log out")).click();//the actual log out link
        WebDriverFactory.sleep(2);//sleep for smoother run

        driver.findElement(By.className("login-inp")).clear();

        //driver.quit();
    }


}
