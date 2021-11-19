package elements;

import org.openqa.selenium.By;

public class Iframe1 extends BaseElement{

    public Iframe1() {
        super(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/iframe[1]"),
                "Iframe1 parent");
    }
}
