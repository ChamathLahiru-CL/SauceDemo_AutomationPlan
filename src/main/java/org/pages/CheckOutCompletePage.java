package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutCompletePage {

    WebDriver driver;

    public void CheckOutCompletePage(WebDriver driver){
        this.driver = driver;
    }

    private By backHomeBtn = By.id("back-to-products");

    public void backHome(){
        driver.findElement(backHomeBtn).click();
    }

}
