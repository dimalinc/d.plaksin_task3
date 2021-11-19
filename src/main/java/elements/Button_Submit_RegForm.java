package elements;

import org.openqa.selenium.By;

public class Button_Submit_RegForm extends BaseElement{

    public Button_Submit_RegForm() {
        super(By.xpath("//button[@id='submit']"),
                "Submit registration form button");
    }
}