package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class Frame2 extends BaseElement {

    private TextInFrame textInFrame = new TextInFrame();

    public Frame2() {
        super(By.xpath("//iframe[@id='frame2']"),
                "Frame2 on Frames page");
    }

    public TextInFrame getTextInFrame() {
        return textInFrame;
    }
}
