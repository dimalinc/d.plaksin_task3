package elements;

import org.openqa.selenium.By;

public class Button_Elements_WebTables_AddRecord extends BaseElement{

    public Button_Elements_WebTables_AddRecord() {
        super(By.xpath("//button[@id='addNewRecordButton']"),
                "Add new record Button in Web Tables page");
    }
}
