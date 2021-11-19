package elements;

import org.openqa.selenium.By;

public class DivFrameLinks extends BaseElement{

    public DivFrameLinks() {
        super(By.xpath("//div[contains(text(),'Links')]"),
                "Main header div - Links");
    }

}
