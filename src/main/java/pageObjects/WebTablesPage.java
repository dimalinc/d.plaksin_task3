package pageObjects;

import elements.*;
import elements.baseicelements.Button;
import elements.baseicelements.Div;
import elements.baseicelements.Table;
import elements.disorganized.DivFrameWebTables;
import org.openqa.selenium.By;

import java.util.HashMap;

public class WebTablesPage extends BaseForm{

    private static final BaseElement uniqueElement = new DivFrameWebTables();
    private Div divFrameWebTables = new Div(By.xpath("//div[contains(text(),'Web Tables')]"),
            "Main header div - Web Tables");
    private Button button_elements_webTables = new Button(By.xpath("//span[contains(text(),'Web Tables')]"),
            "Web Tables");
    private Button button_elements_webTables_addRecord = new Button(By.xpath("//button[@id='addNewRecordButton']"),
            "Add new record Button in Web Tables page");
    private Table reactTable = new Table(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]"),
            "React table");

    public Table getReactTable() {
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
    super(uniqueElement,"WebTablesPage");
    }
    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }
    public Div getDivFrameWebTables() {
        return divFrameWebTables;
    }
    public Button getButton_elements_webTables() {
        return button_elements_webTables;
    }
    public Button getButton_elements_webTables_addRecord() {
        return button_elements_webTables_addRecord;
    }
}
