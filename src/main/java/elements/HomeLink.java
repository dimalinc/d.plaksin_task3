package elements;

import org.openqa.selenium.By;

public class HomeLink extends BaseElement{

    public HomeLink() {
        super(By.xpath("//a[@id='simpleLink']"),
                "Home Link on Elements-Links page");
    }

}
