import browser.DriverSingletonClass;
import browser.Wait;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.*;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Test4_Handles {
    WebDriver driver = DriverSingletonClass.getInstance();

    @Test
    public void test() {

        driver.get("https://demoqa.com/");
        HomePage homePage = new HomePage();
        homePage.getButton_alertsFrameAndWindows().click();
        homePage.getButton_alertsFrameAndWindows_browserWindows().click();


        System.out.println(driver.getCurrentUrl());

        //Store the ID of the original window
        String originalWindow = driver.getWindowHandle();

//Check we don't have other windows open already
        assert driver.getWindowHandles().size() == 1;

//Click the link which opens in a new window
     //   driver.findElement(By.linkText("new window")).click();
        homePage.getButton_newTab().click();

//Wait for the new window or tab

        new Wait().getWait().until(numberOfWindowsToBe(2));

//Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

//Wait for the new tab to finish loading content
     //   new Wait().getWait().until(titleIs(""));

        SamplePage samplePage = new SamplePage();
        System.out.println(samplePage.getSampleHeading().getText());;
       // Assert.assertTrue(samplePage.isOpen());

        System.out.println(driver.getCurrentUrl());

    }

    @AfterTest
    public void tearDown() {

        try {
            Thread.sleep(5000);
        } catch (Exception e) {e.printStackTrace();}

       driver.quit();
    }
}
