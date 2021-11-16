package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Properties;

public class BrowserFactory {
    public static WebDriver driver;
    public Properties prop;

    public WebDriver getWebDriver(String browserName){
        switch (browserName){
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            default:
                throw new RuntimeException("Incorrect BrowserName");
        }
    }


    public static WebDriver initializeDriver()  {
        driver = DriverSingletonClass.getInstance();
        return driver;

    }

}

