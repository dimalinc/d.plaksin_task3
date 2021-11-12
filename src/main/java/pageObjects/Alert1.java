package pageObjects;

import browser.DriverSingletonClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class Alert1 {
    Alert alert;

    public Alert getAlert() {
        //Wait for the alert to be displayed and store it in a variable
        Wait wait = new WebDriverWait(DriverSingletonClass.getInstance(), Duration.ofSeconds(3));
        alert = new WebDriverWait(DriverSingletonClass.getInstance(), Duration.ofSeconds(3)).until(ExpectedConditions.alertIsPresent());
        return alert;
    }

    public String getAlertText() {

    //Store the alert text in a variable
    String text = alert.getText();
    return text;
}
    public void pressAlertOKbutton() {
        //Press the OK button
        alert.accept();
    }

    public void sendRandomKeysToAlert() {
        alert.sendKeys("Selenium");
    }

}
