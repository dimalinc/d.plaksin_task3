package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class Button_NextMonth extends BaseElement {



    public Button_NextMonth() {
        super(By.xpath("//button[contains(text(),'Next Month')]"),
                "Button next month");
    }

}