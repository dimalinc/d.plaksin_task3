package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    public WebDriver driver;

    public JavascriptExecutor js /*= (JavascriptExecutor) driver*/;


    By about = By.linkText("О STEAM");
   By community = By.linkText("СООБЩЕСТВО");
   By market = By.xpath("//a[contains(text(),'Торговая')]");
 //  By market = By.cssSelector("#global_header > div > div.supernav_container > div:nth-child(5) > div > a:nth-child(4)");
  // By market = By.partialLinkText("Торговая площадка");
    //*[contains(text(),'about')]

  //  By about2=By.cssSelector("a[href*='about']"); находит ВОЙТИ

    public MainPage(WebDriver driver) {
        this.driver=driver;
        this.js = (JavascriptExecutor) driver;
    }

    public WebElement getAbout() {
        return driver.findElement(about);
    }

    public WebElement getCommunity() {
        return driver.findElement(community);
    }

    public WebElement getMarket() {
        return driver.findElement(market);
    }






}
