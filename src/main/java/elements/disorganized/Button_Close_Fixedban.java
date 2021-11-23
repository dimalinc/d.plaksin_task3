package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class Button_Close_Fixedban extends BaseElement {

    public Button_Close_Fixedban() {
        super(By.xpath("//*[@id=\"close-fixedban\"]/img"),
                "Close lower banner");
    }
}