package com.tryCloud.tests.jair.trycloud;

import com.tryCloud.tests.jair.TestBase;
import org.testng.annotations.Test;

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
