package elements;

import org.openqa.selenium.By;

public class InputAge extends BaseElement{

    public InputAge() {
        super(By.xpath("//input[@id='age']"),"Input Age");
    }

}
