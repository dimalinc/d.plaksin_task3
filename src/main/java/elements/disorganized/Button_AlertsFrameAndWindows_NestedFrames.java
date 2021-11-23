package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class Button_AlertsFrameAndWindows_NestedFrames extends BaseElement {

    public Button_AlertsFrameAndWindows_NestedFrames() {
        super(By.xpath("//span[contains(text(),'Nested Frames')]"),
                "Nested Frames (in Al.., Frame & Windows");
    }


}
