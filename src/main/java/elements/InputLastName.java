package elements;

import org.openqa.selenium.By;

public class InputLastName extends BaseElement{

    private By locator = By.xpath("//input[@id='lastName']");
    private String elementName = "Input Last Name";


    public InputLastName() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
