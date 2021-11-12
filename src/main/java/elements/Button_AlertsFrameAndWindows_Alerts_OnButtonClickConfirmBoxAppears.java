package elements;

import org.openqa.selenium.By;

public class Button_AlertsFrameAndWindows_Alerts_OnButtonClickConfirmBoxAppears extends BaseElement{

    private By locator = By.xpath("//button[@id='confirmButton']");
    private String elementName = "On button click, confirm box will appear";

    public Button_AlertsFrameAndWindows_Alerts_OnButtonClickConfirmBoxAppears() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }


}
