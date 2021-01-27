package com.nextBaseCRM.tests.jair.tryCloudFindBy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC_Login extends TestBase{
    @Test
    public void loginTest(){
        LoginPagePOM login = new LoginPagePOM();
        PageFactory.initElements(driver,login);
        login.LogIn("user23","Userpass123");

    }

}
//user23
//Userpass123

