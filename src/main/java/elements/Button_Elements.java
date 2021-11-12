package elements;

import org.openqa.selenium.By;

public class Button_Elements extends BaseElement{
    private By locator = By.xpath("//h5[contains(text(),'Elements')]");
    private String elementName = "Elements";

    public Button_Elements() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }
}
