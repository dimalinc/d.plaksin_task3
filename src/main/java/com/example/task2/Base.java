package com.example.task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {

    public static   WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver() throws IOException {

        driver = DriverSingletonClass.getInstance(); /*new ChromeDriver(options)*/;

        return driver;

    }

    /*public WebDriver oldInitializeDriver() throws IOException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\dmitr\\IdeaProjects\\task2\\src\\main\\utils\\params.properties");

        prop.load(fis);
        String browserName = prop.getProperty("browser");
      //  System.out.println(browserName);

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver95.exe");
            driver = new ChromeDriver();

            //Perform Basic Operations
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        }

        return driver;

        */



    }

public static void deleteAllCookies() {
    driver.manage().deleteAllCookies();
}


        public static void quit()
    {
        driver.quit();
        // driver=null; // we destroy the driver object after quit operation
    }


    public static void close()
    {
        driver.close();
        driver=null;  // we destroy the driver object after quit operation
    }
    public  static void openurl(String URL)
    {
        driver.get(URL);
    }

    public void resizeBrowser() {
        Dimension d = new Dimension(800,480);
        //Resize current window to the set dimension
        driver.manage().window().setSize(d);
    }




  /*  public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
        FileUtils.copyFile(source, new File(destinationFile));
        return destinationFile;

    }*/

}
