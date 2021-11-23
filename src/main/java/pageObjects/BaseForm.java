package pageObjects;

import browser.BrowserFactory;
import browser.DriverSingletonClass;
import elements.BaseElement;


public abstract class BaseForm {

    BaseElement uniqueElement;

    public BaseForm(BaseElement element) {
        this.uniqueElement = element;
    }

    public boolean isOpen() {
        return uniqueElement.isDisplayed();

    }
}
