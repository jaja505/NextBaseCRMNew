package com.nextBaseCRM.tests.esma;

import com.nextBaseCRM.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class EsmaTest {
    public static void main(String[] args) {
        System.out.println("Hello");
        WebDriver driver =WebDriverFactory.getDriver("chrome");

        System.out.println("good job Esma!");
    }
}
