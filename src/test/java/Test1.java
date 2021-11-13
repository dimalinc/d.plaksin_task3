import browser.DriverSingletonClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.Alert1;
import pageObjects.HomePage;

public class Test1 extends BaseTest{

    static final Logger rootLogger = LogManager.getRootLogger();
    static final Logger test1Logger = LogManager.getLogger(Test1.class);

    WebDriver driver = DriverSingletonClass.getInstance();

    @Test
    public void test() {

        //debug
        /*if (rootLogger.isDebugEnabled()) {
            rootLogger.debug("RootLogger: In debug message");
            test1Logger.debug("UserLogger in debug");
        }*/

        driver.get("https://demoqa.com/");
        HomePage homePage = new HomePage();
        System.out.println(homePage.isOpen());;

        homePage.getButton_alertsFrameAndWindows().click();
        homePage.getButton_alertsFrameAndWindows_alerts().click();
        homePage.getButton_alertsFrameAndWindows_alerts_clickButtonToSeeAlert().click();

        Alert1 alert1 = new Alert1();
        System.out.println(alert1.getAlert().getText());
      /*  test1Logger.error("error message: " + alert1.getAlert().getText());
        test1Logger.fatal("fatal error message: " + alert1.getAlert().getText());
        test1Logger.info("info message: " + alert1.getAlert().getText());*/
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

     /*   try {
            Thread.sleep(15000);
        } catch (Exception e) {e.printStackTrace();}*/

        driver.quit();
        //driver=null;
    }
}


