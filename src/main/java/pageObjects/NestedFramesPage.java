package pageObjects;

import elements.*;

public class NestedFramesPage extends BaseForm{

    private static final BaseElement uniqueElement = new DivNestedFrames();
    private DivNestedFrames divNestedFrames = new DivNestedFrames();
    private Iframe1 iframe1 = new Iframe1();
    private Iframe2 iframe2 = new Iframe2();
    private Button_AlertsFrameAndWindows_Frames button_alertsFrameAndWindows_frames = new Button_AlertsFrameAndWindows_Frames();


    private Button_AlertsFrameAndWindows_NestedFrames button_alertsFrameAndWindows_nestedFrames = new Button_AlertsFrameAndWindows_NestedFrames();

    public NestedFramesPage() {
    super(uniqueElement);
    }
    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }

    public DivNestedFrames getDivNestedFrames() {
        return divNestedFrames;
    }

    public Iframe1 getIframe1() {
        return iframe1;
    }

    public Iframe2 getIframe2() {
        return iframe2;
    }

    public Button_AlertsFrameAndWindows_Frames getButton_alertsFrameAndWindows_frames() {
        return button_alertsFrameAndWindows_frames;
    }
}
