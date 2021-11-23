package pageObjects;

import elements.*;
import elements.baseicelements.Button;
import elements.baseicelements.Div;
import elements.baseicelements.Input;
import elements.baseicelements.Label;
import org.openqa.selenium.By;

public class DatePickerPage extends BaseForm{

    private static final BaseElement uniqueElement = new Div(By.xpath("//div[contains(text(),'Date Picker')]"),
            "Main header div - Date Picker");
    private Div divFrameDatePicker = new Div(By.xpath("//div[contains(text(),'Date Picker')]"),
            "Main header div - Date Picker");
    private Input inputDate = new Input(By.xpath("//*[@id=\"datePickerMonthYearInput\"]"),
            "Input Date");
    private Input inputDateAndTime = new Input(By.xpath("//*[@id=\"dateAndTimePickerInput\"]"),
            "Input Date");
    private Label labelTextMonthYear = new Label(By.xpath("//*[@class=\"react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown\"]"),
            "Month, Year label");
    private Button button_nextMonth = new Button(By.xpath("//button[contains(text(),'Next Month')]"),
            "Button next month");
    private Div datepickerDay29actualMonth = new Div(By.xpath("//div[contains(@class,'react-datepicker__day') and contains(@class,'react-datepicker__day--029') and not(contains(@class,'react-datepicker__day--outside-month'))]"),
                "Datepicker Day 29 actual month");

    public DatePickerPage() {
    super(uniqueElement);
    }
    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }
    public Div getDivFrameWebTables() {
        return divFrameDatePicker;
    }
    public Input getInputDate() {
        return inputDate;
    }
    public Label getLabelTextMonthYear() {
        return labelTextMonthYear;
    }
    public Div getDatepickerDay29actualMonth() {
        return datepickerDay29actualMonth;
    }
    public Button getButton_nextMonth() {
        return button_nextMonth;
    }
    public Input getInputDateAndTime() {
        return inputDateAndTime;
    }

}
