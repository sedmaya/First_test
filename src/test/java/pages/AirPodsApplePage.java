package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AirPodsApplePage extends BasePage {

    @FindBy(xpath = "//div[@class='item-prod col-lg-3'][contains(@data-product,'216120')]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[contains(@class,'right')]//i[@class='icon icon-like']")
    private WebElement addToFavouriteIcon;

    public AirPodsApplePage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void clickAddToFavouriteIcon() {
        addToFavouriteIcon.click();
    }

    public WebElement getAddToFavouriteIcon() {
        return addToFavouriteIcon;
    }

}
