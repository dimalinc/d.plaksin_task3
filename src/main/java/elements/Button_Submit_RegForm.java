package elements;

import org.openqa.selenium.By;

public class Button_Submit_RegForm extends BaseElement{
    private By locator = By.xpath("//button[@id='submit']");
    private String elementName = "Submit registration form button";

    public Button_Submit_RegForm() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }
}