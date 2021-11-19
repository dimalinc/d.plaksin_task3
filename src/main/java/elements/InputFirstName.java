package elements;

import org.openqa.selenium.By;

public class InputFirstName extends BaseElement{

    public InputFirstName() {
        super(By.xpath("//input[@id='firstName']"),
                "Input First Name");
    }

}
