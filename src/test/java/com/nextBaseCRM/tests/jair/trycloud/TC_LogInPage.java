package com.nextBaseCRM.tests.jair.trycloud;

import com.nextBaseCRM.Utilities.WebDriverFactory;
import com.nextBaseCRM.tests.jair.TestBase;
import com.nextBaseCRM.tests.jair.trycloud.LoginPOM;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_LogInPage extends TestBase {

   // WebDriver driver;



    @Test
    public void verifyValidLogin() {
        driver.get("https://app.trycloud.net/index.php/login");
        //LoginPOM login = new LoginPOM(driver);
        LoginPOM.typeUserName("user23");
        LoginPOM.typePassword("Userpass123");
        LoginPOM.clickOnLoginButton();
    }
}
