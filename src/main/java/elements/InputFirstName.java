package elements;

import org.openqa.selenium.By;

public class InputFirstName extends BaseElement{

    private By locator = By.xpath("//input[@id='firstName']");
    private String elementName = "Input First Name";


    public InputFirstName() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
