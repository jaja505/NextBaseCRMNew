package com.nextBaseCRM.tests.jair.tryCloudFindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePOM {
    @FindBy(id = "user")
    WebElement inputUserName;
    @FindBy(id = "password")
    WebElement inputPassword;
    @FindBy(id = "submit")
    WebElement buttonLogin;
    @FindBy(id = "lost-password")
    WebElement linkForgotPassword;

    public void LogIn(String userName,String password){
        inputUserName.sendKeys(userName);
        inputPassword.sendKeys(password);
        buttonLogin.click();

    }
    public void ForgotPassword(){
        linkForgotPassword.click();
    }



    //    By usernameField=By.id("user");
    //    By passwordField=By.id("password");
    //    By loginButton=By.id("submit");
    //    By forgotPassword=By.id("lost-password");
}
