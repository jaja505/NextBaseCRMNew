package com.nextBaseCRM.tests.jair.tryCloudFindBy.TestsMainPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class MainPagePOM extends Login {
    @FindBy(xpath = "//ul[@id='appmenu']/li[1]")
    WebElement buttonFile;
    @FindBy(xpath = "//ul[@id='appmenu']/li[2]")
    WebElement buttonActivity;
    @FindBy(xpath = "//ul[@id='appmenu']/li[3]")
    WebElement buttonGallery;
    @FindBy(xpath = "//ul[@id='appmenu']/li[4]")
    WebElement buttonTalk;
    @FindBy(xpath = "//ul[@id='appmenu']/li[5]")
    WebElement buttonCalendar;
    @FindBy(xpath = "//ul[@id='appmenu']/li[6]")
    WebElement buttonDeck;
    @FindBy(xpath = "//ul[@id='appmenu']/li[7]")
    WebElement buttonAnnouncement;


}
