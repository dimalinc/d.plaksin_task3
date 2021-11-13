package elements;

import org.openqa.selenium.By;

public class InputDepartment extends BaseElement{

    private By locator = By.xpath("//input[@id='department']");
    private String elementName = "Input Department";


    public InputDepartment() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
