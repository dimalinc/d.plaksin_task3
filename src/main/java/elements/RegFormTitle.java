package elements;

import org.openqa.selenium.By;

public class RegFormTitle extends BaseElement {

    private By locator = By.xpath("//*[@id=\"registration-form-modal\"]");



    private String elementName = "Registration Form Title";


    public String getElementName() {
        return elementName;
    }

    public RegFormTitle() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
