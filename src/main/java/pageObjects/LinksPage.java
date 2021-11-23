package pageObjects;

import elements.*;
import elements.baseicelements.Button;
import elements.baseicelements.Div;
import org.openqa.selenium.By;

public class LinksPage extends BaseForm{

    private static final BaseElement uniqueElement = new Div(By.xpath("//div[contains(text(),'Links')]"),
            "Main header div - Links");
    private Div divFrame = new Div(By.xpath("//div[contains(text(),'Links')]"),
            "Main header div - Links");
    private Button button_elements_webTables = new Button(By.xpath("//span[contains(text(),'Web Tables')]"),
            "Web Tables");
    private Button button_elements_webTables_addRecord = new Button(By.xpath("//button[@id='addNewRecordButton']"),
            "Add new record Button in Web Tables page");

    public LinksPage() {
    super(uniqueElement,"LinksPage");
    }
    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }
    public Button getButton_elements_webTables() {
        return button_elements_webTables;
    }
    public Button getButton_elements_webTables_addRecord() {
        return button_elements_webTables_addRecord;
    }
}
