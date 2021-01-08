package com.nextBaseCRM.tests.esma.userStory13;

import com.nextBaseCRM.tests.esma.utilities.LogInToNextBaseCRM;
import com.nextBaseCRM.tests.esma.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class helpDeskNegative {
    public static void main(String[] args) {
        //NEGATIVE TEST CASE FOR HELPDESK USER

//select Chrome driver and login to the NextBaseCRM page with ID and password
        WebDriver driver = LogInToNextBaseCRM.login("helpdesk60@cybertekschool.com", "UserUser");
//active stream button is displayed or not if displayed throw exception and handle it
        WebElement ActivityStreamButton = driver.findElement(By.xpath("//*[@id=\"bx_left_menu_menu_live_feed\"]/a/span[1]"));
        WebDriverFactory.isNotDisplayed(ActivityStreamButton);

        //tasks Button is displayed or not if displayed throw exception and handle it
        WebElement TaskButton = driver.findElement(By.linkText("Tasks"));
        WebDriverFactory.isNotDisplayed(TaskButton);

//Chat and Calls Button is displayed or not if displayed throw exception and handle it
        WebElement ChatAndCallsButton = driver.findElement(By.linkText("Chat and Calls"));
        WebDriverFactory.isNotDisplayed(ChatAndCallsButton);

//Work groups  Button is displayed or not if displayed throw exception and handle it
        WebElement WorkgroupsButton = driver.findElement(By.linkText("Workgroups"));
        WebDriverFactory.isNotDisplayed(WorkgroupsButton);

        WebElement driveButton = driver.findElement(By.linkText("Drive"));
        WebDriverFactory.isNotDisplayed(driveButton);

        WebElement calenderButton = driver.findElement(By.xpath("//*[@id='bx_left_menu_menu_calendar']/a"));
        WebDriverFactory.isNotDisplayed(calenderButton);

        WebElement mailButton = driver.findElement(By.xpath("//a[@href='/mail/']"));
        WebDriverFactory.isNotDisplayed(mailButton);

        WebElement contactCenterButton = driver.findElement(By.xpath("//*[@id='bx_left_menu_menu_contact_center']/a"));
        WebDriverFactory.isNotDisplayed(contactCenterButton);

        WebElement timeReportsButton = driver.findElement(By.xpath("//*[@id='bx_left_menu_menu_timeman_sect']/a"));
        WebDriverFactory.isNotDisplayed(timeReportsButton);

        WebElement employeesButton = driver.findElement(By.linkText("Employees"));
        WebDriverFactory.isNotDisplayed(employeesButton);

        WebElement servicesButton = driver.findElement(By.linkText("Services"));
        WebDriverFactory.isNotDisplayed(servicesButton);

        WebElement companyButton = driver.findElement(By.linkText("Company"));
        WebDriverFactory.isNotDisplayed(companyButton);

        WebElement moreButton = driver.findElement(By.xpath("//*[@id='left-menu-more-btn']/span"));
        WebDriverFactory.isNotDisplayed(moreButton);
        WebDriverFactory.sleep(3);


        driver.close();

    }

}