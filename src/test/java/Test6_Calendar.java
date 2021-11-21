import org.testng.annotations.Test;
import pageObjects.DatePickerPage;

public class Test6_Calendar extends BaseTest {


    @Test
    public void test() {

        // ToDo переход на страницу через меню
        driver.get("https://demoqa.com/date-picker");

        DatePickerPage datePickerPage = new DatePickerPage();
        datePickerPage.getInputDate().click();
        while (!datePickerPage.getLabelTextMonthYear().getText().contains("February")) {
            datePickerPage.getButton_nextMonth().click();
        }
        datePickerPage.getDatepickerDay29actualMonth().click();

    }


}
