package pageObjects;

import elements.*;
import elements.baseicelements.Label;
import org.openqa.selenium.By;

public class SamplePage extends BaseForm{

    private static final BaseElement uniqueElement = new SampleHeading();

    private Label sampleHeading = new Label(By.xpath("//h1[@id='sampleHeading']"),
            "Sample Page heading");
    public SamplePage() {
    super(uniqueElement);
    }
    public  BaseElement getUniqueElement() {
        return uniqueElement;
    }
    public Label getSampleHeading() {
        return sampleHeading;
    }
}
