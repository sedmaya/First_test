package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PhonesAndAccessoriesPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'column')]/a[contains(@href, 'telefonyi')]")
    private WebElement officePhonesButton;

    public PhonesAndAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOfficePhonesButton() {
        officePhonesButton.click();
    }

    public WebElement getOfficePhonesButton() {
        return officePhonesButton;
    }

}
