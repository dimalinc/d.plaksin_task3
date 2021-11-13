package elements;

import org.openqa.selenium.By;

public class Iframe1 extends BaseElement{

    private By locator = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/iframe[1]");
    private String elementName = "Iframe1 parent";

    public Iframe1() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
