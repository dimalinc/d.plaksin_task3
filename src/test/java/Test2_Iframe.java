import browser.DriverSingletonClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.FramesPage;
import pageObjects.HomePage;
import pageObjects.NestedFramesPage;

public class Test2_Iframe extends BaseTest{

    static final Logger rootLogger = LogManager.getRootLogger();
    static final Logger test1Logger = LogManager.getLogger(Test2_Iframe.class);

    @Test
    public void test() {

        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.isOpen());

        test1Logger.debug("opening Frames");

        homePage.getButton_alertsFrameAndWindows().click();
        homePage.getButton_alertsFrameAndWindows_nestedFrames().click();
        NestedFramesPage nestedFramesPage = new NestedFramesPage();
        Assert.assertTrue(nestedFramesPage.isOpen());
        driver.switchTo().frame(driver.findElement(nestedFramesPage.getIframe1().getLocator()));
        driver.switchTo().frame(driver.findElement(nestedFramesPage.getIframe2().getLocator()));
        driver.switchTo().defaultContent();
        nestedFramesPage.getButton_alertsFrameAndWindows_frames().click();
        FramesPage framesPage = new FramesPage();
        Assert.assertTrue(framesPage.isOpen());
        String textInFrame1,textInFrame2;
        driver.switchTo().frame(driver.findElement(framesPage.getFrame1().getLocator()));
        textInFrame1=framesPage.getFrame1().getTextInFrame().getText();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(framesPage.getFrame2().getLocator()));
        textInFrame2=framesPage.getFrame2().getTextInFrame().getText();
        Assert.assertTrue(textInFrame1.contentEquals(textInFrame2));

    }

}
