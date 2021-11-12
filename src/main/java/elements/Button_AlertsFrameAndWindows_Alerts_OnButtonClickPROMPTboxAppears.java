package elements;

import org.openqa.selenium.By;

public class Button_AlertsFrameAndWindows_Alerts_OnButtonClickPROMPTboxAppears extends BaseElement{

    private By locator = By.xpath("//button[@id='promtButton']");
    private String elementName = "On button click, confirm box will appear";

    public Button_AlertsFrameAndWindows_Alerts_OnButtonClickPROMPTboxAppears() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }


}
