package elements;

import browser.BrowserFactory;
import browser.DriverSingletonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class BaseElement {

    protected By locator;
    protected String elementName;

    public BaseElement(By locator, String elementName) {
        this.locator = locator;
        this.elementName = elementName;
    }

    public By getLocator() {
        return locator;
    }

    protected WebElement findElement() {
        return BrowserFactory.getDriver().findElement(locator);
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

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public void setLocator(By locator) {
        this.locator = locator;
    }
}
