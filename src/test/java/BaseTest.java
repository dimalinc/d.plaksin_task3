import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.HomePage;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

public class BaseTest {
    WebDriver driver;
    HomePage homePage;



    @BeforeTest
    public void setup(){
        // init driver
        // naviagete to starting page
        // new HomePage?
    }

    public WebDriver initializeDriver()
    {
        return null;
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
        // driver quit
    }
}
