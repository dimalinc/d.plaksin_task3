package pageObjects;

import elements.*;
import elements.baseicelements.Button;
import elements.baseicelements.Div;
import elements.baseicelements.Frame;
import org.openqa.selenium.By;

public class NestedFramesPage extends BaseForm{

    private static final BaseElement uniqueElement = new Div(By.xpath("//div[contains(text(),'Nested Frames')]"),
            "Nested Frames div");
    private Div divNestedFrames = new Div(By.xpath("//div[contains(text(),'Nested Frames')]"),
            "Nested Frames div");
    private Frame iframe1 = new Frame(By.xpath("//*[@id=\"frame1\"]"),
            "Iframe1 parent");
    private Frame iframe2 = new Frame(By.cssSelector("body:nth-child(2) > iframe:nth-child(1)"),
            "Iframe2 child");
    private Button button_alertsFrameAndWindows_frames = new Button(By.xpath("//span[text()=\"Frames\"]"),
            "Frames (in Al.., Frame & Windows");


    private Button button_alertsFrameAndWindows_nestedFrames = new Button(By.xpath("//span[contains(text(),'Nested Frames')]"),
            "Nested Frames (in Al.., Frame & Windows");

    public NestedFramesPage() {
    super(uniqueElement,"NestedFramesPage");
    }
    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }
    public Div getDivNestedFrames() {
        return divNestedFrames;
    }
    public Frame getIframe1() {
        return iframe1;
    }
    public Frame getIframe2() {
        return iframe2;
    }
    public Button getButton_alertsFrameAndWindows_frames() {
        return button_alertsFrameAndWindows_frames;
    }
}
