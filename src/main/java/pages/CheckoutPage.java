package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage{

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    private static final By CHECKOUT_BUTTON = By.xpath("//*[@id='checkout']");
    private static final By FIRST_NAME_INPUT = By.xpath("//*[@id='first-name']");
    private static final By LAST_NAME_INPUT = By.xpath("//*[@id='last-name']");
    private static final By ZIP_CODE_INPUT = By.xpath("//*[@id='postal-code']");
    private static final By CONTINUE_BUTTON = By.xpath("//*[@id='continue']");
    private static final String PRICE_CHECKOUT = "//*[@class='inventory_item_price']";
    private static final String ERROR_CHECKOUT = "//*[@class='error-message-container error']";
    private static final String CHECKOUT_URL = "checkout-step-one.html";

    public CheckoutPage pressCheckoutButton() {
        driver.findElement(CHECKOUT_BUTTON).click();
        return new CheckoutPage(driver);
    }

    public CheckoutPage openCheckoutPage() {
        openPage(BASE_URL+CHECKOUT_URL);
        return this;
    }

    public CheckoutPage fillAllValidFields(String firstname, String lastname, String zipcode) {
        driver.findElement(FIRST_NAME_INPUT).sendKeys(firstname);
        driver.findElement(LAST_NAME_INPUT).sendKeys(lastname);
        driver.findElement(ZIP_CODE_INPUT).sendKeys(zipcode);
        return this;
    }

    public CheckoutPage pressContinueButton() {
        driver.findElement(CONTINUE_BUTTON).click();
        return new CheckoutPage(driver);
    }

    public String getProductPrice(String productName) {
        return driver.findElement(By.xpath(String.format(PRICE_CHECKOUT, productName))).getText();
    }

    public String getErrorText() {
        return driver.findElement(By.xpath(ERROR_CHECKOUT)).getText();
    }
}
