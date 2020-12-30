package com.nextBaseCRM.tests.adnan;

import com.nextBaseCRM.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBoxVerification {
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


        String expectedSearch = "https://login2.nextbasecrm.com/stream/?apply_filter=Y&FIND=inci";

        String actualSearch = driver.getCurrentUrl();

        if (actualSearch.equalsIgnoreCase(expectedSearch))
            System.out.println("test is passed");
        else
            System.err.println("try again later!!!");

        driver.close();
        System.out.println("Nice job Adnan :)");

    }
}
