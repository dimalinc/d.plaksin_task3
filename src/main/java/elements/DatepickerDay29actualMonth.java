package elements;

import org.openqa.selenium.By;

public class DatepickerDay29actualMonth extends BaseElement{


    public DatepickerDay29actualMonth() {
        super(By.xpath("//div[contains(@class,'react-datepicker__day') and contains(@class,'react-datepicker__day--029') and not(contains(@class,'react-datepicker__day--outside-month'))]"),
                "Datepicker Day 29 actual month");
    }



}
