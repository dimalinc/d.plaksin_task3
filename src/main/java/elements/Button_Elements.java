package elements;

import org.openqa.selenium.By;

public class Button_Elements extends BaseElement{

    public Button_Elements() {
        super(By.xpath("//h5[contains(text(),'Elements')]"),
                "Elements");
    }
}
