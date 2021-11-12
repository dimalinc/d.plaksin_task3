import browser.DriverSingletonClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
    WebDriver driver = DriverSingletonClass.getInstance();

    @Test
    public void test() {
        driver.get("https://touch.i.ua/");
        Assert.assertEquals(driver.getTitle(), "I.UA — твоя почта ");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
