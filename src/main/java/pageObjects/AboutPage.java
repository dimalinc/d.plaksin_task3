package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//https://store.steampowered.com/about/?snr=1_5_9__global-header

public class AboutPage {

    public WebDriver driver;

    public JavascriptExecutor js /*= (JavascriptExecutor) driver*/;

    By online=By.className("gamers_online");
    By inGame=By.className("gamers_in_game");

    By onlinePlayersQty=By.xpath("//*[@id=\"about_greeting\"]/div[3]/div[1]");
    By inGamePlayersQty=By.xpath("//*[@id=\"about_greeting\"]/div[3]/div[2]");

    By store = By.xpath("//*[@id=\"about_games_cta\"]/div[2]/div[2]/a");


    public AboutPage(WebDriver driver) {

        this.driver=driver;

        this.js = (JavascriptExecutor) driver;

    }

    public WebElement getOnline() {
        return driver.findElement(online);
    }

    public WebElement getInGame() {
       return driver.findElement(inGame);
    }

    public WebElement getInGamePlayersQty() {
        return driver.findElement(inGamePlayersQty);
    }

    public WebElement getOnlinePlayersQty() {
        return driver.findElement(onlinePlayersQty);
    }

    public WebElement getStore() {return  driver.findElement(store);}



}
