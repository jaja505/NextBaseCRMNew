package com.nextBaseCRM.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {
    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("safari")) {
            return new SafariDriver();
        } else {
            System.out.println("Please enter a valid driver");
            return null;
        }


    }
    public static void isNotDisplayed(WebElement element, String user){
        if (!element.isDisplayed()){
            System.out.println("TEST PASSED!! " + element.getText()+" cannot be seen by helpDesk");
        }else{
            System.err.println("TEST FAILED!! "+ element.getText()+" Button can be seen by helpDesk");
        }
    }
    //***to check any element if it is  displayed***
    public static void isDisplayed(WebElement element, String user){
        if (element.isDisplayed()){
            System.out.println("TEST PASSED!! " + element.getText()+" can be seen by "+ user);
        }else{
            System.err.println("TEST FAILED!! "+ element.getText()+" Button cannot be seen by "+ user);
        }
    }
}
