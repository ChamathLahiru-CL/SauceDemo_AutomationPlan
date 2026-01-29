package org.testCases;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void testLoginValid(){
        loginPage.loginAccount("standard_user","secret_sauce");
        loginPage.clickLoginBTN();
    }

    @Test
    public void testLoginInvalid(){
        loginPage.loginAccount("standard_user","12345");
        loginPage.clickLoginBTN();
    }
}
