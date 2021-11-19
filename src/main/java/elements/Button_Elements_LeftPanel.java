package elements;

import org.openqa.selenium.By;

public class Button_Elements_LeftPanel extends BaseElement {

    public Button_Elements_LeftPanel() {
        super(By.xpath("//*[contains(text(),'Elements')]"),
                "Elements in the Left Panel");
    }
}
