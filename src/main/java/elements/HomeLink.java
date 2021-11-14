package elements;

import org.openqa.selenium.By;

public class HomeLink extends BaseElement{

    private By locator = By.xpath("//a[@id='simpleLink']");
    private String elementName = "Home Link on Elements-Links page https://demoqa.com/links";


    public HomeLink() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
