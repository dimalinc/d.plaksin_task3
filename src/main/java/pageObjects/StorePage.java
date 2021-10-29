package pageObjects;

import com.codeborne.selenide.impl.WebElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class StorePage {

    public WebDriver driver;

    By giftcardsLabel = By.xpath("/html/body/div[1]/div[7]/div[5]/div[1]/div[1]/div/div[1]/div[1]");
    By popular = By.xpath("//*[@id=\"tab_newreleases_content_trigger\"]/div");
    String popularXpath = "//*[@id=\"tab_newreleases_content_trigger\"]/div";

    public StorePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getGiftcardsLabel() {
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(giftcardsLabel));
    }

    public WebElement getPopular() {
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(popular));
    }

    public List<WebElement> checkWebElementsListTrending() {

        return  driver.findElements(By.xpath(popularXpath));
    }





}
