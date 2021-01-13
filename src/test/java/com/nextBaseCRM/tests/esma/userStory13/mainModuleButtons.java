package com.nextBaseCRM.tests.esma.userStory13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

;import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

////*** it is the class for WEB ELEMENT main modules AT the left corner ***
public class mainModuleButtons {

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


    public static List<WebElement> mainModule(WebDriver driver) {

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

        return  new ArrayList<>(Arrays.asList(moreButton,companyButton,servicesButton,employeesButton,timeReportsButton,contactCenterButton,mailButton,calenderButton,driveButton,workgroupsButton,chatAndCallsButton,taskButton,activityStreamButton));


    }


}
