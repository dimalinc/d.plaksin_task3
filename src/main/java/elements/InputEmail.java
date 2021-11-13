package elements;

import org.openqa.selenium.By;

public class InputEmail extends BaseElement{

    private By locator = By.xpath("//input[@id='userEmail']");
    private String elementName = "Input Email";


    public InputEmail() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
