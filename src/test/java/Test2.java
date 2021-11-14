import browser.DriverSingletonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.FramesPage;
import pageObjects.HomePage;
import pageObjects.NestedFramesPage;

public class Test2 extends BaseTest{

  //  WebDriver driver = DriverSingletonClass.getInstance();

    @Test
    public void test() {


        driver.get("https://demoqa.com/");
        HomePage homePage = new HomePage();
        System.out.println(homePage.isOpen());;

        homePage.getButton_alertsFrameAndWindows().click();
        homePage.getButton_alertsFrameAndWindows_nestedFrames().click();

        NestedFramesPage nestedFramesPage = new NestedFramesPage();

        //WebElement frame1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/iframe[1]"));

        driver.switchTo().frame(driver.findElement(nestedFramesPage.getIframe1().getLocator()));
        driver.findElement(By.xpath("/html/body")).getText();
        System.out.println(driver.findElement(By.xpath("/html/body")).getText());

        driver.switchTo().frame(driver.findElement(nestedFramesPage.getIframe2().getLocator()));

        System.out.println(driver.findElement(By.xpath("/html/body/p")).getText());
        driver.switchTo().defaultContent();

        nestedFramesPage.getButton_alertsFrameAndWindows_frames().click();

        System.out.println(driver.getCurrentUrl());

        FramesPage framesPage = new FramesPage();
        System.out.println(framesPage.getDivFrame().getText());

    }

    @AfterTest
    public void tearDown() {

     /*   try {
            Thread.sleep(15000);
        } catch (Exception e) {e.printStackTrace();}*/

        driver.quit();
        //driver=null;
    }
}
