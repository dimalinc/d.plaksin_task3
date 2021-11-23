package elements;

import org.openqa.selenium.By;

public class TextInFrame extends BaseElement {


    public TextInFrame() {
        super(By.xpath("//h1[@id='sampleHeading']"),
                "Text in Frame");
    }

}
