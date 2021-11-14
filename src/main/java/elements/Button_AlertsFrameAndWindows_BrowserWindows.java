package elements;

import org.openqa.selenium.By;

public class Button_AlertsFrameAndWindows_BrowserWindows extends BaseElement{

    private By locator = By.xpath("//span[contains(text(),'Browser Windows')]");
    private String elementName = "Browser Windows (in Al.., Frame & Windows";

    public Button_AlertsFrameAndWindows_BrowserWindows() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }




}
