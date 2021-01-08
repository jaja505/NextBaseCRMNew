package com.nextBaseCRM.tests.esma.userStory13;

import com.nextBaseCRM.tests.esma.utilities.LogInToNextBaseCRM;;
import com.nextBaseCRM.tests.esma.userStory13.Credentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainModuleButtons {
    public WebDriver driver;
    public WebElement activityStreamButton;
    public WebElement taskButton;
    public WebElement chatAndCallsButton;
    public WebElement workgroupsButton;
    public WebElement driveButton;
    public WebElement calenderButton;
    public WebElement mailButton;
    public WebElement contactCenterButton;
    public WebElement timeReportsButton;
    public WebElement employeesButton;
    public WebElement servicesButton;
    public WebElement companyButton;
    public WebElement moreButton;


    public mainModuleButtons(int number, String username) {
        if (username.equalsIgnoreCase("HR")) {
            driver = LogInToNextBaseCRM.login(Credentials.getUserNameHR().get(number), Credentials.getPasswordAll());

        } else if (username.equalsIgnoreCase("helpdesk")) {
            driver = LogInToNextBaseCRM.login(Credentials.getUserNameHelpDesk().get(number), Credentials.getPasswordAll());
        } else if (username.equalsIgnoreCase("marketing")) {
            driver = LogInToNextBaseCRM.login(Credentials.getUserNameMarketing().get(number), Credentials.getPasswordAll());
        } else {
            System.err.println("Invalid username");
        }
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
    }
}
