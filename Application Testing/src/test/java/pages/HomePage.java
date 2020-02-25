package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    @FindBy(xpath = "//span[text()='Search by Hotel or City Name']")
    private WebElement searchSpan;

    @FindBy(xpath = "//div[@id='select2-drop']//input")
    private WebElement searchCityInput;

    @FindBy(xpath = "//input[@placeholder='Check in']")
    private WebElement checkInInput;

    @FindBy(name = "checkout")
    private WebElement checkOutInput;

    @FindBy(id = "travellersInput")
    private WebElement travellersInput;

    @FindBy(id = "adultInput")
    private WebElement adultInput;

    @FindBy(id = "childInput")
    private WebElement childInput;

    @FindBy(xpath ="//button[text() = ' Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//table[@class='bgwhite table table-striped']")
    private WebElement resultsTable;

    @FindBy(xpath = "//div[@class='col-md-3 col-xs-4 col-sm-4 go-left pull-right price_tab']")
    private WebElement priceTable;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void setCityHotel(String cityName) throws InterruptedException {
        searchSpan.click();
        searchCityInput.sendKeys(cityName);
        Thread.sleep(3000);
        searchCityInput.sendKeys(Keys.ENTER);
    }

    public void setDateRange(String checkInDate, String checkOutDate) {
        checkInInput.sendKeys(checkInDate);
        checkOutInput.sendKeys(checkOutDate);
        checkOutInput.click();
    }

    public void setTravellers(String adultNumber, String childNumber) {
        travellersInput.click();
        adultInput.click();
        adultInput.clear();
        adultInput.sendKeys(adultNumber);
        childInput.click();
        childInput.clear();
        childInput.sendKeys(childNumber);
    }

    public void performSearch(){
        searchButton.click();
    }

    public void getHotelNames() {
       List<WebElement> hotelNames = resultsTable.findElements(By.xpath("//h4//b"));
       for (WebElement hotelName : hotelNames) {
           System.out.println(hotelName.getText());
       }
    }

    public void getHotelPrices() {
        List<WebElement> hotelPrices = resultsTable.findElements(By.xpath("//div[contains(@class,'price_tab')]//b"));
        hotelPrices.stream().forEach(hotelPrice ->
                System.out.println(hotelPrice.getText()));
    }
}

