package browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriverService;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.service.DriverService;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FirefoxDriverManager extends DriverManager {

    DriverService firefoxService;


    @Override
    void startService()  {
        if (firefoxService == null) {
            firefoxService = new FirefoxDriverService.Builder() {
                @Override
                public int score(Capabilities capabilities) {
                    return 0;
                }

                @Override
                protected File findDefaultExecutable() {
                    return null;
                }

                @Override
                protected List<String> createArgs() {
                    return null;
                }

                @Override
                protected DriverService createDriverService(File exe, int port, Duration timeout, List args, Map environment) {
                    return null;
                }

                @Override
                protected boolean isLegacy() {
                    return false;
                }

                @Override
                protected FirefoxDriverService.Builder withOptions(FirefoxOptions options) {
                    return null;
                }
            }.build();
        }
    }

    @Override
    void stopService() {
        if (firefoxService != null && firefoxService.isRunning()) {
            firefoxService.stop();
        }
    }

    @Override
    void createDriver() {
        driver = DriverSingletonClass.getInstance();
    }
}
