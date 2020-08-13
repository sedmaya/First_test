package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;

public class BaseTest {
    private WebDriver driver;
    private static final String AVIC_URL = "https://avic.ua/";


    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();//создаем экзаемпляр хром драйвера
        driver.manage().window().maximize();//открыли браузер на весь экран
        driver.get(AVIC_URL);//открыли сайт
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public BasePage getBasePage() {
        return new BasePage(getDriver());
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(getDriver());
    }

    public AppleStorePage getAppleStorePage() {
        return new AppleStorePage(getDriver());
    }

    public IphonePage getIphonePage() {
        return new IphonePage(getDriver());
    }

    public PhonesAndAccessoriesPage getPhonesAndAccessoriesPage() {
        return new PhonesAndAccessoriesPage(getDriver());
    }

    public OfficePhonesPage getOfficePhonesPage() {
        return new OfficePhonesPage(getDriver());
    }

    public AirPodsApplePage getAirpodsApplePage() {
        return new AirPodsApplePage(getDriver());
    }

    public SmartHouse getSmartHousePage() {
        return new SmartHouse(getDriver());
    }

}
