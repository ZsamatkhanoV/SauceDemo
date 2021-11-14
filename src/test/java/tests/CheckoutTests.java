package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTests extends BaseTest{

    @Test
    public void fillCheckoutLoginFieldsTest() {
        loginPage.openPage()
                .login("standard_user", "secret_sauce")
                .addProductToCart("Sauce Labs Bolt T-Shirt");
        cartPage.openCardPage();
        checkoutPage.pressCheckoutButton()
                .openCheckoutPage()
                .fillAllValidFields("Ziyat", "Samatkhanov", "2323")
                .pressContinueButton();
        Assert.assertEquals(checkoutPage.getProductPrice("Sauce Labs Bolt T-Shirt"), "$15.99");
    }

    @Test
    public void emptyCheckoutLoginFieldsTest() {
        loginPage.openPage()
                .login("standard_user", "secret_sauce")
                .addProductToCart("Sauce Labs Bolt T-Shirt");
        cartPage.openCardPage();
        checkoutPage.pressCheckoutButton()
                .openCheckoutPage()
                .pressContinueButton();
        Assert.assertEquals(checkoutPage.getErrorText(), "Error: First Name is required");
    }
}
