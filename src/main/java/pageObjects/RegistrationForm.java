package pageObjects;

import elements.*;
import elements.baseicelements.Button;
import elements.baseicelements.Image;
import elements.baseicelements.Input;
import elements.baseicelements.Label;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;

public class RegistrationForm extends BaseForm {

    private static final BaseElement uniqueElement = new Label(By.xpath("//*[@id=\"registration-form-modal\"]"),
            "Registration Form Title");
    private Label regFormTitle = new Label(By.xpath("//*[@id=\"registration-form-modal\"]"),
            "Registration Form Title");

    private Input inputDepartment = new Input(By.xpath("//input[@id='department']"),
            "Input Department");
    private Input inputAge = new Input(By.xpath("//input[@id='age']"),"Input Age");
    private Input inputEmail = new Input(By.xpath("//input[@id='userEmail']"),
            "Input Email");
    private Input inputFirstName = new Input(By.xpath("//input[@id='firstName']"),
            "Input First Name");
    private Input inputLastName = new Input(By.xpath("//input[@id='lastName']"),
            "Input Last Name");
    private Input inputSalary = new Input(By.xpath("//input[@id='salary']"),
            "Input Salary");
    private Button button_submit_regForm = new Button(By.xpath("//button[@id='submit']"),
            "Submit registration form button");
    private Button button_delete_fromWebTable = new Button(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.web-tables-wrapper div.ReactTable.-striped.-highlight div.rt-table div.rt-tbody div.rt-tr-group:nth-child(4) div.rt-tr.-even div.rt-td:nth-child(7) div.action-buttons span:nth-child(2) svg:nth-child(1) > path:nth-child(1)"),
            "Delete element from WebTable button");
    private Image trashBinForListGeneralXpath = new Image(By.xpath("//*[contains(@id,'delete-record')]"),
            "General Trash Bins xpath (contains)");



    public boolean checkTableSizeDecreasedAfterDelete(List<WebElement> trashBinsList, List<WebElement> trashBinsList2) {
        int initial = trashBinsList.size();
        trashBinsList.removeIf(trashBinsList2::contains);
        if ((initial - trashBinsList2.size()) > 0)
            return true;
        else return false;
    }

    public Image getTrashBinForListGeneralXpath() {
        return trashBinForListGeneralXpath;
    }

    public RegistrationForm() {
        super(uniqueElement);
    }

    public void fillInData(HashMap<String, String> dataSet) {

        getInputFirstName().enterText(dataSet.get("FirstName"));
        getInputLastName().enterText(dataSet.get("LastName"));
        getInputEmail().enterText(dataSet.get("Email"));
        getInputAge().enterText(dataSet.get("Age"));
        getInputSalary().enterText(dataSet.get("Salary"));
        getInputDepartment().enterText(dataSet.get("Department"));

        getButton_submit_regForm().click();

    }

    public BaseElement getUniqueElement() {
        return uniqueElement;
    }

    public Label regFormTitle() {
        return regFormTitle;
    }

    public Input getInputDepartment() {
        return inputDepartment;
    }

    public Input getInputAge() {
        return inputAge;
    }

    public Input getInputEmail() {
        return inputEmail;
    }

    public Input getInputFirstName() {
        return inputFirstName;
    }

    public Input getInputLastName() {
        return inputLastName;
    }

    public Input getInputSalary() {
        return inputSalary;
    }

    public Button getButton_submit_regForm() {
        return button_submit_regForm;
    }

    public Button getButton_delete_fromWebTable() {
        return button_delete_fromWebTable;
    }

    public Label getRegFormTitle() {
        return regFormTitle;
    }
}
