package com.nextBaseCRM.tests.adnan;

import com.nextBaseCRM.Utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserStory3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login2.nextbasecrm.com/stream/?apply_filter=Y&FIND=()");

        WebElement username = driver.findElement(By.xpath("//input[@class='login-inp']"));

        username.sendKeys("helpdesk45@cybertekschool.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        password.sendKeys("UserUser");

        WebElement logIn = driver.findElement(By.xpath("//input[@value='Log In']"));

        logIn.click();

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='search-textbox-input']"));

        searchBox.sendKeys("inci" + Keys.ENTER);
        Thread.sleep(3000);


        String expectedText = "hi guys! this is inci testing )";

        String actualText = driver.findElement(By.xpath("//div[@class='feed-post-text-block-inner-inner']")).getText();

        if (actualText.equalsIgnoreCase(expectedText))
            System.out.println("test is passed");
        else
            System.err.println("try again later!!!");
        System.out.println("expected text is: " + expectedText);
        System.out.println("Actual text is: " + actualText);


        driver.close();
        System.out.println("Nice job Adnan :)");

    }
}
