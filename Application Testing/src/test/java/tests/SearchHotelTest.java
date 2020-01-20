package tests;

import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

@Test
public class SearchHotelTest extends BaseSeleniumTest {

    public void searchHotelTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
        driver.get("http://www.kurs-selenium.pl/demo/");
        HomePage homePage = new HomePage(driver);
        homePage.setCityHotel("Dubai");
        homePage.setDateRange("09/11/2018", "09/13/2018");
        homePage.setTravellers("2","2");
        homePage.performSearch();
    }
}
