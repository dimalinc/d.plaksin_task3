import browser.DriverSingletonClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.ElementsPage;
import pageObjects.HomePage;
import pageObjects.RegistrationForm;
import pageObjects.WebTablesPage;

public class Test3_Elements {
    WebDriver driver = DriverSingletonClass.getInstance();

    @Test
    public void test() {

        driver.get("https://demoqa.com/");
        HomePage homePage = new HomePage();
        homePage.getButton_elements().click();
        ElementsPage elementsPage = new ElementsPage();
        elementsPage.getButton_elements_webTables().click();
        WebTablesPage webTablesPage = new WebTablesPage();
        System.out.println(webTablesPage.getButton_elements_webTables_addRecord().getText());
        webTablesPage.getButton_elements_webTables_addRecord().click();

        RegistrationForm registrationForm = new RegistrationForm();
        registrationForm.getInputFirstName().enterText("1@i.ua");
        registrationForm.getInputLastName().enterText("1@i.ua");
        registrationForm.getInputEmail().enterText("1@i.ua");
        registrationForm.getInputAge().enterText("33");
        registrationForm.getInputSalary().enterText("22");
        registrationForm.getInputDepartment().enterText("1@i.ua");

        System.out.println(registrationForm.getButton_submit_regForm().getText());
        registrationForm.getButton_submit_regForm().click();

        System.out.println(registrationForm.getButton_delete_fromWebTable().getText());
        registrationForm.getButton_delete_fromWebTable().click();
        System.out.println(driver.getCurrentUrl());
    }

    @AfterTest
    public void tearDown() {

        try {
            Thread.sleep(5000);
        } catch (Exception e) {e.printStackTrace();}

       driver.quit();
    }
}
