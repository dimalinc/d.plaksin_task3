package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class Button_NewTab extends BaseElement {

    public Button_NewTab() {
        super(By.xpath("//button[@id='tabButton']"),
                "Button New Tab in Browser Windows");
    }
}