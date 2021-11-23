package pageObjects;

import elements.*;
import elements.baseicelements.Label;
import org.openqa.selenium.By;

public class SamplePage extends BaseForm{

    private static final BaseElement uniqueElement = new Label(By.xpath("//h1[@id='sampleHeading']"),
            "Sample Page heading");

    private Label sampleHeading = new Label(By.xpath("//h1[@id='sampleHeading']"),
            "Sample Page heading");
    public SamplePage() {
    super(uniqueElement,"SamplePage");
    }
    public  BaseElement getUniqueElement() {
        return uniqueElement;
    }
    public Label getSampleHeading() {
        return sampleHeading;
    }
}
