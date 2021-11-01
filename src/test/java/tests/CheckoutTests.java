package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTests extends BaseTest{

    @Test
    public void fillCheckoutLoginFieldsTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addProductToCart("Sauce Labs Bolt T-Shirt");
        productsPage.openPage("https://www.saucedemo.com/cart.html");
        checkoutPage.pressCheckoutButton();
        checkoutPage.openPage("https://www.saucedemo.com/checkout-step-one.html");
        checkoutPage.checkoutLogin("Ziyat", "Samatkhanov", "2323");
        checkoutPage.pressContinueButton();
        Assert.assertEquals(checkoutPage.getProductPrice(), "$15.99");
    }

    @Test
    public void emptyCheckoutLoginFieldsTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addProductToCart("Sauce Labs Bolt T-Shirt");
        productsPage.openPage("https://www.saucedemo.com/cart.html");
        checkoutPage.pressCheckoutButton();
        checkoutPage.openPage("https://www.saucedemo.com/checkout-step-one.html");
        checkoutPage.clickContinueButton();
        checkoutPage.pressContinueButton();
        Assert.assertEquals(checkoutPage.getErrorText(), "Error: First Name is required");
    }
}
