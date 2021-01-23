package com.nextBaseCRM.tests.jamila.userStory1;

import com.nextBaseCRM.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserStory1_ForgetPassword {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        // go to website:
       // driver.get();
    }
}
