import browser.DriverSingletonClass;
import elements.ImageJoinNow;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Alert1;
import pageObjects.HomePage;

public class Test1 {
    WebDriver driver = DriverSingletonClass.getInstance();

    @Test
    public void test() {

        driver.get("https://demoqa.com/");
        HomePage homePage = new HomePage();
        homePage.getButton_alertsFrameAndWindows().click();
        homePage.getButton_alertsFrameAndWindows_alerts().click();
        homePage.getButton_alertsFrameAndWindows_alerts_clickButtonToSeeAlert().click();

        Alert1 alert1 = new Alert1();
        System.out.println(alert1.getAlert().getText());
        alert1.getAlert().accept();

        homePage.getButton_alertsFrameAndWindows_alerts_onButtonClickConfirmBoxAppears().click();
        System.out.println(alert1.getAlert().getText());
        alert1.getAlert().accept();

        homePage.getAlertsFrameAndWindows_alerts_onButtonClickPROMPTboxAppears().click();
        System.out.println(alert1.getAlert().getText());
        alert1.sendRandomKeysToAlert();
        alert1.getAlert().accept();


        System.out.println(driver.getCurrentUrl());
      //  homePage.getButton_elements().click();
    }

    @AfterTest
    public void tearDown() {

        try {
            Thread.sleep(15000);
        } catch (Exception e) {e.printStackTrace();}

        driver.quit();
        //driver=null;
    }
}
