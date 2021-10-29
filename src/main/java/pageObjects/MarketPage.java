package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MarketPage {

    public WebDriver driver;

    public JavascriptExecutor js /*= (JavascriptExecutor) driver*/;

    By advancedSearch = By.xpath("//*[@id=\"market_search_advanced_show\"]/div");
    By selectGame = By.xpath("//*[@id=\"market_advancedsearch_appselect\"]");
 //   By dota2 = By.xpath("//*[@id=\"browseItems\"]/div/a[3]/span/span[2]");
    By dota2 = By.xpath("//*[@id=\"app_option_570\"]/span");
   By hero = By.xpath("//*[@id=\"market_advancedsearch_filters\"]/div[1]//select");
   // By hero = By.cssSelector("#market_advancedsearch_filters > div:nth-child(1) > select");
    By lifestealer = By.xpath("//*[@id=\"market_advancedsearch_filters\"]/div[1]/select/option[49]");
    By immortal = By.xpath("//*[@id=\"tag_570_Rarity_Rarity_Immortal\"]");
    By searchField = By.xpath("//*[@id=\"advancedSearchBox\"]");
    By searchSubmitButton = By.xpath("//*[@id=\"advancedSearchSubmit\"]");
    By goldenFilter = By.xpath("//*[@id=\"BG_bottom\"]/div[1]/div/a[4]");
    By dotaFilter = By.xpath("//*[@id=\"BG_bottom\"]/div[1]/div/a[1]/span");
    By allGames = By.xpath(("//*[@id=\"app_option_0\"]"));
    By firstItem = By.xpath("//*[@id=\"result_0\"]/div[2]/span[2]");

    String firstGameXpath = "//*[@id=\"delayedimage_home_tabs_autoload_0\"]";

    String itemsListXpath = "//*[@id=\"result_0_name\"]";


    public MarketPage(WebDriver driver) {
        this.driver=driver;
        this.js = (JavascriptExecutor) driver;
    }

    public WebElement getAdvancedSearch() {
        return driver.findElement(advancedSearch);
    }
    public WebElement getSelectGame() {
        return driver.findElement(selectGame);
    }
    public WebElement getDota2() {
        return driver.findElement(dota2);
    }
    public WebElement getHero() {
        return (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(hero));
    }
    public WebElement getLifestealer() {
        return driver.findElement(lifestealer);
    }
    public WebElement getImmortal() {
        return driver.findElement(immortal);
    }
    public WebElement getSearchField() {
        return driver.findElement(searchField);
    }
    public WebElement getSearchSubmitButton() {
        return driver.findElement(searchSubmitButton);
    }
    public WebElement getGoldenFilter() {
        return driver.findElement(goldenFilter);
    }
    public WebElement getDotaFilter() {
        return driver.findElement(dotaFilter);
    }
    public WebElement getAllGames() {
        return driver.findElement(allGames);
    }
    public WebElement getFirstItemFromItemsList() {
        return driver.findElement(firstItem);
    }

    public List<WebElement> checkFirstGameElementsList() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(firstGameXpath)));

        return  driver.findElements(By.xpath(firstGameXpath));
    }

    public List<WebElement> checkItemsListElementsList() {
        return  driver.findElements(By.xpath(itemsListXpath));
    }





}
