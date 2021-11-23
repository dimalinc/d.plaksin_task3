package pageObjects;

import elements.*;
import elements.baseicelements.Div;
import elements.baseicelements.Frame;
import org.openqa.selenium.By;

public class FramesPage extends BaseForm{

    private static final BaseElement uniqueElement = new DivFrames();
    private Div divFrames = new Div(By.xpath("//div[contains(text(),'Frames')]"),
            "Main header div - Frames");

    private Frame frame1 = new Frame(By.xpath("//iframe[@id='frame1']"),
            "Frame1 on Frames page");
    private Frame frame2 = new Frame(By.xpath("//iframe[@id='frame2']"),
            "Frame2 on Frames page");

    public FramesPage() {
    super(uniqueElement);
    }
    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }
    public Div getDivFrames() {
        return divFrames;
    }
    public Frame getFrame1() {
        return frame1;
    }
    public Frame getFrame2() {
        return frame2;
    }
}
