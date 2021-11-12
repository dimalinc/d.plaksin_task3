package elements;

import org.openqa.selenium.By;

public class Button_AlertsFrameAndWindows_Alerts_ClickButtonToSeeAlert extends BaseElement{

    private By locator = By.xpath("//button[@id='alertButton']");
    private String elementName = "Click Button to see alert";

    public Button_AlertsFrameAndWindows_Alerts_ClickButtonToSeeAlert() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }


}
