package elements;

import org.openqa.selenium.By;

public class Button_Widgets_DatePicker extends BaseElement{



    public Button_Widgets_DatePicker() {
        super(By.xpath("//span[contains(text(),'Date Picker')]"),
                "Date Picker button");
    }

}