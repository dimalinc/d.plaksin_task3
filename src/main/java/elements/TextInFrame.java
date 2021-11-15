package elements;

import org.openqa.selenium.By;

public class TextInFrame extends BaseElement {

    private By locator = By.xpath("//h1[@id='sampleHeading']");
    private String elementName = "Text in Frame1";


    public TextInFrame() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
