import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.ElementsPage;
import pageObjects.HomePage;
import pageObjects.RegistrationForm;
import pageObjects.WebTablesPage;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Test3_Tables extends BaseTest {

    @Test(dataProvider = "getData")
    public void test(HashMap<String, String> dataSet) {

        driverManager.openUrl("https://demoqa.com/");
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.isOpen());
        homePage.getButton_elements().click();
        ElementsPage elementsPage = new ElementsPage();
        Assert.assertTrue(elementsPage.isOpen());
        elementsPage.getButton_elements_webTables().click();
        WebTablesPage webTablesPage = new WebTablesPage();
        Assert.assertTrue(webTablesPage.isOpen());

        webTablesPage.getButton_elements_webTables_addRecord().click();

        RegistrationForm registrationForm = new RegistrationForm();
        Assert.assertTrue(registrationForm.regFormTitle().getElementName().contains(registrationForm.getUniqueElement().getText()) );
        registrationForm.fillInData(dataSet);


        registrationForm.getButton_delete_fromWebTable().click();
        trashBinsList = driverManager.getDriver().findElements(By.xpath("//*[contains(@id,'delete-record')]"));
        int trashBinsListSize2 = trashBinsList.size();

        Assert.assertTrue(trashBinsListSize2<trashBinsListSize1);
    }

    @DataProvider
    public Object[][] getData() {

        List<HashMap<String, String>> l = new LinkedList<>();
        try {
            // ToDo: check path
            l = getJsonData("src\\main\\java\\dataLoads\\registrationDetails.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Object[][]
                {
                        {l.get(0)}, {l.get(1)}
                };
    }
}