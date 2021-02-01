package com.tryCloud.tests.mypeer.esma.userStory12;

import com.github.javafaker.Faker;
import com.tryCloud.Utilities.LogIn_LogOut_CRM;
import com.tryCloud.Utilities.WebDriverFactory;
import com.tryCloud.tests.mypeer.esma.userStory13.Credentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class test1 extends WB_12 {


    WebDriver driver;
    int i;
    WebDriverWait wait1;


    @BeforeMethod
    public void setUp() {


        driver = WebDriverFactory.getDriver("chrome");
        wait1 = new WebDriverWait(driver, 10);

        LogIn_LogOut_CRM.login(Credentials.getUserNameHR().get(1), Credentials.getPasswordAll(), driver);

    }

    @AfterMethod
    public void teardown() {
        WebDriverFactory.sleep(3);
        driver.close();
    }

    //    @AfterMethod
//    public void clear() {
//        WebElement searchBox = driver.findElement(By.xpath("//*[@placeholder='Filter and search']"));
//        searchBox.clear();
//
//    }
//    @Test
//    public void tc1() {
//        //searching by today date
//        getSearchBox(driver).click();
//        WebDriverFactory.sleep(2);
//        getDateSelectBox(driver).click();
//        getClickToDateBoxByText("Current day", driver);
//        getInnerSearchButton(driver).click();
//        WebDriverFactory.sleep(3);
//        for (WebElement each : getTimeBox(driver)) {
//            System.out.println(each.getText());
//            Assert.assertTrue(each.getText().contains("today"));
//
//
//        }
//        getSearchBoxDeleteButton(driver).click();
//        //        driver.findElement(By.xpath("//div[@class='main-ui-filter-field-button-inner']/span")).click();
//
//        WebDriverFactory.sleep(2);
//        //searching by yesteday date
//
//    }

    @Test
    public void tc2() throws InterruptedException {
        WebElement searchBox = driver.findElement(By.xpath("//*[@placeholder='Filter and search']"));
        searchBox.sendKeys("hello ");
        WebDriverFactory.sleep(3);

        WebDriverFactory.sleep(3);
        List<WebElement> postBody = driver.findElements(By.xpath("//div[contains(@id,'blog_post_body')]"));
        WebElement titleOfPost = driver.findElement(By.xpath("//div[@class='feed-post-item']/a"));

        for (WebElement each : postBody) {
            String eachText = each.getText().toLowerCase();
            String bodyText = titleOfPost.getText().toLowerCase();
            String expectedText = "hello ";
            Assert.assertTrue(eachText.contains(expectedText) || bodyText.contains(expectedText), "The body does not contain the searched word " + eachText);
        }


    }

    @Test
    public void tc3() {
        Faker faker = new Faker();
        WB_12.getSearchBox(driver).sendKeys(faker.file().fileName());
//        WebElement searchBox = driver.findElement(By.xpath("//*[@placeholder='Filter and search']"));
//        searchBox.sendKeys(faker.file().fileName());
        WebElement nothingFound = driver.findElement(By.xpath("//div[.='Nothing found']/div/div/div"));
        String nothingFoundActualText = nothingFound.getText();
        String expectedText = "Nothing found";
        Assert.assertTrue(nothingFoundActualText.equals(expectedText));
    }

    //search by date


//    @Test
//    public void tc4() {
//
//        getSearchBox(driver).click();
//        getDateSelectBox(driver).click();
//        WebElement yesterDayButton = driver.findElement(By.xpath("//div[@id='main-filter-control-popup']/div/div/div[.='Yesterday']"));
//        yesterDayButton.click();
//
//        WebElement searchButton2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[3]/div[2]/div/button")));
//        searchButton2.click();
//
//        //from the timebox we are trying to find out if the date is yesterday or not
//        WebDriverFactory.sleep(3);
//        for (WebElement each : getTimeBox(driver)) {
//            System.out.println(each.getText());
//            Assert.assertTrue(each.getText().contains("yesterday"));
//
//        }
//        WebDriverFactory.sleep(3);
//
//        //searchbox delete button
//
//        getSearchBoxDeleteButton(driver).click();
////        getSearchBox(driver).click();
////        driver.findElement(By.xpath("//div[@class='main-ui-filter-field-button-inner']/span")).click();
//
////
//
//    }
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
