package com.tryCloud.tests.jair.tryCloudFindBy;

import com.tryCloud.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://app.trycloud.net/index.php/login");

    }

    //@AfterMethod
    //public void tearDown(){
   //     driver.close();
    //}
}
