package elements;

import org.openqa.selenium.By;

public class DivFrame extends BaseElement{

    private By locator = By.xpath("//div[@class='main-header']");
    private String elementName = "Frames div";


    public DivFrame() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
