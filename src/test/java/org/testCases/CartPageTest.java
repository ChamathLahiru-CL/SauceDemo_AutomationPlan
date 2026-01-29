package org.testCases;

import org.testng.annotations.Test;

public class CartPageTest extends BaseTest{

    @Test
    public void checkout(){
        loginPage.loginAccount("standard_user","secret_sauce");
        loginPage.clickLoginBTN();
        productsPage.addItemsToCart();
        productsPage.goToCart();
        cartPage.checkOut();
    }
}
