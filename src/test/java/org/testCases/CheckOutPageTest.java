package org.testCases;

import org.testng.annotations.Test;

public class CheckOutPageTest extends BaseTest{

    @Test
    public void checkOut(){
        loginPage.loginAccount("standard_user","secret_sauce");
        loginPage.clickLoginBTN();
        productsPage.addItemsToCart();
        productsPage.goToCart();
        cartPage.checkOut();
        checkOutPage.enterShippingAddress("test","001","1234");
        checkOutPage.continuePayment();
    }


}
