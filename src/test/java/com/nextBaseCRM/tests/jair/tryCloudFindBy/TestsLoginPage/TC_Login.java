package com.nextBaseCRM.tests.jair.tryCloudFindBy.TestsLoginPage;

import com.nextBaseCRM.tests.jair.tryCloudFindBy.TestBase;
import com.nextBaseCRM.tests.jair.tryCloudFindBy.TestsLoginPage.LoginPagePOM;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC_Login extends TestBase {
    @Test
    public void loginTest() throws InterruptedException {
        LoginPagePOM login = new LoginPagePOM();
        PageFactory.initElements(driver,login);
        login.LogIn("user23","Userpass123");
       // login.inputUserName.sendKeys("user23");

    }

}
//user23
//Userpass123

