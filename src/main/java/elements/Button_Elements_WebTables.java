package elements;

import org.openqa.selenium.By;

public class Button_Elements_WebTables extends BaseElement{
    private By locator = By.xpath("//span[contains(text(),'Web Tables')]");
    private String elementName = "Web Tables";

    public Button_Elements_WebTables() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }
}
