package pageObjects;

import elements.*;

public class WebTablesPage extends BaseForm{

    private static final BaseElement uniqueElement = new DivFrameWebTables();
    private DivFrameWebTables divFrameWebTables = new DivFrameWebTables();
    private Button_Elements_WebTables button_elements_webTables = new Button_Elements_WebTables();
    private Button_Elements_WebTables_AddRecord button_elements_webTables_addRecord = new Button_Elements_WebTables_AddRecord();

    public WebTablesPage() {
    super(uniqueElement);
    }
    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }

    public DivFrameWebTables getDivFrameWebTables() {
        return divFrameWebTables;
    }

    public Button_Elements_WebTables getButton_elements_webTables() {
        return button_elements_webTables;
    }

    public Button_Elements_WebTables_AddRecord getButton_elements_webTables_addRecord() {
        return button_elements_webTables_addRecord;
    }
}
