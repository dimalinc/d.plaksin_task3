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

    public void firefoxZoom() {
        /*  JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("document.body.style.zoom = '0.8'");*/

        /*Robot robot;
        try {
            robot = new Robot();

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);

        } catch (AWTException e) {
            e.printStackTrace();
        }*/
    }



}
