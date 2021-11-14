package elements;

import org.openqa.selenium.By;

public class Button_NewTab extends BaseElement{
    private By locator = By.xpath("//button[@id='tabButton']");
    private String elementName = "Button New Tab in Browser Windows";

    public Button_NewTab() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }
}