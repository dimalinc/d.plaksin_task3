package elements;

import org.openqa.selenium.By;

public class TrashBinForListGeneralXpath extends BaseElement{

    private By locator = By.xpath("//*[contains(@id,'delete-record')]");
    private String elementName = "General Trash Bins xpath (contains)";

    public TrashBinForListGeneralXpath() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }


}