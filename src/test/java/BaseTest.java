import browser.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pageObjects.HomePage;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

public class BaseTest {
    public WebDriver driver;
    DriverManager driverManager;


    @BeforeMethod
    public void setUp() {
        //  driverManager = new DriverManagerFactory().getManager(DriverType.FIREFOX);
        // ToDo: переделать на Factory
        driver = DriverSingletonClass.getInstance().getDriver();
       /* if(driver == null){
            //initialize your driver
            driver = DriverSingletonClass.getInstance().getDriver();
        }*/
        // driver.get("https://demoqa.com/");
        driver.get("https://demoqa.com/");
        //  driverManager.openUrl("https://demoqa.com/");
    }

    public List<HashMap<String, String>> getJsonData(String jsonFilePath) throws IOException {

        //convert json file content to json string
        String jsonContent = FileUtils.readFileToString(new File(jsonFilePath),
                StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
        });

        return data;

    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

        DriverSingletonClass.setInstance(null);
    }

}
