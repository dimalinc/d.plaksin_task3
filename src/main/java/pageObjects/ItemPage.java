package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemPage {

    public WebDriver driver;

    String xpath = "//*[@id=\"mainContents\"]/div[2]/div/div[4]/div[1]";

    public ItemPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> checkItemAboutElementsList() {
        return  driver.findElements(By.xpath(xpath));
    }


}
