package com.example.task2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverSingletonClass {

    private DriverSingletonClass() {
        System.out.println("webDriver created!");
    }

    private static class webDriverHolder {
        public static final DriverSingletonClass HOLDER_INSTANCE = new DriverSingletonClass();
    }

    public static WebDriver  driver;

    public static WebDriver getInstance() throws IOException {
        if (driver == null) {

            Properties prop;
            prop = new Properties();
            FileInputStream fis =
                    new FileInputStream(".\\src\\main\\utils\\params.properties");

            prop.load(fis);
            String browserName = prop.getProperty("browser");

            int windowHeight = Integer.parseInt(prop.getProperty("windowHeight"));
            int windowWidth = Integer.parseInt(prop.getProperty("windowWidth"));


            //Set up driver
            ChromeOptions options = new ChromeOptions();
            options.addArguments("window-size="+windowHeight+","+windowWidth);
            options.setCapability("applicationCacheEnabled", false);
            WebDriverManager.chromedriver().setup();
          /*  DesiredCapabilities cap = DesiredCapabilities.chrome();
            cap.setCapability(ChromeOptions.CAPABILITY, options);*/

            driver = new ChromeDriver(options);
        }
        return driver;
    }
}
