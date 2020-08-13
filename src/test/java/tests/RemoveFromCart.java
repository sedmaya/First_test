package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RemoveFromCart extends BaseTest {

    private static final String EXPECTED_CART_IS_EMPTY_MESSAGE = "Корзина пустая!";

    @Test
    public void checkRemoveFromCart() {
        getHomePage().clickAddToCartXiaomiAirDotsButton();
        getHomePage().waitForElementVisibility(30, getHomePage().getContinueShoppingButton());
        getHomePage().clickDataCartRemoveButton();
        getBasePage().waitForElementVisibility(30, getHomePage().getContinueShoppingButton());
        getBasePage().waitForElementVisibility(30, getHomePage().getCartIsEmptyParagraph());
        String cartIsEmpty = getHomePage().getCartIsEmptyMessage();
        assertEquals(cartIsEmpty, EXPECTED_CART_IS_EMPTY_MESSAGE);
    }

}
