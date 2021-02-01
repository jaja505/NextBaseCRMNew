package com.tryCloud.tests.mypeer.jeren;


import com.tryCloud.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserStory2  {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login.nextbasecrm.com/stream/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("marketing45@cybertekschool.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement rememberMe = driver.findElement(By.cssSelector("input[id='USER_REMEMBER']"));
        rememberMe.click();

        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        loginButton.click();

        WebElement messageBody = driver.findElement(By.xpath("//span[@class='feed-add-post-micro-title']"));
        messageBody.click();



//        Thread.sleep(3000);
//

        WebElement frameElement = driver.findElement(By.className("bx-editor-iframe"));

        driver.switchTo().frame(frameElement);
        driver.findElement(By.xpath("//body[@style='min-height: 184px;']")).sendKeys("Great job! Keep it that way:) ");





//        WebElement sendButton = driver.findElement(By.cssSelector("button[id='blog-submit-button-save']"));
//        sendButton.click();
//        Thread.sleep(3000);
//
//        testResultEquals("(35)Portal",driver.getTitle());

    }
}
