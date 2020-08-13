package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IphonePage extends BasePage {
    @FindBy(xpath = "//a[@class='prod-cart__buy'][contains(@data-ecomm-cart,'White (MWL82)')]")
    private WebElement addToCartButton;

    @FindBy(id = "js_cart")
    private WebElement addToCartPopup;


    public IphonePage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public WebElement getAddToCartPopup() {
        return addToCartPopup;
    }

}
