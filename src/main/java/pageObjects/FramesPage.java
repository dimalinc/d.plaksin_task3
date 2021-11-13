package pageObjects;

import elements.*;

public class FramesPage extends BaseForm{

    private static final BaseElement uniqueElement = new DivFrame();
    private DivFrame divFrame = new DivFrame();




    public FramesPage() {
    super(uniqueElement);
    }
    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }

    public DivFrame getDivFrame() {
        return divFrame;
    }


}
