package elements;

import org.openqa.selenium.By;

public class DivFrameElements extends BaseElement{

    private By locator = By.xpath("//div[contains(text(),'Elements')]");
    private String elementName = "Main header div - Elements";


    public DivFrameElements() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
