package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    private By header = By.className("title");
    private By sauceLbBackpack = By.id("add-to-cart-sauce-labs-backpack");
    private By sauceLBLight = By.id("add-to-cart-sauce-labs-bike-light");
    private By cart = By.id("shopping_cart_container");

    public boolean isHeaderVisible(){
        return driver.findElement(header).isDisplayed();
    }

    public void addItemsToCart(){
        driver.findElement(sauceLbBackpack).click();
        driver.findElement(sauceLBLight).click();
    }

    public void goToCart(){
        driver.findElement(cart).click();
    }

}
