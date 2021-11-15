package pageObjects;

import elements.*;
import org.openqa.selenium.By;

public class LinksPage extends BaseForm{

    private static final BaseElement uniqueElement = new DivFrameLinks();
    private DivFrameLinks divFrame = new DivFrameLinks();
    private Button_Elements_WebTables button_elements_webTables = new Button_Elements_WebTables();
    private Button_Elements_WebTables_AddRecord button_elements_webTables_addRecord = new Button_Elements_WebTables_AddRecord();

    public LinksPage() {
    super(uniqueElement);
    }
    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }





    public Button_Elements_WebTables getButton_elements_webTables() {
        return button_elements_webTables;
    }

    public Button_Elements_WebTables_AddRecord getButton_elements_webTables_addRecord() {
        return button_elements_webTables_addRecord;
    }
}
