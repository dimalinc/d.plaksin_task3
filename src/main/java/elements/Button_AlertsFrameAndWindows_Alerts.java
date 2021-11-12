package elements;

import org.openqa.selenium.By;

public class Button_AlertsFrameAndWindows_Alerts extends BaseElement{

    private By locator = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/span[1]");
    private String elementName = "Alerts (in Al.., Frame & Windows";

    public Button_AlertsFrameAndWindows_Alerts() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }


}
