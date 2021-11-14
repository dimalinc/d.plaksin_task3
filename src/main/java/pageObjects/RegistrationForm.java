package pageObjects;

import elements.*;

import java.util.HashMap;

public class RegistrationForm extends BaseForm{

    //div[@id='registration-form-modal']
    // ToDo: сделать уникальный элемент
    private static final BaseElement uniqueElement = new DivFrame();
    private DivFrame divFrame = new DivFrame();

    private InputDepartment inputDepartment = new InputDepartment();
    private InputAge inputAge = new InputAge();
    private InputEmail inputEmail = new InputEmail();
    private InputFirstName inputFirstName = new InputFirstName();
    private InputLastName inputLastName = new InputLastName();
    private InputSalary inputSalary = new InputSalary();
    private Button_Submit_RegForm button_submit_regForm = new Button_Submit_RegForm();
    private Button_Delete_FromWebTable button_delete_fromWebTable = new Button_Delete_FromWebTable();

    public RegistrationForm() {
    super(uniqueElement);
    }

    public void fillInData(HashMap <String,String> dataSet) {

        getInputFirstName().enterText(dataSet.get("FirstName"));
        getInputLastName().enterText(dataSet.get("LastName"));
        getInputEmail().enterText(dataSet.get("Email"));
        getInputAge().enterText(dataSet.get("Age"));
        getInputSalary().enterText(dataSet.get("Salary"));
        getInputDepartment().enterText(dataSet.get("Department"));

        System.out.println(getButton_submit_regForm().getText());

        try {
            Thread.sleep(3000);
        } catch (Exception e) {e.printStackTrace();}


        getButton_submit_regForm().click();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {e.printStackTrace();}

    }

    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }

    public DivFrame getDivFrame() {
        return divFrame;
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
}
