package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    private By continueShoppingBtn = By.id("continue-shopping");
    private By checkOutBtn = By.id("checkout");

    public void checkOut(){
        driver.findElement(checkOutBtn).click();
    }

    public  void continueShopping(){
        driver.findElement(continueShoppingBtn).click();
    }
}
