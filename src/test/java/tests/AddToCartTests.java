package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTests extends BaseTest {
    private static final String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "1";
    private static final String EXPECTED_AMOUNT_OF_PRODUCTS_IN_POPUPS_CART = "2";

    @Test()
    public void checkAddToCart() {
        getHomePage().clickCatalogueButton();
        getHomePage().clickAppleStoreButton();
        getBasePage().waitForElementVisibility(30, getAppleStorePage().getIphoneButton());
        getAppleStorePage().clickIphoneButton();
        getBasePage().waitForPageReadyState(30);
        getIphonePage().clickAddToCartButton();
        getBasePage().waitForElementVisibility(30, getIphonePage().getAddToCartPopup());
        getHomePage().clickContinueShoppingButton();
        getBasePage().waitForElementVisibility(30, getHomePage().getAmountOfItemsInCart());
        assertEquals(getHomePage().getAmountOfProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
    }

    @Test()
    public void checkAddOneMoreToCart() {
        getHomePage().clickPhonesAndAccessoriesButton();
        getBasePage().waitForElementVisibility(30, getPhonesAndAccessoriesPage().getOfficePhonesButton());
        getPhonesAndAccessoriesPage().clickOfficePhonesButton();
        getBasePage().waitForElementVisibility(30, getOfficePhonesPage().getAddToCartPanasonicButton());
        getOfficePhonesPage().clickAddToCartPanasonicButton();
        getBasePage().waitForElementVisibility(30, getOfficePhonesPage().getAddToCartPopup());
        getOfficePhonesPage().clickAddToCartOneMoreItem();
        getBasePage().waitForElementVisibility(30, getOfficePhonesPage().getContinueShoppingButton());
        getOfficePhonesPage().clickContinueShoppingButton();
        getBasePage().waitForElementVisibility(35, getHomePage().getAmountOfItemsInCart());
        assertEquals(getHomePage().getAmountOfProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_POPUPS_CART);
    }

    @AfterTest
    public void tearDown() {
        getDriver().close();
    }
}
