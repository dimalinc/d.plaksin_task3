package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class RegFormTitle extends BaseElement {

    public String getElementName() {
        return elementName;
    }

    public RegFormTitle() {
        super(By.xpath("//*[@id=\"registration-form-modal\"]"),
                "Registration Form Title");
    }

}
