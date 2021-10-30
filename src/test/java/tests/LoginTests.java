package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void emptyUserNameAndPasswordFieldsTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.loginEmpty();
        Assert.assertEquals(loginPage.getErrorMassage("Epic"), "Epic sadface: Username is required");
    }

    @Test
    public void fillFullLoginFieldsTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.loginFull();
        Assert.assertEquals(loginPage.getErrorMassage("Epic"), "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void fillOnlyPasswordFieldTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.loginFillOnlyPasswordField();
        Assert.assertEquals(loginPage.getErrorMassage("Epic"),"Epic sadface: Username is required");
    }

    @Test
    public void fillOnlyUsernameFieldTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.loginFillOnlyUsernameField();
        Assert.assertEquals(loginPage.getErrorMassage("Epic"),"Epic sadface: Password is required");
    }
}
