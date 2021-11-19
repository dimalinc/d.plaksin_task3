package elements;

import org.openqa.selenium.By;

public class InputEmail extends BaseElement{

    public InputEmail() {
        super(By.xpath("//input[@id='userEmail']"),
                "Input Email");
    }

}
