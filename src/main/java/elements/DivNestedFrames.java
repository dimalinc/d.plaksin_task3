package elements;

import org.openqa.selenium.By;

public class DivNestedFrames extends BaseElement{


    public DivNestedFrames() {
        super(By.xpath("//div[contains(text(),'Nested Frames')]"),
                "Nested Frames div");
    }

}
