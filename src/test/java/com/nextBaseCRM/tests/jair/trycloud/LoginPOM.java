package com.nextBaseCRM.tests.jair.trycloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {
    WebDriver driver;

    By usernameField=By.id("user");
    By passwordField=By.id("password");
    By loginButton=By.id("submit");
    By forgotPassword=By.id("lost-password");

    public LoginPOM(WebDriver driver) {
        this.driver = driver;
    }

    public void typeUserName(String userName){
        driver.findElement(usernameField).sendKeys(userName);


    }
    public void typePassword(String Password){
        driver.findElement(passwordField).sendKeys(Password);
    }
    public void clickOnLoginButton(){
        driver.findElement(loginButton).click();
    }
    public void clckOnForgotPassword(){
        driver.findElement(forgotPassword).click();
    }
}
