package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement catalogueProductButton;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]")
    private WebElement appleStoreButton;

    @FindBy(xpath = "//ul[contains(@class, 'sidebar-list')]//li/a[contains(@href,'telefonyi-i-aks')]")
    private WebElement phonesAndAccessoriesButton;

    @FindBy(xpath = "//div[contains(@class,'header-bottom__cart')]//div[contains(@class,'cart_count')]")
    private WebElement amountOfProductsInCart;

    @FindBy(xpath = "//div[contains(@class,'between-xs')]//a[contains(@href, 'naushniki')]")
    private WebElement appleAirPodsButton;

    @FindBy(xpath = "//div[@data-product='216124']//a[contains(@href,'#')]")
    private WebElement addToCartXiaomiAirDotsButton;

    @FindBy(xpath = "//div[@class='btns-cart-holder']//a[contains(@class,'btn--orange')]")
    private WebElement continueButton;

    @FindBy(xpath = "//i[contains(@class,'btn-close')]")
    private WebElement dataCartRemoveButton;

    @FindBy(xpath = "//div[@data-cart-name='modal']//b")
    private WebElement cartIsEmptyMessage;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]/li/a[contains(@href,'ua/umnyij-dom')]")
    private WebElement smartHouseButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(String keyword) {
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public void clickCatalogueButton() {
        catalogueProductButton.click();
    }

    public void clickAppleStoreButton() {
        appleStoreButton.click();
    }

    public void clickPhonesAndAccessoriesButton() {
        phonesAndAccessoriesButton.click();
    }

    public WebElement getAmountOfItemsInCart() {
        return amountOfProductsInCart;
    }

    public String getAmountOfProductsInCart() {
        return amountOfProductsInCart.getText();
    }

    public void clickAppleAirPodsButton() {
        appleAirPodsButton.click();
    }

    public void clickAddToCartXiaomiAirDotsButton() {
        addToCartXiaomiAirDotsButton.click();
    }

    public WebElement getContinueShoppingButton() {
        return continueButton;
    }

    public void clickContinueShoppingButton() {
        continueButton.click();
    }

    public void clickDataCartRemoveButton() {
        dataCartRemoveButton.click();
    }

    public String getCartIsEmptyMessage() {
        return cartIsEmptyMessage.getText();
    }

    public WebElement getCartIsEmptyParagraph() {
        return cartIsEmptyMessage;
    }

    public void clickSmartHouseButton() {
        smartHouseButton.click();
    }
}
