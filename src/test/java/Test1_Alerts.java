import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Alert1;
import pageObjects.HomePage;

public class Test1_Alerts extends BaseTest {

    static final Logger rootLogger = LogManager.getRootLogger();
    static final Logger test1Logger = LogManager.getLogger(Test1_Alerts.class);
    //   WebDriver driver = DriverSingletonClass.getInstance();

    @Test
    public void test() {

        //debug
        if (rootLogger.isDebugEnabled()) {
            rootLogger.debug("RootLogger: In debug message");
            test1Logger.debug("UserLogger in debug");
        }

        driverManager.openUrl("https://demoqa.com/");
        driverManager.firefoxZoom();
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.isOpen());

        test1Logger.debug("opening homepage");

        homePage.getButton_close_fixedban().click();
        homePage.getButton_alertsFrameAndWindows().click();
        homePage.getButton_alertsFrameAndWindows_alerts().click();
        homePage.getButton_alertsFrameAndWindows_alerts_clickButtonToSeeAlert().click();
        test1Logger.debug("alerts_clickButtonToSeeAlert().click()");

        Alert1 alert1 = new Alert1();
        String alertText=alert1.getAlert().getText();
        Assert.assertTrue(alertText.length() > 0,"alert text has zero length");
        alert1.getAlert().accept();
        test1Logger.debug(alertText + " click");

        homePage.getButton_alertsFrameAndWindows_alerts_onButtonClickConfirmBoxAppears().click();
        alertText=alert1.getAlert().getText();
        Assert.assertTrue(alertText.length() > 0,"alert text has zero length");
        alert1.getAlert().accept();
        test1Logger.debug(alertText + " click");


        homePage.getAlertsFrameAndWindows_alerts_onButtonClickPROMPTboxAppears().click();
        Assert.assertTrue(alertText.length() > 0,"alert text has zero length");
        alert1.sendRandomKeysToAlert();
        alert1.getAlert().accept();
        test1Logger.debug(alertText + " click");

    }


}


