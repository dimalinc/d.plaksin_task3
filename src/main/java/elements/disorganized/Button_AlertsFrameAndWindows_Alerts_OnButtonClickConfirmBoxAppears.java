package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class Button_AlertsFrameAndWindows_Alerts_OnButtonClickConfirmBoxAppears extends BaseElement {


    public Button_AlertsFrameAndWindows_Alerts_OnButtonClickConfirmBoxAppears() {
        super(By.xpath("//button[@id='confirmButton']"),
                "On button click, confirm box will appear");
    }


}
