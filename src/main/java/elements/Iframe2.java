package elements;

import org.openqa.selenium.By;

public class Iframe2 extends BaseElement{

    //  /html[1]/body[1]/iframe[1]
    //  //body/iframe[1]
    private By locator = By.cssSelector("body:nth-child(2) > iframe:nth-child(1)");
    private String elementName = "Iframe2 child";

    public Iframe2() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
