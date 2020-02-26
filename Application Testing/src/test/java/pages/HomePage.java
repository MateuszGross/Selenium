package pages;

import helpers.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//div[@class='select2-result-label']")
    private WebElement selectResult;

    private SeleniumHelper helper;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.helper = new SeleniumHelper(driver);
        this.driver = driver;
    }

    public void setCityHotel(String cityName) {
        searchSpan.click();
        searchCityInput.sendKeys(cityName);
        By locationLabel = By.xpath("//div[@class='select2-result-label']");
        helper.waitForElementToBeDisplayed(locationLabel);
        //helper.waitForElementToBeDisplayed(selectResult);
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

}

