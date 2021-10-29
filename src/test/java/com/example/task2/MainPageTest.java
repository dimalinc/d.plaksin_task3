package com.example.task2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.MainPage;

import java.io.IOException;


public class MainPageTest extends Base {

    // not a task - just to check driver and stuff working

    @BeforeTest
    public void driverInit() throws IOException{
        driver = initializeDriver();
    }

    @Test
    public void mainPageNavigation()  {

        Base.openurl("https://store.steampowered.com/");

        MainPage mainPage = new MainPage(driver);
        mainPage.getAbout().click();
        System.out.println("O O O O " + mainPage.getAbout().getText() + " O O O O O ");

        try {
            driver.wait(10000);
        } catch (Exception e) {
        }

    }

    @AfterTest
    public void clearDriver() {

        Base.deleteAllCookies();

    }


}
