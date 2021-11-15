package elements;

import org.openqa.selenium.By;

public class DivFrameWebTables extends BaseElement{

    private By locator = By.xpath("//div[contains(text(),'Web Tables')]");
    private String elementName = "Main header div - Web Tables";


    public DivFrameWebTables() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
