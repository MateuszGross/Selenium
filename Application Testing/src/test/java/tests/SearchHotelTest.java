package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Test
public class SearchHotelTest extends BaseSeleniumTest {

    public void searchHotelTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
        driver.get("http://www.kurs-selenium.pl/demo/");
        HomePage homePage = new HomePage(driver);
        homePage.setCityHotel("Dubai");
        homePage.setDateRange("09/11/2020", "09/13/2020");
        homePage.setTravellers("2","2");
        homePage.performSearch();
        Thread.sleep(2000);
        List<String> hotelNames = homePage.getHotelNames();
            Assert.assertEquals("Jumeirah Beach Hotel", hotelNames.get(0));
            Assert.assertEquals("Oasis Beach Tower", hotelNames.get(1));
            Assert.assertEquals("Rose Rayhaan Rotana", hotelNames.get(2));
        List<String> prices = homePage.getHotelPrices();
        Assert.assertEquals("$22", prices.get(0));
        Assert.assertEquals("$50", prices.get(1));
        Assert.assertEquals("$80", prices.get(2));
    }
}
