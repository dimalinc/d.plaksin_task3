import browser.BrowserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DatePickerPage;
import pageObjects.HomePage;

public class Test6_Calendar extends BaseTest {


    @Test
    public void test() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.isOpen());
        homePage.getButton_widgets().click();
        homePage.getButton_widgets_datePicker().click();

        DatePickerPage datePickerPage = new DatePickerPage();
        Assert.assertTrue(datePickerPage.isOpen());
        datePickerPage.getInputDate().click();
        while (!datePickerPage.getLabelTextMonthYear().getText().contains("February")) {
            datePickerPage.getButton_nextMonth().click();
        }
        datePickerPage.getDatepickerDay29actualMonth().click();

    }


}
