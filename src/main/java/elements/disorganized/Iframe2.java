package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class Iframe2 extends BaseElement {

    public Iframe2() {
        super(By.cssSelector("body:nth-child(2) > iframe:nth-child(1)"),
                "Iframe2 child");
    }

}
