package elements;

import org.openqa.selenium.By;

public class Button_AlertsFrameAndWindows_Frames extends BaseElement{

    private By locator = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]");
    private String elementName = "Frames (in Al.., Frame & Windows";

    public Button_AlertsFrameAndWindows_Frames() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }




}
