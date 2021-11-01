package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void emptyUserNameAndPasswordFieldsTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");
    }

    @Test
    public void fillFullLoginFieldsTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.loginWithValidData("dsds", "adada");
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void fillOnlyPasswordFieldTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.loginFillOnlyPasswordField("dadad");
        Assert.assertEquals(loginPage.getErrorMessage(),"Epic sadface: Username is required");
    }

    @Test
    public void fillOnlyUsernameFieldTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.loginFillOnlyUsernameField("erwe");
        Assert.assertEquals(loginPage.getErrorMessage(),"Epic sadface: Password is required");
    }
}
