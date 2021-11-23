package pageObjects;

import elements.*;
import elements.baseicelements.Button;
import elements.baseicelements.Div;
import org.openqa.selenium.By;

public class ElementsPage extends BaseForm {

    private static final BaseElement uniqueElement = new Div(By.xpath("//div[contains(text(),'Elements')]"),
            "Main header div - Elements");
    private Div divFrameElements = new Div(By.xpath("//div[contains(text(),'Elements')]"),
            "Main header div - Elements");
    private Button button_elements_webTables = new Button(By.xpath("//span[contains(text(),'Web Tables')]"),
            "Web Tables");
    private Button button_elements_webTables_addRecord = new Button(By.xpath("//button[@id='addNewRecordButton']"),
            "Add new record Button in Web Tables page");

    public ElementsPage() {
        super(uniqueElement,"ElementsPage");
    }

    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }

    public Div getDivFrameElements() {
        return divFrameElements;
    }

    public Button getButton_elements_webTables() {
        return button_elements_webTables;
    }

    public Button getButton_elements_webTables_addRecord() {
        return button_elements_webTables_addRecord;
    }

}