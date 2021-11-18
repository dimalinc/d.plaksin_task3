package browser;

import org.openqa.selenium.WebDriver;
public abstract class DriverManager {

    WebDriver driver;

    abstract void startService() ;

    abstract void stopService();

    abstract void createDriver();

    public void quitDriver(){
        if (driver != null) { driver.quit();}
    }

    public WebDriver getDriver() {
        if (driver==null) {
         //   startService();
            driver = DriverSingletonClass.getInstance();
        }
        return driver;
    }

    public void openUrl(String url) {
        driver.get(url);
    }




}
