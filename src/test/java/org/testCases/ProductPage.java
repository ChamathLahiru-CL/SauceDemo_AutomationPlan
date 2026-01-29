package org.testCases;

import org.testng.annotations.Test;

public class ProductPage extends BaseTest{

    LoginTest login = new LoginTest();

    @Test
    public void checkHeader(){
        loginPage.loginAccount("standard_user","secret_sauce");
        loginPage.clickLoginBTN();
        boolean check = productsPage.isHeaderVisible();
        System.out.println("Header visibility: "+ check);
    }

    @Test
    public void addItems(){
        loginPage.loginAccount("standard_user","secret_sauce");
        loginPage.clickLoginBTN();
        productsPage.addItemsToCart();
        productsPage.goToCart();
    }
}
