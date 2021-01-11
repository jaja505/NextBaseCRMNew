package com.nextBaseCRM.tests.esma.userStory13;

import com.nextBaseCRM.Utilities.LogInToNextBaseCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.InputMismatchException;

;

////*** it is the class for WEB ELEMENT main modules AT the left corner ***
public class mainModuleButtons {
    public static WebDriver driver;
    public static WebElement activityStreamButton;
    public static WebElement taskButton;
    public static WebElement chatAndCallsButton;
    public static WebElement workgroupsButton;
    public static WebElement driveButton;
    public static WebElement calenderButton;
    public static WebElement mailButton;
    public static WebElement contactCenterButton;
    public static WebElement timeReportsButton;
    public static WebElement employeesButton;
    public static WebElement servicesButton;
    public static WebElement companyButton;
    public static WebElement moreButton;
    public static WebElement timeBox;
    public static WebElement clockInButton;
    public static String actualTimeBoxStatus;

    static {
        activityStreamButton = driver.findElement(By.linkText("Activity Stream"));
        taskButton = driver.findElement(By.xpath("//*[@id=\"bx_left_menu_menu_tasks\"]/a/span[1]"));
        chatAndCallsButton = driver.findElement(By.linkText("Chat and Calls"));
        workgroupsButton = driver.findElement(By.linkText("Workgroups"));
        driveButton = driver.findElement(By.linkText("Drive"));
        calenderButton = driver.findElement(By.xpath("//*[@id='bx_left_menu_menu_calendar']/a"));
        mailButton = driver.findElement(By.xpath("//a[@href='/mail/']"));
        contactCenterButton = driver.findElement(By.xpath("//*[@id='bx_left_menu_menu_contact_center']/a"));
        timeReportsButton = driver.findElement(By.xpath("//*[@id='bx_left_menu_menu_timeman_sect']/a"));
        employeesButton = driver.findElement(By.linkText("Employees"));
        servicesButton = driver.findElement(By.linkText("Services"));
        companyButton = driver.findElement(By.linkText("Company"));
        moreButton = driver.findElement(By.xpath("//*[@id='left-menu-more-btn']/span"));
        timeBox = driver.findElement(By.id("timeman-block"));
        clockInButton=driver.findElement(By.xpath("//div[@class='tm-popup-button-handler']"));
    actualTimeBoxStatus=driver.findElement(By.id("timeman-status")).getText();
    }

    // //***constructor for main module . The number is for the index of the arraylist of userNames***
    public mainModuleButtons(int number, String username) {

        //***if it is  username is HR it gets the username at given index and then password.***
        // Uses loginmethod directly. and assigns to web driver instance above***
        if (username.equalsIgnoreCase("HR")) {
            driver = LogInToNextBaseCRM.login(Credentials.getUserNameHR().get(number), Credentials.getPasswordAll());

//***if it is  username is HELPDESK it gets the username at given index and then password.***
            // Uses login method directly. and assigns to web driver instance above***
        } else if (username.equalsIgnoreCase("helpdesk")) {
            driver = LogInToNextBaseCRM.login(Credentials.getUserNameHelpDesk().get(number), Credentials.getPasswordAll());

            //***if it is  username is MARKETING it gets the username at given index and then password.***
            // Uses loginmethod directly. and assigns to web driver instance above***
        } else if (username.equalsIgnoreCase("marketing")) {
            driver = LogInToNextBaseCRM.login(Credentials.getUserNameMarketing().get(number), Credentials.getPasswordAll());

            //else throws an exception because there is no other usernames
        } else {
            throw new InputMismatchException("Invalid username");
        }
        // ***we use locators to find the buttons and assign them to the instances***
        // could be static too.I will think later....


    }
}
