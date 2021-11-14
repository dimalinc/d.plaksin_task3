package browser;

import org.openqa.selenium.chrome.ChromeDriverService;

public class ChromeDriverManager extends DriverManager{

    ChromeDriverService chromeService;


    @Override
    void startService() {
        if (chromeService==null) {
            chromeService = new ChromeDriverService.Builder().build();
        }
    }

    @Override
    void stopService() {
        if (chromeService !=null && chromeService.isRunning() ) {
            chromeService.stop();
        }
    }

    @Override
    void createDriver() {
        driver = DriverSingletonClass.getInstance();
    }
}
