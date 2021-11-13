package elements;

import org.openqa.selenium.By;

public class DivNestedFrames extends BaseElement{

    private By locator = By.xpath("//div[contains(text(),'Nested Frames')]");
    private String elementName = "Nested Frames div";


    public DivNestedFrames() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
