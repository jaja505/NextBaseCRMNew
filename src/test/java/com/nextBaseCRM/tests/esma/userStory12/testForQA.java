package com.nextBaseCRM.tests.esma.userStory12;

import com.nextBaseCRM.Utilities.LogIn_LogOut_CRM;
import com.nextBaseCRM.Utilities.WebDriverFactory;
import com.nextBaseCRM.tests.esma.userStory13.Credentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class testForQA {
    WebDriver driver;
    WebDriverWait wait1;
    public static void checkDate(WebDriver driver, int index) {
        if (index > 16 || index < 0) {
            throw new StringIndexOutOfBoundsException("There are only 17 items in the array index number cannot be negative or greater than 16");
        }
        //all the values in the date box
        String[] dateTypes = {"Current day", "Yesterday", "This week", "This month", "Current quarter", "Last 7 days", "Last 30 days", "Last 60 days", "Last 90 days", "Last N days", "Month", "Quarter", "Year", "Exact date", "Last week", "Last month", "Custom range"};
//click to search box in activity stream

        WebElement searchBox = driver.findElement(By.xpath("//*[@placeholder='Filter and search']"));
        searchBox.click();

        //click to search box in date Selection Box
        WebElement dateSelectBox = driver.findElement(By.xpath("//div[@data-name='DATE_CREATE_datesel']"));
        dateSelectBox.click();

        //used string format... it will take from the array and paste instead of %s
        String locator = "//div[@id='main-filter-control-popup']/div/div/div[.='%s']";
        WebElement dateSelection = driver.findElement(By.xpath(String.format(locator, dateTypes[index])));

        //clicking to the element
        dateSelection.click();

        WebDriverFactory.sleep(3);
//verifying that the input box value that we selected is the same as the expected value which we get from array
        WebElement dateBoxInputBox = driver.findElement(By.xpath("//span[@class='main-ui-select-name']"));
        Assert.assertEquals(dateBoxInputBox.getText().toLowerCase(), dateTypes[index].toLowerCase());

//     because sometimes search button throws NotInteractableElementException I use explicit wait for it
        WebDriverWait wait1 = new WebDriverWait(driver, 15);

        //click to the search button
        WebElement searchButton2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[3]/div[2]/div/button")));
        searchButton2.click();

        //            searchbox delete button
        WebElement searchBoxDeleteButton = driver.findElement(By.xpath("//div[@class='main-ui-item-icon-block main-ui-show']/span[2]"));

        //we want to delete the value that we selected so it does not affect next tests
        searchBoxDeleteButton.click();

    }
    @BeforeMethod
    public void setUp() {


        driver = WebDriverFactory.getDriver("chrome");
        wait1 = new WebDriverWait(driver, 10);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");

        WebElement userNameBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userNameBox.clear();
        userNameBox.sendKeys("hr46@cybertekschool.com");

        WebElement passWordBox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passWordBox.sendKeys("UserUser");

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
    }

    @AfterMethod
    public void teardown() {
        WebDriverFactory.sleep(3);
        driver.close();
    }

    @Test
    public void t5(){
        checkDate(driver,0);
    }
    @Test
    public void t6(){
        checkDate(driver,1);
    }
    @Test
    public void t7(){
        checkDate(driver,2);
    }


}
