package com.tryCloud.tests.mypeer.esma.utilities;;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
/*
TASK: NEW METHOD CREATION
//   Method name: getDriver
//   Static method
//   Accepts string argument: browserType --> will determine what browser opens
//       -> if "chrome" opens chrome browser
//       -> if "firefox" opens firefox browser
//   return type: WebDriver
 */

public class WebDriverFactory {
    public static WebDriver getDriver(String browserType) {
        WebDriver driver = null;
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
    //***sleep method ***

    public static void sleep(long second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //***to check any element if it is NOT displayed***



}









