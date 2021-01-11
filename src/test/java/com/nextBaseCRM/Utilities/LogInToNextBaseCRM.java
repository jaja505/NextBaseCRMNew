package com.nextBaseCRM.Utilities;

import com.nextBaseCRM.tests.esma.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LogInToNextBaseCRM {

//***this class is for loging in with username and password. It returns a WEBDRIVER so that we can use later on***
    public static WebDriver login(String userName, String password) {
        WebDriver driver = com.nextBaseCRM.tests.esma.utilities.WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
        driver.findElement(By.cssSelector("input[name='USER_LOGIN']")).sendKeys(userName);
        com.nextBaseCRM.tests.esma.utilities.WebDriverFactory.sleep(3);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);

        WebDriverFactory.sleep(3);
        driver.findElement(By.cssSelector("input[value='Log In']")).click();

        return driver;
    }


}
