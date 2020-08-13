package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SortDescending extends BaseTest {

    @Test
    public void checkSortDescendingOrder() {
        getHomePage().clickCatalogueButton();
        getHomePage().clickSmartHouseButton();
        getBasePage().waitForElementVisibility(30, getSmartHousePage().getSortCombobox());
        getSmartHousePage().clickSortCombobox();
        getSmartHousePage().clickSortDescendingOrder();
        ArrayList<String> obtainedList = new ArrayList<>();
        List<WebElement> elementList = getSmartHousePage().getSortResultsProductsList();
        for (WebElement element : elementList) {
            obtainedList.add(element.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>(obtainedList);
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        assertEquals(obtainedList, sortedList);
    }
}
