package com.nextBaseCRM.tests.jair;

import com.nextBaseCRM.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_LogInPage {

    WebDriver driver;

    @BeforeMethod
    public void Login() {

        driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://app.trycloud.net/index.php/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void verifyValidLogin() {
        LoginPOM login = new LoginPOM(driver);
        login.typeUserName("user23");
        login.typePassword("Userpass123");
        login.clickOnLoginButton();
    }
}
