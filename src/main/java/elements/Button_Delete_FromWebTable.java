package elements;

import org.openqa.selenium.By;

public class Button_Delete_FromWebTable extends BaseElement{

    // find div.rt-tr-group:nth-child(1) with the needed number
    private By locator = By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.web-tables-wrapper div.ReactTable.-striped.-highlight div.rt-table div.rt-tbody div.rt-tr-group:nth-child(4) div.rt-tr.-even div.rt-td:nth-child(7) div.action-buttons span:nth-child(2) svg:nth-child(1) > path:nth-child(1)");
    private String elementName = "Delete element from WebTable button";

    public Button_Delete_FromWebTable() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }
}