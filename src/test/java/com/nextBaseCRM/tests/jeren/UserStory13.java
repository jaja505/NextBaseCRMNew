package com.nextBaseCRM.tests.jeren;

import com.nextBaseCRM.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserStory13 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://nextbasecrm.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Login")).click();
        //Thread.sleep(3000);

        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Login']"));
        userName.sendKeys("helpdesk45@cybertekschool.com");
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("UserUser");
        WebElement rememberMe = driver.findElement(By.id("USER_REMEMBER"));
        rememberMe.click();
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
        WebElement profile = driver.findElement(By.id("user-block"));
        profile.click();
        WebElement logOut = driver.findElement(By.linkText("Log out"));
        logOut.click();
//        Thread.sleep(5000);
//        String expectedResult = "Authorization";
//        String actualResult = driver.getTitle();
//
//        if (actualResult.equalsIgnoreCase(expectedResult)){
//            System.out.println("PASSED!");
//        }else {
//            System.out.println("Failed!!!");
//            System.out.println("expectedResult = " + expectedResult);
//            System.out.println("actualResult = " + actualResult);
//        }


    }
}
