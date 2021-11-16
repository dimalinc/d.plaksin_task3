package pageObjects;

import elements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;

public class RegistrationForm extends BaseForm {

    private static final BaseElement uniqueElement = new RegFormTitle();
    private RegFormTitle regFormTitle = new RegFormTitle();


    private InputDepartment inputDepartment = new InputDepartment();
    private InputAge inputAge = new InputAge();
    private InputEmail inputEmail = new InputEmail();
    private InputFirstName inputFirstName = new InputFirstName();
    private InputLastName inputLastName = new InputLastName();
    private InputSalary inputSalary = new InputSalary();
    private Button_Submit_RegForm button_submit_regForm = new Button_Submit_RegForm();
    private Button_Delete_FromWebTable button_delete_fromWebTable = new Button_Delete_FromWebTable();
    private TrashBinForListGeneralXpath trashBinForListGeneralXpath = new TrashBinForListGeneralXpath();



    public boolean checkTableSizeDecreasedAfterDelete(List<WebElement> trashBinsList, List<WebElement> trashBinsList2) {
        int initial = trashBinsList.size();
        trashBinsList.removeIf(trashBinsList2::contains);
        if ((initial - trashBinsList2.size()) > 0)
            return true;
        else return false;
    }


    public TrashBinForListGeneralXpath getTrashBinForListGeneralXpath() {
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

    public RegFormTitle regFormTitle() {
        return regFormTitle;
    }

    public InputDepartment getInputDepartment() {
        return inputDepartment;
    }

    public InputAge getInputAge() {
        return inputAge;
    }

    public InputEmail getInputEmail() {
        return inputEmail;
    }

    public InputFirstName getInputFirstName() {
        return inputFirstName;
    }

    public InputLastName getInputLastName() {
        return inputLastName;
    }

    public InputSalary getInputSalary() {
        return inputSalary;
    }

    public Button_Submit_RegForm getButton_submit_regForm() {
        return button_submit_regForm;
    }

    public Button_Delete_FromWebTable getButton_delete_fromWebTable() {
        return button_delete_fromWebTable;
    }

    public RegFormTitle getRegFormTitle() {
        return regFormTitle;
    }
}
