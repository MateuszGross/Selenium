package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ResultPage;

import java.util.List;

@Test
public class SearchHotelTest extends BaseSeleniumTest {

    public void searchHotelTest() {
        driver.get("http://www.kurs-selenium.pl/demo/");
        HomePage homePage = new HomePage(driver);
        homePage.setCityHotel("Dubai");
        homePage.setDateRange("09/11/2020", "09/13/2020");
        homePage.setTravellers("2","3");
        homePage.performSearch();

        ResultPage resultPage = new ResultPage(driver);

        List<String> hotelNames = resultPage.getHotelNames();
            Assert.assertEquals(hotelNames.get(0),"Jumeirah Beach Hotel");
            Assert.assertEquals(hotelNames.get(1),"Oasis Beach Tower");
            Assert.assertEquals(hotelNames.get(2), "Rose Rayhaan Rotana");
            Assert.assertEquals(hotelNames.get(3),"Hyatt Regency Perth");

        List<String> prices = resultPage.getHotelPrices();
        Assert.assertEquals("$22", prices.get(0));
        Assert.assertEquals("$50", prices.get(1));
        Assert.assertEquals("$80", prices.get(2));
        Assert.assertEquals("$150", prices.get(3));
    }
}
