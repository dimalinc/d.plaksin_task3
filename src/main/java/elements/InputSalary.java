package elements;

import org.openqa.selenium.By;

public class InputSalary extends BaseElement{

    private By locator = By.xpath("//input[@id='salary']");
    private String elementName = "Input Salary";


    public InputSalary() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }

}
