package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SmartHouse extends BasePage {

    public SmartHouse(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='container-main']//span[contains(@id, 'sort')]")
    private WebElement sortCombobox;

    @FindBy(xpath = "//li[contains(@id,'pricedesc')]")
    private WebElement sortDescendingOrder;

    @FindBy(xpath = "//div[@class='prod-cart__prise-new']")
    private List<WebElement> sortResultsProductsListText;

    public WebElement getSortCombobox() {
        return sortCombobox;
    }

    public void clickSortCombobox() {
        sortCombobox.click();
    }

    public void clickSortDescendingOrder() {
        sortDescendingOrder.click();
    }

    public List<WebElement> getSortResultsProductsList() {
        return sortResultsProductsListText;
    }
}

