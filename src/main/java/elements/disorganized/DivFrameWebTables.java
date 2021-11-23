package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class DivFrameWebTables extends BaseElement {

    public DivFrameWebTables() {
        super(By.xpath("//div[contains(text(),'Web Tables')]"),
                "Main header div - Web Tables");
    }

}
