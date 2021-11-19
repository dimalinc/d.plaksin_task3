package elements;

import org.openqa.selenium.By;

public class InputDepartment extends BaseElement{

    public InputDepartment() {
        super(By.xpath("//input[@id='department']"),
                "Input Department");
    }

}
