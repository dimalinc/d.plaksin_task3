package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class Button_AlertsFrameAndWindows_Alerts_ClickButtonToSeeAlert extends BaseElement {


    public Button_AlertsFrameAndWindows_Alerts_ClickButtonToSeeAlert() {
        super(By.xpath("//button[@id='alertButton']"),
                "Click Button to see alert");
    }


}
