package com.tryCloud.tests.mypeer.esma.userStory12;

import com.tryCloud.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class WB_12 {
    public WebDriver driver;

    public static WebElement searchBox;
    public static WebElement innerSearchButton;
    public static List<WebElement> postBody;
    public static List<WebElement> timeBox;
    public static WebElement titleOfPost;
    public static WebElement dateSelectBox;
    public static WebElement deleteButton;
    public static WebElement searchBoxDeleteButton;

    public static WebElement getSearchBoxDeleteButton(WebDriver driver) {
        return searchBoxDeleteButton = driver.findElement(By.xpath("//div[@class='main-ui-item-icon-block main-ui-show']/span[2]"));
    }

    public void setSearchBoxDeleteButton(WebElement searchBoxDeleteButton) {
        this.searchBoxDeleteButton = searchBoxDeleteButton;
    }

    public static WebElement getDeleteButton(WebDriver driver) {
        return deleteButton = driver.findElement(By.xpath("//div[@class='main-ui-square-item']/following-sibling::div"));
    }

    public static void setDeleteButton(WebElement deleteButton) {
        WB_12.deleteButton = deleteButton;
    }

    public static WebElement getInnerSearchButton(WebDriver driver) {
        return innerSearchButton = driver.findElement(By.xpath("//div[@class='main-ui-filter-field-button-inner']/button"));
    }

    public static void setInnerSearchButton(WebElement innerSearchButton) {
        WB_12.innerSearchButton = innerSearchButton;
    }

    public static WebElement getDateSelectBox(WebDriver driver) {
        return dateSelectBox = driver.findElement(By.xpath("//div[@data-name='DATE_CREATE_datesel']"));
    }

    public static void setDateSelectBox(WebElement dateSelectBox) {
        WB_12.dateSelectBox = dateSelectBox;
    }

    public static WebElement getSearchBox(WebDriver driver) {
        return searchBox = driver.findElement(By.xpath("//*[@placeholder='Filter and search']"));
    }

    public void setSearchBox(WebElement searchBox) {
        WB_12.searchBox = searchBox;
    }

    public static List<WebElement> getPostBody(WebDriver driver) {
        return postBody = driver.findElements(By.xpath("//div[contains(@id,'blog_post_body')]"));
    }

    public void setPostBody(List<WebElement> postBody) {
        WB_12.postBody = postBody;
    }

    public static List<WebElement> getTimeBox(WebDriver driver) {
        return timeBox = driver.findElements(By.xpath("//div[@class='feed-time']"));
    }

    public static void setTimeBox(List<WebElement> timeBox) {
        WB_12.timeBox = timeBox;
    }

    public static WebElement getTitleOfPost(WebDriver driver) {
        return titleOfPost = driver.findElement(By.xpath("//div[@class='feed-post-item']/a"));
    }


    public void setTitleOfPost(WebElement titleOfPost) {
        WB_12.titleOfPost = titleOfPost;
    }

    private void clickCheckboxElementByText(String textOfElement) {
        String locator = "//div[@id='popup-window-content-main-filter-control-popup']/div/div/div[.='%s']";
        driver.findElement(By.xpath(String.format(locator, textOfElement))).click();
    }

    public void getClickToDateBoxByText(String textOfElement, WebDriver driver) {
        String locator = "//div[@id='main-filter-control-popup']/div/div/div[.='%s']";
        driver.findElement(By.xpath(String.format(locator, textOfElement))).click();
    }

    public static void clearingFromSearchBox(WebDriver driver) {
        getDeleteButton(driver).click();
    }

    //trying to do come up with a method about the date
    public static void checkDate(WebDriver driver, int index) {
        if(index>16||index<0){
            throw new StringIndexOutOfBoundsException("There are only 17 items in the array index number cannot be negative or greater than 16");
        }
        String[] dateTypes = {"Current day", "Yesterday", "This week", "This month", "Current quarter", "Last 7 days", "Last 30 days", "Last 60 days", "Last 90 days","Last N days","Month","Quarter","Year","Exact date","Last week","Last month","Custom range"};

        getSearchBox(driver).click();

        getDateSelectBox(driver).click();


        String locator = "//div[@id='main-filter-control-popup']/div/div/div[.='%s']";
        WebElement dateSelection = driver.findElement(By.xpath(String.format(locator, dateTypes[index])));
        dateSelection.click();




        WebDriverFactory.sleep(3);

        WebElement dateBoxInputBox = driver.findElement(By.xpath("//span[@class='main-ui-select-name']"));
        Assert.assertEquals(dateBoxInputBox.getText().toLowerCase(), dateTypes[index].toLowerCase());

//     because sometimes search button throws NotInteractableElementException I use explicit wait for it
        WebDriverWait wait1 = new WebDriverWait(driver, 15);

        WebElement searchButton2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[3]/div[2]/div/button")));
        searchButton2.click();
//            searchbox delete button
        getSearchBoxDeleteButton(driver).click();


    }
    /*

    //for getting timebox and iterating it if it has the right time
    WebDriverFactory.sleep(3);
        for (WebElement each : getTimeBox(driver)) {
            System.out.println(each.getText());
            Assert.assertTrue(each.getText().contains(dateTypes[0].toLowerCase()));

        }
     */

}
