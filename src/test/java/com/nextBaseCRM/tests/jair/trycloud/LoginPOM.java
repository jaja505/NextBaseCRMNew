package com.nextBaseCRM.tests.jair.trycloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {
    private static WebDriver driver;


    static By usernameField=By.id("user");
    static By passwordField=By.id("password");
    static By loginButton=By.id("submit");
    static By forgotPassword=By.id("lost-password");

    //public LoginPOM(WebDriver driver) {
     //   this.driver = driver;
    //}

    public static void typeUserName(String userName){
        driver.findElement(usernameField).sendKeys(userName);


    }
    public static void typePassword(String Password){
        driver.findElement(passwordField).sendKeys(Password);
    }
    public static void clickOnLoginButton(){
        driver.findElement(loginButton).click();
    }
    public void clckOnForgotPassword(){
        driver.findElement(forgotPassword).click();
    }
}
