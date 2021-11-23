package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class TrashBinForListGeneralXpath extends BaseElement {

    public TrashBinForListGeneralXpath() {
        super(By.xpath("//*[contains(@id,'delete-record')]"),
                "General Trash Bins xpath (contains)");
    }
}