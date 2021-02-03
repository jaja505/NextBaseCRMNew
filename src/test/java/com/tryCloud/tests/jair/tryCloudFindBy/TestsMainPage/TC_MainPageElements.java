package com.tryCloud.tests.jair.tryCloudFindBy.TestsMainPage;

import com.tryCloud.tests.jair.tryCloudFindBy.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC_MainPageElements extends Login {



    @Test
    public void testElements() throws InterruptedException {
        MainPagePOM element = new MainPagePOM();
        PageFactory.initElements(Driver.getDriver(), element);
        element.buttonActivity.click();
        Thread.sleep(2000);
        element.buttonAnnouncement.click();
        Thread.sleep(2000);



    }

}
