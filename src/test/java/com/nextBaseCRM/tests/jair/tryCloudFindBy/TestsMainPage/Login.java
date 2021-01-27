package com.nextBaseCRM.tests.jair.tryCloudFindBy.TestsMainPage;

import com.nextBaseCRM.tests.jair.tryCloudFindBy.TestsLoginPage.LoginPagePOM;
import com.nextBaseCRM.tests.jair.tryCloudFindBy.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class Login extends TestBase {

    @BeforeMethod
    public void login(){
        LoginPagePOM login = new LoginPagePOM();
        PageFactory.initElements(driver,login);
        login.LogIn("user23","Userpass123");
    }
}
