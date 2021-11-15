package elements;

import org.openqa.selenium.By;

public class Button_Elements_Links extends BaseElement{
    private By locator = By.xpath("//span[text()='Links']");
    private String elementName = "Elements-Links";

    public Button_Elements_Links() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }
}
