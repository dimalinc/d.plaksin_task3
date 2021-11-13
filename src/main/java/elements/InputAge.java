package elements;

import org.openqa.selenium.By;

public class InputAge extends BaseElement{

    private By locator = By.xpath("//input[@id='age']");
    private String elementName = "Input Age";


    public InputAge() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
