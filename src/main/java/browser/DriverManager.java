package browser;

import org.openqa.selenium.WebDriver;
public abstract class DriverManager {

    WebDriver driver;

    public void quitDriver(){
        if (driver != null) { driver.quit();}
    }

    public WebDriver getDriver() {

        // Todo: переделать на driver factory
        /*if (driver==null) {
            driver = DriverSingletonClass.getInstance();
        }*/
        return driver;
    }

   /* public void openUrl(String url) {
        driver.get(url);
    }*/


}
