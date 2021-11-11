package elements;

import browser.DriverSingletonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public abstract class BaseElement {

    public String  xpath ;

    public BaseElement(String xpath) {
        this.xpath = xpath;
    }

    protected  WebElement findElement() {
        return DriverSingletonClass.getInstance().findElement(By.xpath(xpath));
    }

      List<WebElement> findElements() {
        return DriverSingletonClass.getInstance().findElements(By.xpath(xpath));
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
}
