package pageObjects;

import browser.DriverSingletonClass;
import elements.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class BaseForm {


    BaseElement uniqueElement;

    public BaseForm(BaseElement element) {
        this.uniqueElement = element;
    }

    public boolean isOpen() {
        // Todo - написать проверку загрузился ли
        // return uniqueElement.exists();
      /*  return DriverSingletonClass.getInstance().findElements
                (By.xpath(String.valueOf(uniqueElement.locator)).size() > 0*/
        ;

        return true;
    }


}
