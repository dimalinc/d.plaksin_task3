package elements;

import org.openqa.selenium.By;

public class InputDateAndTime extends BaseElement{

    public InputDateAndTime() {
        super(By.xpath("//*[@id=\"dateAndTimePickerInput\"]"),
                "Input Date");
    }



}
