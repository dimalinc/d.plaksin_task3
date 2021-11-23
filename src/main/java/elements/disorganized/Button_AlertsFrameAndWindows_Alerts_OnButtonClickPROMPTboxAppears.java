package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class Button_AlertsFrameAndWindows_Alerts_OnButtonClickPROMPTboxAppears extends BaseElement {

    public Button_AlertsFrameAndWindows_Alerts_OnButtonClickPROMPTboxAppears() {
        super(By.xpath("//button[@id='promtButton']"),
                "On button click, confirm box will appear");
    }


}
