package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private static final By USERNAME_INPUT = By.xpath("//*[@id='user-name']");
    private static final By PASSWORD_INPUT = By.xpath("//*[@id='password']");
    private static final By LOGIN_BUTTON = By.xpath("//*[@id='login-button']");
    private static final String ERROR_BUTTON = "//*[@class='error-message-container error']";

    public void login(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void loginWithValidData(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void loginFillOnlyPasswordField(String password) {
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void loginFillOnlyUsernameField(String username){
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(LOGIN_BUTTON).click();
    }

    public String getErrorMessage() {
        return driver.findElement(By.xpath(ERROR_BUTTON)).getText();
    }
}
