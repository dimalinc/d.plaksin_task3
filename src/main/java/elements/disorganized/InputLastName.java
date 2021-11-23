package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class InputLastName extends BaseElement {

    public InputLastName() {
        super(By.xpath("//input[@id='lastName']"),
                "Input Last Name");
    }

}
