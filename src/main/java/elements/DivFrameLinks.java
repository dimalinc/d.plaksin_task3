package elements;

import org.openqa.selenium.By;

public class DivFrameLinks extends BaseElement{

    private By locator = By.xpath("//div[contains(text(),'Links')]");
    private String elementName = "Main header div - Links";


    public DivFrameLinks() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
