package elements;

import org.openqa.selenium.By;

public class SampleHeading extends BaseElement{

    private By locator = By.xpath("//h1[@id='sampleHeading']");
    private String elementName = "Sample Page heading";


    public SampleHeading() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
