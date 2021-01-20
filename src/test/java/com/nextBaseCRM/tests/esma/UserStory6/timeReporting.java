package com.nextBaseCRM.tests.esma.UserStory6;

import com.nextBaseCRM.Utilities.LogIn_LogOut_CRM;
import com.nextBaseCRM.tests.esma.userStory13.Credentials;
import com.nextBaseCRM.tests.esma.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class timeReporting {
    /*
    "1. Verify users can clock in
2. Verify users can clock out.
3. Verify users can edit Today's task under daily plan.
4. Verify users can add events.
5. Verify users can edit work day starting and ending time.
(hour change buttons are webtable, great practice)"
     */
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        LogIn_LogOut_CRM.login(Credentials.getUserNameHR().get(0), Credentials.getPasswordAll(),driver);
    }

    @Test
    public void clockIn() {
        WebElement timeBox = driver.findElement(By.id("timeman-block"));
        timeBox.click();
        WebDriverFactory.sleep(2);
        WebElement clockInButton=driver.findElement(By.xpath("//div[@class='tm-popup-button-handler']"));
        clockInButton.click();
        WebDriverFactory.sleep(3);
        String expectedTimeBoxStatus="WORKING";
        String actualTimeBoxStatus=driver.findElement(By.id("timeman-status")).getText();
        Assert.assertEquals(actualTimeBoxStatus,expectedTimeBoxStatus);

    }
    @Test
    public void clockOut(){
        WebElement timeBox = driver.findElement(By.id("timeman-block"));
        timeBox.click();
        WebDriverFactory.sleep(3);
        timeBox.click();
        WebElement clockInButton=driver.findElement(By.xpath("//div[@class='tm-popup-button-handler']"));
        clockInButton.click();
        WebDriverFactory.sleep(2);
        String expectedTimeBoxStatus="CLOCKED OUT";
        String actualTimeBoxStatus=driver.findElement(By.id("timeman-status")).getText();
        Assert.assertEquals(actualTimeBoxStatus,expectedTimeBoxStatus);
        //hello



    }






    @AfterClass
    public void setDown() {
        driver.quit();
    }


}
