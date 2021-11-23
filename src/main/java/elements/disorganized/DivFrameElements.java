package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class DivFrameElements extends BaseElement {

    public DivFrameElements() {
        super(By.xpath("//div[contains(text(),'Elements')]"),
                "Main header div - Elements");
    }

}
