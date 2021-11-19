package elements;

import org.openqa.selenium.By;

public class Frame2 extends BaseElement{

    private TextInFrame textInFrame = new TextInFrame();

    public Frame2() {
        super(By.xpath("//iframe[@id='frame2']"),
                "Frame2 on Frames page");
        super.setLocator(locator);
        super.setElementName(elementName);
    }

    public TextInFrame getTextInFrame() {
        return textInFrame;
    }
}
