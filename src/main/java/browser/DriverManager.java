package browser;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public abstract class DriverManager {

    WebDriver driver;

    abstract void startService() throws IOException;

    abstract void stopService();

    abstract void createDriver();

    public void quitDriver(){
        if (driver != null) { driver.quit();}
    }

    public WebDriver getDriver() {
        if (driver==null) {
         //   startService();
            createDriver();
        }
        return driver;
    }

}
