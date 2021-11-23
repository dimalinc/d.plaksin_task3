package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class InputDate extends BaseElement {

    public InputDate() {
        super(By.xpath("//*[@id=\"datePickerMonthYearInput\"]"),
                "Input Date");
    }



}
