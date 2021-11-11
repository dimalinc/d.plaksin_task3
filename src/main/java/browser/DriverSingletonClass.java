package browser;

import org.openqa.selenium.WebDriver;

public class DriverSingletonClass {

    public static WebDriver driver;

    private DriverSingletonClass() {
        driver = driverInit();
    }

    private WebDriver driverInit() {
      // TODO: прописать сделать инициализацию драйвера
        return driver;
    }

    public static WebDriver getInstance() {
        if (driver == null) {
            new DriverSingletonClass();
        }
        return driver;
    }

}
