package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GamePage {

    public WebDriver driver;

    String gameAreaXpath = "//*[@id=\"game_area_description\"]/h2";

    public GamePage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> checkAboutGameElementsList() {
        return  driver.findElements(By.xpath(gameAreaXpath));
    }

}
