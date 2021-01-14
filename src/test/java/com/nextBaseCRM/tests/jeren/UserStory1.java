package com.nextBaseCRM.tests.jeren;

import com.nextBaseCRM.tests.esma.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class UserStory1 {
    WebDriver driver;
    @BeforeClass
    public void setupClass(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login2.nextbasecrm.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void UserStrory1() {
        ArrayList<String> userNames = new ArrayList<>(Arrays.asList("helpdesk45@cybertekschool.com",
                "helpdesk46@cybertekschool.com" ,
                "marketing45@cybertekschool.com" ,
                "marketing46@cybertekschool.com" ,
                "hr45@cybertekschool.com" ,
                "hr46@cybertekschool.com"));

        String password = "UserUser";

        for (String each : userNames) {
            WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
            username.sendKeys(each);
            WebDriverFactory.sleep(1);

            WebElement passWord = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
            passWord.sendKeys(password);
            WebDriverFactory.sleep(1);

            WebElement rememberMe = driver.findElement(By.xpath("//input[@id='USER_REMEMBER']"));
            rememberMe.click();
            WebDriverFactory.sleep(1);

            WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
            loginButton.click();

            WebElement personFace = driver.findElement(By.xpath("//div[@id='user-block']"));

            personFace.click();
            WebDriverFactory.sleep(1);

            WebElement logout = driver.findElement(By.xpath("//span[text()='Log out']"));
            logout.click();
            WebDriverFactory.sleep(1);
             driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).clear();

        }
    }

    @AfterClass
    public void teardownClass(){
        System.out.println("Well done");
        driver.close();
    }
}
