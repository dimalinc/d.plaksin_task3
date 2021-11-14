import browser.DriverSingletonClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.ElementsPage;
import pageObjects.HomePage;
import pageObjects.RegistrationForm;
import pageObjects.WebTablesPage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Test3_Elements extends BaseTest{
   // WebDriver driver = DriverSingletonClass.getInstance();

    @Test(dataProvider = "getData")
    public void test(HashMap<String,String> dataSet) {

        // TODO: переписать на homePage.goTo
        driver.get("https://demoqa.com/");
        HomePage homePage = new HomePage();
        homePage.getButton_elements().click();
        ElementsPage elementsPage = new ElementsPage();
        elementsPage.getButton_elements_webTables().click();
        WebTablesPage webTablesPage = new WebTablesPage();
        System.out.println(webTablesPage.getButton_elements_webTables_addRecord().getText());
        webTablesPage.getButton_elements_webTables_addRecord().click();

       RegistrationForm registrationForm = new RegistrationForm();

        registrationForm.fillInData(dataSet);

        System.out.println("Delete bin clicked");
        registrationForm.getButton_delete_fromWebTable().click();
        System.out.println(driver.getCurrentUrl());
    }

    @DataProvider
    public Object[][] getData() throws IOException {

        List<HashMap<String, String>> l = new LinkedList<>();
        try {
            // ToDo: check path
            l = getJsonData("src\\main\\java\\dataLoads\\registrationDetails.json");
        } catch (IOException e) {e.printStackTrace();}

        return new  Object[][]
                {
                        {l.get(0)}, {l.get(1)}
                };
    }

    @AfterTest
    public void tearDown() {

        try {
            Thread.sleep(5000);
        } catch (Exception e) {e.printStackTrace();}

     //  driver.quit();
    }

    @AfterSuite
    public void shutDown() {

         driver.quit();
    }
}
