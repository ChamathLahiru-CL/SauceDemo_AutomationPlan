package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutOverviewPage {

    WebDriver driver;

    public CheckOutOverviewPage(WebDriver driver){
        this.driver = driver;
    }

    private By cancelBtn = By.id("cancel");
    private By finishBtn = By.id("finish");

    public void finishPayment(){
        driver.findElement(finishBtn).click();
    }

    public void cancelPayment(){
        driver.findElement(cancelBtn).click();
    }

}
