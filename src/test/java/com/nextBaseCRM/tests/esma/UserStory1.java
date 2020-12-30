package com.nextBaseCRM.tests.esma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserStory1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 2);

        driver.get("https://login2.nextbasecrm.com");

        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk45@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();
Thread.sleep(3000);
        String expectedTitle="(8) Portal";
        String actualTitle=driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test verification PASSED");
        }else{
            System.out.println("Test verification FAILED");
            System.out.println("actualResult = " + actualTitle);
            System.out.println("expectedResult = " + expectedTitle);
        }

        driver.quit();

    }
}
