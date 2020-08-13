package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OfficePhonesPage extends BasePage {

    @FindBy(xpath = "//div[@data-product='150332']/div/a")
    private WebElement addToCartPanasonicButton;

    @FindBy(id = "js_cart")
    private WebElement addToCartPopup;

    @FindBy(xpath = "//span[@class='js_plus btn-count btn-count--plus ']")
    private WebElement addToCartOneMoreItem;

    @FindBy(xpath = "//div[@class='btns-cart-holder']//a[contains(@class,'btn--orange')]")
    private WebElement continueButton;

    public OfficePhonesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddToCartPanasonicButton() {
        return addToCartPanasonicButton;
    }

    public void clickAddToCartPanasonicButton() {
        addToCartPanasonicButton.click();
    }

    public WebElement getAddToCartPopup() {
        return addToCartPopup;
    }

    public void clickAddToCartOneMoreItem() {
        addToCartOneMoreItem.click();
    }

    public WebElement getContinueShoppingButton() {
        return continueButton;
    }

    public void clickContinueShoppingButton() {
        continueButton.click();
    }
}
