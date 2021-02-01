package com.tryCloud.tests.mypeer.mayasa;

import com.tryCloud.Utilities.LogIn_LogOut_CRM;
import com.tryCloud.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class userstory1 {
    WebDriver driver;
    @BeforeClass
    public void setUpClass() {
        driver = WebDriverFactory.getDriver("chrome");        //new ChromeDriver();
        driver.get("https://login2.nextbasecrm.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void UserStory1() throws InterruptedException {
        ArrayList<String> userNames = new ArrayList<>(Arrays.asList("helpdesk45@cybertekschool.com",
                "helpdesk46@cybertekschool.com" ,
                "marketing45@cybertekschool.com" ,
                "marketing46@cybertekschool.com" ,
                "hr45@cybertekschool.com" ,
                "hr46@cybertekschool.com"));

        String password = "UserUser";
        for (String each : userNames) {


            WebElement userName = driver.findElement(By.name("USER_LOGIN"));
            userName.sendKeys(each);
            Thread.sleep(2000);


            WebElement passWord = driver.findElement(By.name("USER_PASSWORD"));
            passWord.sendKeys(password);
            Thread.sleep(2);


            WebElement rememberMe = driver.findElement(By.xpath("//label[@class='login-item-checkbox-label']"));
            rememberMe.click();
            Thread.sleep(2);


            WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
            loginButton.click();

            WebElement taskButton = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
            taskButton.click();
            Thread.sleep(1);


LogIn_LogOut_CRM.logOut(driver);

            driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).clear();

            Thread.sleep(1);




        }
    }

    @AfterClass
    public void tearDownClass() {
        driver.close();

    }

        
}

