package elements;

import browser.DriverSingletonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class BaseElement {

    private By locator;
    private String elementName;

    public BaseElement(By locator, String elementName) {
        this.locator = locator;
        this.elementName = elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public void setLocator(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }

    protected WebElement findElement() {
        return DriverSingletonClass.getInstance().findElement(locator);
    }

    public void click() {
        findElement().click();
    }

    public boolean isDisplayed() {
        return findElement().isDisplayed();
    }

    public String getText() {
        return findElement().getText();
    }

    public void enterText(String text) {
        findElement().sendKeys(text);
    }
}
