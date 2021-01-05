package com.nextBaseCRM.tests.inci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Thread;

public class UserStory1 {
    public static void main(String[] args) throws InterruptedException {
        //first setup the chromedriver
        WebDriverManager.chromedriver().setup();
        //instance variable create
        WebDriver driver=new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
        //first we need to go to the page
        driver.get("http://login2.nextbasecrm.com");
        //we make sure we are under the right title
        //go to the page inspect it find the title to compare with actual title
       //use command+F for finding title in inspection
       // and coppy it this will be our expected title
       String expectedTitle="Authorization";
       //this one is for actual title
      String actualTitle=driver.getTitle();
      //it is time to compare them
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification is PASS!!");
            //to see the data simply print out in each possiblty
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedTitle = " + expectedTitle);
        }else{
            System.out.println("Title verification is FAILED!!");
            //same here
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedTitle = " + expectedTitle);
        }
        //fun part is starting!!
        //verify users can login
        //we need to check every single email and password
        //create array list for valid emails
        ArrayList<String> validEmails=new ArrayList<>(Arrays.asList(
                "helpdesk45@cybertekschool.com",
                "helpdesk46@cybertekschool.com",
                "hr45@cybertekschool.com",
                "hr46@cybertekschool.com",
                "marketing45@cybertekschool.com",
                "marketing46@cybertekschool.com"));
        //we have only one user password which is a string
        String passWord="UserUser";
        //now time to check each one by one with for each loop
        for(String each:validEmails){
            //each representing each email in Array list
            //time to use locaters and send action to funtions
            //go back to inspection and find username box
            //click left top corner symbol to navigate easly
            //find login functons name and send each email by one by
            driver.findElement(By.name("USER_LOGIN")).sendKeys(each);
            //same proccess for passcode
            Thread.sleep(2000);
            //find password input box and enter the password
          driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys(passWord);
            Thread.sleep(2000);
            //find remember me checkbox and click to it
            driver.findElement(By.cssSelector("input[id='USER_REMEMBER']")).click();
            Thread.sleep(2000);
            //find login box and click to it
            driver.findElement(By.xpath("//*[@value='Log In']")).click();
            Thread.sleep(2000);
            //find the profile setting and log out
            driver.findElement(By.className("user-name")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Log out")).click();
            Thread.sleep(2000);
            driver.findElement(By.name("USER_LOGIN")).clear();
            Thread.sleep(2000);


        }
        driver.quit();


    }
}
