import browser.DriverSingletonClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class Test3_Elements {
    WebDriver driver = DriverSingletonClass.getInstance();

    @Test
    public void test() {

        driver.get("https://demoqa.com/");
        HomePage homePage = new HomePage();
        homePage.getButton_elements().click();

        System.out.println(driver.getCurrentUrl());
    }

    @AfterTest
    public void tearDown() {

    /*    try {
            Thread.sleep(5000);
        } catch (Exception e) {e.printStackTrace();}*/

       // driver.quit();
    }
}
