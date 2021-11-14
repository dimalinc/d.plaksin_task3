package pageObjects;

import elements.*;

public class SamplePage extends BaseForm{

    private static final BaseElement uniqueElement = new SampleHeading();

    private SampleHeading sampleHeading = new SampleHeading();

    public SamplePage() {
    super(uniqueElement);
    }
    public  BaseElement getUniqueElement() {
        return uniqueElement;
    }

    public SampleHeading getSampleHeading() {
        return sampleHeading;
    }
}
