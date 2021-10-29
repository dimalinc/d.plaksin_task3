package com.example.task2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.AboutPage;
import pageObjects.StorePage;

import java.io.IOException;

import static org.testng.AssertJUnit.assertTrue;

public class AboutPageTest1 extends Base {

    @BeforeTest
    public void driverInit() throws IOException {

        driver = initializeDriver();


     /*   //Set up driver
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("window-size=800,1480");
        options.setCapability("applicationCacheEnabled", false);
        WebDriverManager.chromedriver().setup();
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);*/



       // driver.manage().deleteAllCookies();



    }

    @Test
    public void aboutPageNavigation() {


        Base.openurl("https://store.steampowered.com/about/?snr=1_5_9__global-header");

        AboutPage aboutPage = new AboutPage(driver);


        assertTrue("we have more players inGame than Online (rather unexpected I should say)",
                Integer.parseInt(aboutPage.getInGamePlayersQty().getText().trim().replaceAll("[^0-9]", ""))
                <
                        Integer.parseInt(aboutPage.getOnlinePlayersQty().getText().trim().replaceAll("[^0-9]", ""))
        );

        aboutPage.js.executeScript("window.scrollBy(0,550)", "");
        aboutPage.js.executeScript("window.scrollBy(0,550)", "");

        aboutPage.getStore().click();

        StorePage storePage = new StorePage(driver);

        assertTrue("Haven't managed to  navigate to Store page((",
                (storePage.checkWebElementsListTrending().size()>0));
    }

    @AfterTest
    public void clearDriver() {

        Base.deleteAllCookies();

    }




}


