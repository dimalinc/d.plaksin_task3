package elements;

import org.openqa.selenium.By;

public class ReactTable extends BaseElement{

    private By locator = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]");
    private String elementName = "React table";

    public ReactTable() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
