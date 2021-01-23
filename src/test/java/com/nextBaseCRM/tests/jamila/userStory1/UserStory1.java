package com.nextBaseCRM.tests.jamila.userStory1;

import com.nextBaseCRM.Utilities.LogIn_LogOut_CRM;
import com.nextBaseCRM.tests.esma.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class UserStory1 {
    public static void main(String[] args) throws InterruptedException {
        // setup driver http://login2.nextbasecrm.com

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://login2.nextbasecrm.com/");

        // enter user name Username:helpdesk45@cybertekschool.com    tagName[attribute='value']
        // verify each users can login
        ArrayList<String> validEmails = new ArrayList<>(Arrays.asList(
                "helpdesk45@cybertekschool.com",
                "helpdesk46@cybertekschool.com",
                "hr45@cybertekschool.com",
                "hr46@cybertekschool.com",
                "marketing45@cybertekschool.com",
                "marketing46@cybertekschool.com"));
        // We have a same user password for each user "UserUser"
        String passWord = "UserUser";
        // check each one by one with for each loop
        for (String each : validEmails) {
            driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys(each);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("UserUser");
            Thread.sleep(2000);

            // verify the user can click the remember me bottom
            driver.findElement(By.cssSelector("input[id='USER_REMEMBER']")).click();
            Thread.sleep(2000);
            // verify the user can click login
            //driver.findElement(By.cssSelector(".login-btn")).click();
            driver.findElement(By.xpath("//*[@value='Log In']")).click();
            Thread.sleep(2000);


            String expectedURL = "https://login2.nextbasecrm.com/stream/?login=yes";
            String actualURL = driver.getCurrentUrl();

            if (actualURL.equals(expectedURL)) {
                System.out.println("URL verification is PASSED!");

            } else {
                System.out.println("URL verification is FAILED!!!");
                System.out.println("actualTitle = " + actualURL);
                System.out.println("actualTitle = " + actualURL);
            }
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).click();// getting to the logout
            Thread.sleep(1000);
            driver.findElement(By.linkText("Log out")).click();

            driver.findElement(By.className("login-inp")).clear();

        }


        System.out.println("All passed!");

        driver.close();
    }

}
