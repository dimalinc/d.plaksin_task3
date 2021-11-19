package elements;

import org.openqa.selenium.By;

public class InputSalary extends BaseElement{

    public InputSalary() {
        super(By.xpath("//input[@id='salary']"),
                "Input Salary");
    }

}
