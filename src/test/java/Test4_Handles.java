import browser.DriverSingletonClass;
import browser.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.*;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Test4_Handles extends BaseTest{

  //  WebDriver driver = DriverSingletonClass.getInstance();

    @Test
    public void test() {

        // Todo - driverFactory
      //  driverManager.openUrl("https://demoqa.com/");
        driver.get("https://demoqa.com/");
        HomePage homePage = new HomePage();
        LinksPage linksPage = new LinksPage();
        Assert.assertTrue(homePage.isOpen());
        homePage.getButton_alertsFrameAndWindows().click();
        homePage.getButton_alertsFrameAndWindows_browserWindows().click();

        //Store the ID of the original window
        String originalWindow = driver.getWindowHandle();

//Check we don't have other windows open already
        assert driver.getWindowHandles().size() == 1;


        homePage.getButton_newTab().click();
        new Wait().getWait().until(numberOfWindowsToBe(2));

//Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        SamplePage samplePage = new SamplePage();
        Assert.assertTrue(samplePage.isOpen());
        driver.close();

        driver.switchTo().window(originalWindow);

        homePage.getButton_elements_leftPanel().click();

        // боремся с  ElementNot Interactable
        homePage.getButton_close_fixedban().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        homePage.getButton_elements_links().click();
        Assert.assertTrue(linksPage.isOpen());

        originalWindow = driver.getWindowHandle();

//Check we don't have other windows open already
        assert driver.getWindowHandles().size() == 1;

        Actions actions = new Actions(driver);
        WebElement homeLink = driver.findElement(homePage.getHomeLink().getLocator());
        actions.moveToElement(homeLink).perform();
        actions.click();
        homePage.getHomeLink().click();
        new Wait().getWait().until(numberOfWindowsToBe(2));



//Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        Assert.assertTrue(homePage.isOpen());
        driver.switchTo().window(originalWindow);

        Assert.assertTrue(linksPage.isOpen());
    }


}
