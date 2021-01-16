package com.nextBaseCRM.tests.inci.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
   static WebElement element=null;
    public static WebElement taskBottom_search(WebDriver driver){
      WebElement element=  driver.findElement(By.xpath("//*[@id=\"bx_left_menu_menu_tasks\"]/a/span[1]"));
        return element;
    }
}
