package com.example.task2;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.ItemPage;
import pageObjects.MainPage;
import pageObjects.MarketPage;

import java.io.IOException;

import static org.testng.AssertJUnit.assertTrue;

public class CommunityMarketTest3 extends Base {

    private WebDriverWait wait;

    @BeforeTest
    public void driverInit() throws IOException {

        driver = initializeDriver();


       /* //Set up driver
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("window-size=800,1480");
        options.setCapability("applicationCacheEnabled", false);
        WebDriverManager.chromedriver().setup();
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);

        driver = new ChromeDriver(options);

        driver.manage().deleteAllCookies();
        //Set explicit wait
      //  driver = initializeDriver();
        wait = new WebDriverWait(driver, 10);*/

    }


    @Test
    public void aboutPageNavigation() {

        Base.openurl("https://store.steampowered.com/");

        MainPage mainPage = new MainPage(driver);

        Actions actions = new Actions(driver);

        actions.moveToElement(mainPage.getCommunity()).perform();

        System.out.println(mainPage.getMarket().getTagName());

        mainPage.js.executeScript("arguments[0].click();", mainPage.getMarket());

        MarketPage marketPage = new MarketPage(driver);

        marketPage.getAdvancedSearch().click();

        marketPage.getSelectGame().click();

        marketPage.getDota2().click();

        marketPage.getHero().click();

        marketPage.getLifestealer().click();

        marketPage.getImmortal().click();

        marketPage.getSearchField().sendKeys("golden");

        marketPage.getSearchSubmitButton().click();

        marketPage.getGoldenFilter().click();

        assertTrue("golden - filter not found",!marketPage.getGoldenFilter().getText().equalsIgnoreCase("golden"));

        marketPage.getAdvancedSearch().click();
        marketPage.getSelectGame().click();
        marketPage.getAllGames().click();

        assertTrue("Dota 2 - filer not found",!marketPage.getDotaFilter().getText().equalsIgnoreCase("dota 2"));

        marketPage.getSearchSubmitButton().click();

        assertTrue("ItemsList  not opened",
                marketPage.checkItemsListElementsList().size()>0);

        marketPage.getFirstItemFromItemsList().click();

        ItemPage itemPage = new ItemPage(driver);

        assertTrue("ItemPage  not opened",
                itemPage.checkItemAboutElementsList().size()>0);

       // GamePage gamePage = new GamePage(driver);

      //  ItemsListPage itemsListPage = new ItemsListPage(driver);


    }

    @AfterTest
    public void clearDriver() {

        Base.deleteAllCookies();

    }

    @AfterSuite
    public void tearDown() {

        Base.quit();

    }
}
