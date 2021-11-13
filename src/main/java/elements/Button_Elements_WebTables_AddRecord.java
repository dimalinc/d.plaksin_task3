package elements;

import org.openqa.selenium.By;

public class Button_Elements_WebTables_AddRecord extends BaseElement{
    private By locator = By.xpath("//button[@id='addNewRecordButton']");
    private String elementName = "Add new record Button in Web Tables page";

    public Button_Elements_WebTables_AddRecord() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }
}
