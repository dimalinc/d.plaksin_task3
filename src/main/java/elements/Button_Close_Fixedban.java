package elements;

import org.openqa.selenium.By;

public class Button_Close_Fixedban extends BaseElement{
    private By locator = By.xpath("//*[@id=\"close-fixedban\"]/img");
    private String elementName = "Close lower banner";

    public Button_Close_Fixedban() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }
}