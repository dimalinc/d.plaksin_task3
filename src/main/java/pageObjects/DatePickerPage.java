package pageObjects;

import elements.*;

public class DatePickerPage extends BaseForm{

    private static final BaseElement uniqueElement = new DivFrameDatePicker();
    private DivFrameDatePicker divFrameDatePicker = new DivFrameDatePicker();
    private InputDate inputDate = new InputDate();
    private InputDateAndTime inputDateAndTime = new InputDateAndTime();
    private LabelTextMonthYear labelTextMonthYear = new LabelTextMonthYear();
    private Button_NextMonth button_nextMonth = new Button_NextMonth();
    private DatepickerDay29actualMonth datepickerDay29actualMonth = new DatepickerDay29actualMonth();

    public DatePickerPage() {
    super(uniqueElement);
    }
    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }
    public DivFrameDatePicker getDivFrameWebTables() {
        return divFrameDatePicker;
    }
    public InputDate getInputDate() {
        return inputDate;
    }
    public LabelTextMonthYear getLabelTextMonthYear() {
        return labelTextMonthYear;
    }
    public DatepickerDay29actualMonth getDatepickerDay29actualMonth() {
        return datepickerDay29actualMonth;
    }
    public Button_NextMonth getButton_nextMonth() {
        return button_nextMonth;
    }
    public InputDateAndTime getInputDateAndTime() {
        return inputDateAndTime;
    }

}