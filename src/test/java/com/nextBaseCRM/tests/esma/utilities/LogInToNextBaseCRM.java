package com.nextBaseCRM.tests.esma.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LogInToNextBaseCRM {


    public static WebDriver login(String userName, String password) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
        driver.findElement(By.cssSelector("input[name='USER_LOGIN']")).sendKeys(userName);
        WebDriverFactory.sleep(3);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);

        WebDriverFactory.sleep(3);
        driver.findElement(By.cssSelector("input[value='Log In']")).click();

        return driver;
    }


}
