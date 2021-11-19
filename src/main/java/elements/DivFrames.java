package elements;

import org.openqa.selenium.By;

public class DivFrames extends BaseElement{

    public DivFrames() {
        super(By.xpath("//div[contains(text(),'Frames')]"),
                "Main header div - Frames");
    }

}
