package com.nextBaseCRM.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AutomationTest {public static WebDriver driverSetUp(String browserName){
    if(browserName.equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }else if(browserName.equalsIgnoreCase("safari")){
        return new SafariDriver();
    }else if(browserName.equalsIgnoreCase("fire fox")){
        return new FirefoxDriver();
    }else if(browserName.equalsIgnoreCase("edge")){
        return new EdgeDriver();
    }else if(browserName.equalsIgnoreCase("Internet explorer")){
        return new InternetExplorerDriver();
    }
    return null;

}
    public static void testResultEquals(String expectedResult, String actualResult){
        if(actualResult.equals(expectedResult)){
            System.out.println("Test passed");
        }else {
            System.out.println("expectedResult = " + expectedResult);
            System.out.println("actualResult = " + actualResult);
            System.out.println("Test Failed!");
        }
    }
}
