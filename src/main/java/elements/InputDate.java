package elements;

import org.openqa.selenium.By;

public class InputDate extends BaseElement{

    public InputDate() {
        super(By.xpath("//*[@id=\"datePickerMonthYearInput\"]"),
                "Input Date");
    }



}
