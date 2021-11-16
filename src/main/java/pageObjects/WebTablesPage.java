package pageObjects;

import elements.*;

import java.util.HashMap;

public class WebTablesPage extends BaseForm{

    private static final BaseElement uniqueElement = new DivFrameWebTables();
    private DivFrameWebTables divFrameWebTables = new DivFrameWebTables();
    private Button_Elements_WebTables button_elements_webTables = new Button_Elements_WebTables();
    private Button_Elements_WebTables_AddRecord button_elements_webTables_addRecord = new Button_Elements_WebTables_AddRecord();
    private ReactTable reactTable = new ReactTable();
    public ReactTable getReactTable() {
        return reactTable;
    }

    public boolean tableContainsDataProvided(HashMap<String, String> dataSet) {
        if (
                getReactTable().getText().contains(dataSet.get("FirstName"))||
                getReactTable().getText().contains(dataSet.get("LastName"))||
                getReactTable().getText().contains(dataSet.get("Email"))||
                getReactTable().getText().contains(dataSet.get("Age"))||
                getReactTable().getText().contains(dataSet.get("Salary"))||
                getReactTable().getText().contains(dataSet.get("Department"))
        )
        return true;
        else return false;
    }

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
