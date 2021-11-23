package elements;

import elements.baseicelements.Button;
import org.openqa.selenium.By;

public class Button_AlertsFrameAndWindows extends Button {

    public Button_AlertsFrameAndWindows() {
        super(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"),
                "Alerts, Frame & Windows");
    }

}