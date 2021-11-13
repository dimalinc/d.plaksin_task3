package elements;

import org.openqa.selenium.By;

public class Button_AlertsFrameAndWindows_NestedFrames extends BaseElement{

    private By locator = By.xpath("//span[contains(text(),'Nested Frames')]");
    private String elementName = "Nested Frames (in Al.., Frame & Windows";

    public Button_AlertsFrameAndWindows_NestedFrames() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }




}
