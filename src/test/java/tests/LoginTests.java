package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void emptyUserNameAndPasswordFieldsTest() {
        loginPage.openPage()
                .login("","");
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");
    }

    @Test
    public void fillFullLoginFieldsTest() {
        loginPage.openPage()
                .login("standard_user", "secret_sauce");
        Assert.assertEquals(productsPage.getBaseUrl(), "https://www.saucedemo.com/inventory.html");
    }

    @Test
    public void fillWithEmptyUsernameAndValidPasswordTest() {
        loginPage.openPage()
                .login("", "secret_sauce");
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");
    }

    @Test
    public void fillWithValidUsernameAndEmptyPasswordTest() {
        loginPage.openPage()
                .login("standard_user", "");
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Password is required");
    }
}
