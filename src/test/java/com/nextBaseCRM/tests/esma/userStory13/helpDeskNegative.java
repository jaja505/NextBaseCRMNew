package com.nextBaseCRM.tests.esma.userStory13;

import com.nextBaseCRM.tests.esma.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class helpDeskNegative {
    public static void main(String[] args) {


        String username = "helpdesk";
        int userNumber = 45;
// ***for looking each element in the arraylist of usernames created a loop***
        for (int i = 0; i < 2; i++) {
            //*** takes the index number and username above to login
            // and we assign the driver of main module to the driver here to use ***
            mainModuleButtons mainModuleButtons = new mainModuleButtons(i, username);
            WebDriver driver = mainModuleButtons.driver;
//***  uses isDisplay method and webelements in main module classes to check is for the that specific users***
            WebDriverFactory.isNotDisplayed(mainModuleButtons.activityStreamButton, username + " " + userNumber);

            WebDriverFactory.isNotDisplayed(mainModuleButtons.taskButton, username + " " + userNumber);

            WebDriverFactory.isNotDisplayed(mainModuleButtons.calenderButton, username + " " + userNumber);

            WebDriverFactory.isNotDisplayed(mainModuleButtons.chatAndCallsButton, username + " " + userNumber);

            WebDriverFactory.isNotDisplayed(mainModuleButtons.workgroupsButton, username + " " + userNumber);

            WebDriverFactory.isNotDisplayed(mainModuleButtons.driveButton, username + " " + userNumber);

            WebDriverFactory.isNotDisplayed(mainModuleButtons.mailButton, username + " " + userNumber);

            WebDriverFactory.isNotDisplayed(mainModuleButtons.contactCenterButton, username + " " + userNumber);

            WebDriverFactory.isNotDisplayed(mainModuleButtons.contactCenterButton, username + " " + userNumber);

            WebDriverFactory.isNotDisplayed(mainModuleButtons.timeReportsButton, username + " " + userNumber);

            WebDriverFactory.isNotDisplayed(mainModuleButtons.employeesButton, username + " " + userNumber);

            WebDriverFactory.isNotDisplayed(mainModuleButtons.servicesButton, username + " " + userNumber);

            WebDriverFactory.isNotDisplayed(mainModuleButtons.companyButton, username + " " + userNumber);

            WebDriverFactory.isNotDisplayed(mainModuleButtons.moreButton, username + " " + userNumber);

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