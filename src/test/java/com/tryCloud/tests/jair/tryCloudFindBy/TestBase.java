package com.tryCloud.tests.jair.tryCloudFindBy;

import com.tryCloud.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

   // public WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
       // driver = WebDriverFactory.getDriver("chrome");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().get("https://app.trycloud.net/index.php/login");

    }

    //@AfterMethod
    //public void tearDown(){
   //     driver.close();
    //}
}
