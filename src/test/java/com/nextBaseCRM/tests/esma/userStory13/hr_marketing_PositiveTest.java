package com.nextBaseCRM.tests.esma.userStory13;

import com.nextBaseCRM.tests.esma.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class hr_marketing_PositiveTest {
    public static void main(String[] args) {
        //to make it easier used username string easy to change later on

        String username = "marketing";
        int userNumber= 45;
// ***for looking each element in the arraylist of usernames created a loop***
        for (int i = 0; i < 2; i++) {
            //*** takes the index number and username above to login
            // and we assign the driver of main module to the driver here to use ***
            mainModuleButtons mainModuleButtons = new mainModuleButtons(i, username);
            WebDriver driver = mainModuleButtons.driver;
//***  uses isDisplay method and webelements in main module classes to check is for the that specific users***
            WebDriverFactory.isDisplayed(mainModuleButtons.activityStreamButton, username+" "+userNumber);

            WebDriverFactory.isDisplayed(mainModuleButtons.taskButton, username+" "+userNumber);

            WebDriverFactory.isDisplayed(mainModuleButtons.calenderButton, username+" "+userNumber);

            WebDriverFactory.isDisplayed(mainModuleButtons.chatAndCallsButton, username+" "+userNumber);

            WebDriverFactory.isDisplayed(mainModuleButtons.workgroupsButton, username+" "+userNumber);

            WebDriverFactory.isDisplayed(mainModuleButtons.driveButton, username+" "+userNumber);

            WebDriverFactory.isDisplayed(mainModuleButtons.mailButton, username+" "+userNumber);

            WebDriverFactory.isDisplayed(mainModuleButtons.contactCenterButton, username+" "+userNumber);

            WebDriverFactory.isDisplayed(mainModuleButtons.contactCenterButton, username+" "+userNumber);

            WebDriverFactory.isDisplayed(mainModuleButtons.timeReportsButton, username+" "+userNumber);

            WebDriverFactory.isDisplayed(mainModuleButtons.employeesButton, username+" "+userNumber);

            WebDriverFactory.isDisplayed(mainModuleButtons.servicesButton, username+" "+userNumber);

            WebDriverFactory.isDisplayed(mainModuleButtons.companyButton, username+" "+userNumber);

            WebDriverFactory.isDisplayed(mainModuleButtons.moreButton, username+" "+userNumber);

            driver.findElement(By.className("user-name")).click();//getting to the logout link
            WebDriverFactory.sleep(2);
            driver.findElement(By.linkText("Log out")).click();//the actual log out link
            WebDriverFactory.sleep(2);//sleep for smoother run

            driver.findElement(By.className("login-inp")).clear();
            userNumber++;
            driver.quit();

        }




    }
}
