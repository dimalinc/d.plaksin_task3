package elements;

import org.openqa.selenium.By;

public class Button_Widgets extends BaseElement{



    public Button_Widgets() {
        super(By.xpath("//h5[contains(text(),'Widgets')]"),
                "Widgets button");
    }

}