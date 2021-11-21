package pageObjects;

import elements.*;

public class ElementsPage extends BaseForm {

    private static final BaseElement uniqueElement = new DivFrameElements();
    private DivFrameElements divFrameElements = new DivFrameElements();
    private Button_Elements_WebTables button_elements_webTables = new Button_Elements_WebTables();
    private Button_Elements_WebTables_AddRecord button_elements_webTables_addRecord = new Button_Elements_WebTables_AddRecord();

    public ElementsPage() {
        super(uniqueElement);
    }

    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }

    public DivFrameElements getDivFrameElements() {
        return divFrameElements;
    }

    public Button_Elements_WebTables getButton_elements_webTables() {
        return button_elements_webTables;
    }

    public Button_Elements_WebTables_AddRecord getButton_elements_webTables_addRecord() {
        return button_elements_webTables_addRecord;
    }

}