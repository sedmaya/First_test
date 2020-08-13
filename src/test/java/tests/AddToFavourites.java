package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToFavourites extends BaseTest {
    public static final String EXPECTED_URL_ADDRESS = "https://avic.ua/sign-in";

    @Test
    public void checkAddToFavouriteAsksToSignIn() {
        getHomePage().clickAppleAirPodsButton();
        getAirpodsApplePage().clickAddToCartButton();
        getBasePage().waitForElementVisibility(30, getAirpodsApplePage().getAddToFavouriteIcon());
        getAirpodsApplePage().clickAddToFavouriteIcon();
        String currentURL = getDriver().getCurrentUrl();
        assertEquals(currentURL, EXPECTED_URL_ADDRESS);
    }
}
