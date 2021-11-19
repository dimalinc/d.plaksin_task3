package elements;

import org.openqa.selenium.By;

public class Frame1 extends BaseElement{

    private TextInFrame textInFrame = new TextInFrame();

    public Frame1() {
        super(By.xpath("//iframe[@id='frame1']"),
                "Frame1 on Frames page");
    }

    public TextInFrame getTextInFrame() {
        return textInFrame;
    }

}
