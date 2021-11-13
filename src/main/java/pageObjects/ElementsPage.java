package pageObjects;

import elements.BaseElement;
import elements.Button_Elements_WebTables;
import elements.Button_Elements_WebTables_AddRecord;
import elements.DivFrame;

public class ElementsPage extends BaseForm{

    private static final BaseElement uniqueElement = new DivFrame();
    private DivFrame divFrame = new DivFrame();
    private Button_Elements_WebTables button_elements_webTables = new Button_Elements_WebTables();
    private Button_Elements_WebTables_AddRecord button_elements_webTables_addRecord = new Button_Elements_WebTables_AddRecord();

    public ElementsPage() {
    super(uniqueElement);
    }
    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }

    public DivFrame getDivFrame() {
        return divFrame;
    }

    public Button_Elements_WebTables getButton_elements_webTables() {
        return button_elements_webTables;
    }

    public Button_Elements_WebTables_AddRecord getButton_elements_webTables_addRecord() {
        return button_elements_webTables_addRecord;
    }
}
