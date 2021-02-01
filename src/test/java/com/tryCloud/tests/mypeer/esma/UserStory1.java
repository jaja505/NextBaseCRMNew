package com.tryCloud.tests.mypeer.esma;

import com.tryCloud.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class UserStory1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //driver.manage().window().maximize();
//Go to nextBaseCRM login page:
        driver.get("https://login2.nextbasecrm.com");// wait till the page loads then executes the next codes

        // want to verify it is the right page by the title
        String actualTitle = driver.getTitle();

        String expectedTitle = "Authorization";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification FAILED");
            System.out.println("expectedTitle = " + expectedTitle);
            System.out.println("actualTitle = " + actualTitle);
        }

        ArrayList<String> userNames = new ArrayList<>(Arrays.asList("helpdesk45@cybertekschool.com" ,
                "helpdesk46@cybertekschool.com" ,

                "marketing45@cybertekschool.com" ,
                "marketing46@cybertekschool.com" ,
                "hr45@cybertekschool.com" ,
                "hr46@cybertekschool.com"));
        String passWord = "UserUser";

        for (String each : userNames) {
            //Locator1 className:
            driver.findElement(By.className("login-inp")).sendKeys(each);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(passWord);
            driver.findElement(By.id("USER_REMEMBER")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("input[value='Log In']")).click();


            String expectedURL= "https://login2.nextbasecrm.com/stream/?login=yes";
            String actualURL = driver.getCurrentUrl();
            Thread.sleep(3000);
            if(actualURL.equals(expectedURL)){
                System.out.println("URL Verification for Loging In PASSED for userName"+each);
            }else{
                System.out.println("URL Verification for Loging In FAILED for userName: "+each);
                System.out.println("actualURL = " + actualURL);
                System.out.println("expectedURL = " + expectedURL);
            }
            Thread.sleep(2000);
            driver.findElement(By.className("user-name")).click();//getting to the logout link
            Thread.sleep(2000);
            driver.findElement(By.linkText("Log out")).click();//the actual log out link
            Thread.sleep(1000);//sleep for smoother run

            driver.findElement(By.className("login-inp")).clear();
        }


        System.out.println("All passed");
        driver.quit();

    }
}
