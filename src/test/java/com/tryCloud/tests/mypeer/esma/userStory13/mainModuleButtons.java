package com.tryCloud.tests.mypeer.esma.userStory13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

;

////*** it is the class for WEB ELEMENT main modules AT the left corner ***
public class mainModuleButtons {
//    public static WebElement activityStreamButton;
//    public static WebElement taskButton;
//    public static WebElement chatAndCallsButton;
//    public static WebElement workgroupsButton;
//    public static WebElement driveButton;
//    public static WebElement calenderButton;
//    public static WebElement mailButton;
//    public static WebElement contactCenterButton;
//    public static WebElement timeReportsButton;
//    public static WebElement employeesButton;
//    public static WebElement servicesButton;
//    public static WebElement companyButton;
//    public static WebElement moreButton;


    public static List<WebElement> mainModule(WebDriver driver) {

        WebElement activityStreamButton = driver.findElement(By.xpath("//a[@title='Activity Stream']"));
        WebElement taskButton = driver.findElement(By.xpath("//a[@title='Tasks']"));
        WebElement chatAndCallsButton = driver.findElement(By.linkText("Chat and Calls"));
        WebElement workgroupsButton = driver.findElement(By.linkText("Workgroups"));
        WebElement driveButton = driver.findElement(By.linkText("Drive"));
        WebElement calenderButton = driver.findElement(By.xpath("//a[@id='bx_left_menu_menu_calendar']/a"));
        WebElement mailButton = driver.findElement(By.xpath("//a[@href='/mail/']"));
        WebElement contactCenterButton = driver.findElement(By.xpath("//a[@id='bx_left_menu_menu_contact_center']/a"));
        WebElement timeReportsButton = driver.findElement(By.xpath("//a[@id='bx_left_menu_menu_timeman_sect']/a"));
        WebElement employeesButton = driver.findElement(By.linkText("Employees"));
        WebElement servicesButton = driver.findElement(By.linkText("Services"));
        WebElement companyButton = driver.findElement(By.linkText("Company"));
        WebElement moreButton = driver.findElement(By.xpath("//a[@id='left-menu-more-btn']/span"));

        return new ArrayList<>(Arrays.asList(moreButton, companyButton, servicesButton, employeesButton, timeReportsButton, contactCenterButton, mailButton, calenderButton, driveButton, workgroupsButton, chatAndCallsButton, taskButton, activityStreamButton));


    }


}
