package elements;

import org.openqa.selenium.By;

public class Button_AlertsFrameAndWindows extends BaseElement{
    private By locator = By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]");
    private String elementName = "Alerts, Frame & Windows";

    public Button_AlertsFrameAndWindows() {
        super(locator,elementName);
        super.setLocator(locator);
        super.setElementName(elementName);
    }
}