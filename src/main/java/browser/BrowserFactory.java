package browser;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class BrowserFactory {
    public static WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver()  {

        driver = DriverSingletonClass.getInstance(); /*new ChromeDriver(options)*/;

        return driver;


    }

}

