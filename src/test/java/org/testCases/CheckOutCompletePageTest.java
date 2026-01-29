package org.testCases;

import org.testng.annotations.Test;

public class CheckOutCompletePageTest extends BaseTest{

    @Test
    public void e2eProcedure(){
        loginPage.loginAccount("standard_user","secret_sauce");
        loginPage.clickLoginBTN();
        productsPage.addItemsToCart();
        productsPage.goToCart();
        cartPage.checkOut();
        checkOutPage.enterShippingAddress("test","001","1234");
        checkOutPage.continuePayment();
        checkOutOverviewPage.finishPayment();
        checkOutCompletePage.backHome();
    }
}
