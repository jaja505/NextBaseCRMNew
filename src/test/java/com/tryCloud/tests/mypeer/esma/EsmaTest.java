package com.tryCloud.tests.mypeer.esma;

import com.tryCloud.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EsmaTest {
    public static void main(String[] args) {

        /*Selenium: Selenium is a tool that helps us to automate web base applications...
        //Maven: maven helps us to create and manage Java projects. Its not used by testers.
        // Also developers can use it too. It has basic structure of folders. We have idea , and pom.xml
        pom.xml - helps us to manage our dependencies.

        src folder we dont need the main folder because that is for developers. We will use the
         */
//        WebDriverManager.chromedriver().setup();
//
//       WebDriver driver = new ChromeDriver();
//
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.facebook.com");//will wait for the page to load
//Verification of right page by page Title:
        String actualTitle=driver.getTitle();
        String expectedTitle="Facebook - Log In or Sign Up";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification PASSED!!");
        }else{
            System.out.println("Title Verification FAILED!!");
        }
//        driver.navigate().to("https://www.twitter.com");//does not wait for the page to load for executing next codes
        // navigate().forward(); --> shows next page
        //backward();<-- shows previous page
        // refresh();--> refreshes the page


        //Verification by pageURL
//        String actualURL=driver.getCurrentUrl();
////        String expectedURL="https://twitter.com/";
////
////        if(actualURL.contains(expectedURL)){
////            System.out.println("URL verification PASSED");
////        }else{
////            System.out.println("URL verification FAILED");
////            System.out.println("expectedURL = " + expectedURL);
////            System.out.println("actualURL = " + actualURL);
////        }
        /*
        7. cssSelector
- tagName[attribute='value']
-tagName#id
-tagName.className
tagName[attribute*=‘value’]

8. XPath
- tagName[@attribute=‘value’]
-tagName[contains(@attribute,’value’]
-tagName[.=‘text’]
-*[@attributr=‘value’]
         */

        driver.findElement(By.cssSelector("*[aria-label='Password']")).sendKeys("hello hello");
//<input type="password" class="inputtext _55r1 _6luy" name="pass" id="pass" data-testid="royal_pass" placeholder="Password" aria-label="Password">

        //input[arial-label='Password']













    }
}
