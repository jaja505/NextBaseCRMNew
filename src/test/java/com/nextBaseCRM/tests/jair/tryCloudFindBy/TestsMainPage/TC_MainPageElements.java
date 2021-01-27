package com.nextBaseCRM.tests.jair.tryCloudFindBy.TestsMainPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC_MainPageElements extends MainPagePOM {



    @Test
    public void testElements() throws InterruptedException {
        MainPagePOM element = new MainPagePOM();
        PageFactory.initElements(driver, element);
        element.buttonActivity.click();
        Thread.sleep(2000);
        element.buttonAnnouncement.click();
        Thread.sleep(2000);

    }

}
