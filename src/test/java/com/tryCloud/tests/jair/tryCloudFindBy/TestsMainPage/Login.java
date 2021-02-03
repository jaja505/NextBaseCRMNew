package com.tryCloud.tests.jair.tryCloudFindBy.TestsMainPage;

import com.tryCloud.tests.jair.tryCloudFindBy.Driver;
import com.tryCloud.tests.jair.tryCloudFindBy.TestsLoginPage.LoginPagePOM;
import com.tryCloud.tests.jair.tryCloudFindBy.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class Login extends TestBase {

    @BeforeMethod
    public void login(){
        LoginPagePOM login = new LoginPagePOM();
        PageFactory.initElements(Driver.getDriver(),login);
        login.LogIn("user23","Userpass123");
    }
}
