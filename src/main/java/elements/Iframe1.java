package elements;

import org.openqa.selenium.By;

public class Iframe1 extends BaseElement{

    public Iframe1() {
        super(By.xpath("//*[@id=\"frame1\"]"),
                "Iframe1 parent");
    }
}
