package elements.baseicelements;

import elements.BaseElement;
import org.openqa.selenium.By;

public class Frame extends BaseElement {

    public Text textInFrame = new Text(By.xpath("//h1[@id='sampleHeading']"),
            "Text in Frame");


    public Frame(By locator, String elementName) {
        super(locator, elementName);
    }

    public Text getTextInFrame() {
        return textInFrame;
    }

}
