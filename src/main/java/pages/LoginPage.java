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
    private static final By BOT_LOGO = By.xpath("//*[@class='bot_column']");

    public ProductsPage login(String username, String password) {
        waitForElementLocated(USERNAME_INPUT, 10);
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return new ProductsPage(driver);
    }

    public String getErrorMessage() {
        return driver.findElement(By.xpath(ERROR_BUTTON)).getText();
    }

    public void waitForPageOpened() {
        waitForElementLocated(BOT_LOGO, 10);
    }

    public LoginPage openPage() {
        openPage(BASE_URL);
        waitForPageOpened();
        return this;
    }
}
