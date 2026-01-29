package org.testCases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.*;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.time.Duration;


public class BaseTest {

    WebDriver driver;

    public ExtentReports extent;
    public ExtentTest test;

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

        //Make Report
        String path = System.getProperty("user.dir") + "/src/reports/index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Automation Results of 'Saucedemo' Application");
        reporter.config().setDocumentTitle("Test Results");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester","Lahiru Jayasuriya");

        // Initialize all Page Objects and pass the WebDriver to them
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        checkOutCompletePage = new CheckOutCompletePage(driver);
        checkOutPage = new CheckOutPage(driver);
        checkOutOverviewPage = new CheckOutOverviewPage(driver);

    }

    @AfterMethod
    public void getResult(ITestResult result) {

        if (test == null) {
            return; // prevents NullPointerException
        }

        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, "Test Failed: " + result.getName());
            test.log(Status.FAIL, result.getThrowable());
        }
        else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, "Test Passed: " + result.getName());
        }
        else if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP, "Test Skipped: " + result.getName());
        }
    }

    @AfterTest
    public void tearDown(){
        extent.flush();
        driver.quit();
    }

}
