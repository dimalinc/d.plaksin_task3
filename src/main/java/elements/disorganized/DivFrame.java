package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class DivFrame extends BaseElement {

    public DivFrame() {
        super(By.xpath("//div[@class='main-header']"), "Main header div");
    }

}