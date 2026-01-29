package org.testCases;

import org.testng.annotations.Test;

public class HappyPath extends BaseTest{

    String uName = "standard_user";
    String uPassword = "secret_sauce";
    String fName = "Test";
    String lName = "001";
    String pCode = "1980";

    @Test
    public void e2ePurchaseFlow(){

        loginPage.loginAccount(uName,uPassword);
        loginPage.clickLoginBTN();

        boolean check = productsPage.isHeaderVisible();
        System.out.println("Header visibility: "+ check);

        productsPage.addItemsToCart();
        productsPage.goToCart();

        cartPage.checkOut();

        checkOutPage.enterShippingAddress(fName,lName,pCode);
        checkOutPage.continuePayment();

        checkOutOverviewPage.finishPayment();

        checkOutCompletePage.backHome();

    }
}
