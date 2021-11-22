import browser.BrowserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DatePickerPage;
import pageObjects.HomePage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test6_Calendar extends BaseTest {


    @Test
    public void test() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.isOpen());
        homePage.getButton_widgets().click();
        homePage.getButton_widgets_datePicker().click();

        DatePickerPage datePickerPage = new DatePickerPage();
        Assert.assertTrue(datePickerPage.isOpen());

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date date = new Date(0L);
        try {
            date = formatter.parse(datePickerPage.getInputDate().getValue());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date currentDate = new Date();
        Boolean checkDateIsTheSame = false;
        if ((date.getDate() == currentDate.getDate()) && (date.getMonth() == currentDate.getMonth()) && (date.getYear() == currentDate.getYear()))
            checkDateIsTheSame = true;

        Assert.assertTrue(checkDateIsTheSame, "InputDate contains wrong date");
        SimpleDateFormat formatter2 = new SimpleDateFormat("MMMM dd, yyyy H:mm a", Locale.ENGLISH);
        try {
            date = formatter.parse(datePickerPage.getInputDate().getValue());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(date.before(currentDate), "InputDateAndTime contains wrong date");

        datePickerPage.getInputDate().click();
        for (int i = 0; i < 12; i++)
            while (!datePickerPage.getLabelTextMonthYear().getText().contains("February")) {
                datePickerPage.getButton_nextMonth().click();
            }

        datePickerPage.getDatepickerDay29actualMonth().click();
        checkDateIsTheSame = false;
        try {
            date = formatter.parse(datePickerPage.getInputDate().getValue());
        } catch (ParseException e) {
            e.printStackTrace(); date = null;
        }

        if ((date.getDate() == 29) && (date.getMonth() == 1))
            checkDateIsTheSame = true;
        Assert.assertTrue(checkDateIsTheSame, "29th of February date was not set");
    }
}
