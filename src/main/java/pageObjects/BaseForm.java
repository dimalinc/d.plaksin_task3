package pageObjects;

import browser.DriverSingletonClass;
import elements.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class BaseForm {
    BaseElement uniqueElement;
    String pageName;

    public boolean isPageOpen() {
        // Todo - написать проверку загрузился ли
        return DriverSingletonClass.getInstance().findElements(By.xpath(uniqueElement.xpath)).size() > 0;
    }
}
