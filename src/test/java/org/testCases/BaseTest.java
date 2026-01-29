package org.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.*;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;

//    Page Object variable for each page
    LoginPage loginPage;
    ProductsPage productsPage;
    CartPage cartPage;
    CheckOutPage checkOutPage;
    CheckOutCompletePage checkOutCompletePage;
    CheckOutOverviewPage checkOutOverviewPage;


//    This method runs before any tests and sets up the browser and pages
    @BeforeTest
    public void beforeTest(){

        // Launch Chrome Driver
        driver = new ChromeDriver();

        // Set implicit wait for element visibility
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the SauceDemo website
        driver.get("https://www.saucedemo.com/");

        // Initialize all Page Objects and pass the WebDriver to them
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        checkOutCompletePage = new CheckOutCompletePage(driver);
        checkOutPage = new CheckOutPage(driver);
        checkOutOverviewPage = new CheckOutOverviewPage(driver);

    }
}
