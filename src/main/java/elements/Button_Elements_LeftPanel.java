package elements;

import org.openqa.selenium.By;

public class Button_Elements_LeftPanel extends BaseElement{
    private By locator = By.xpath("//*[contains(text(),'Elements')]");
    private String elementName = "Elements in the Left Panel";

    public Button_Elements_LeftPanel() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }
}
