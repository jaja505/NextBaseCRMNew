package com.nextBaseCRM.tests.jair;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;

public class UserStory1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //new ChromeDriver(); //opens up the actual browser
        //new ChromeDriver();
//===============================================================================

        //DOING STEP 1 OF OUR TEST EXECUTION
        driver.get("http://login2.nextbasecrm.com");
        String expectedTitle = "Authorization";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification has PASSED. STEP 1 COMPLETE!");
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedTitle = " + expectedTitle);
        }else{
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedTitle = " + expectedTitle);
        }

//===============================================================================
        /*DOING STEP 2 OF OUR TEST EXECUTION

         */
        ArrayList<String> positiveDataSet = new ArrayList<String>(Arrays.asList(
                "helpdesk45@cybertekschool.com",
                "helpdesk46@cybertekschool.com",
                "hr45@cybertekschool.com",
                "hr46@cybertekschool.com",
                "marketing45@cybertekschool.com",
                "marketing46@cybertekschool.com")) ;

        String password = "UserUser";


        for(String each: positiveDataSet){
            //String each = positiveDataSet[i]; for regular For loopdiLoop
            driver.findElement(By.name("USER_LOGIN")).sendKeys(each); //username
            driver.findElement(By.name("USER_PASSWORD")).sendKeys(password);//password

            driver.findElement(By.className("login-btn")).click();//click login button
            Thread.sleep(2000);
            String expectedURL = "https://login2.nextbasecrm.com/stream/";
            String actualURL = driver.getCurrentUrl();
            if(expectedURL.equals(actualURL)){
                System.out.println("URL HAS PASSED! For username: " + each);
            }else{
                System.out.println("FAILED! For username: "+ each);
                System.out.println("actualURL = " + actualURL);
                System.out.println("expectedURL = " + expectedURL);
            }


            Thread.sleep(2000);
            driver.findElement(By.id("user-name")).click();//getting to the logout link
            Thread.sleep(2000);
            driver.findElement(By.linkText("Log out")).click();//the actual log out link
            Thread.sleep(1000);//sleep for smoother run

            driver.findElement(By.name("USER_LOGIN")).clear(); //username

        }

    }
}
