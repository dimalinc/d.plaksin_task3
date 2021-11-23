package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class Button_Elements_WebTables extends BaseElement {

    public Button_Elements_WebTables() {
        super(By.xpath("//span[contains(text(),'Web Tables')]"),
                "Web Tables");
    }
}
