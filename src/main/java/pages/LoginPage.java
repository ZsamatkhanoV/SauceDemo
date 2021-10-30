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
    private static final String ERROR_BUTTON = "//*[contains(text(),'Epic')]";

    public void login(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void loginEmpty() {
        driver.findElement(USERNAME_INPUT);
        driver.findElement(PASSWORD_INPUT);
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void loginFull() {
        driver.findElement(USERNAME_INPUT).sendKeys("dsds");
        driver.findElement(PASSWORD_INPUT).sendKeys("adada");
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void loginFillOnlyPasswordField() {
        driver.findElement(PASSWORD_INPUT).sendKeys("dadad");
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void loginFillOnlyUsernameField(){
        driver.findElement(USERNAME_INPUT).sendKeys("erwe");
        driver.findElement(LOGIN_BUTTON).click();
    }

    public String getErrorMassage(String errorMassage) {
        return driver.findElement(By.xpath(String.format(ERROR_BUTTON, errorMassage))).getText();
    }
}
