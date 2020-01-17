import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class GoogleSearchTest extends BaseSeleniumTest{

    @FindBy(name = "q")
    private  WebElement searchInput;

    @Test
    public void googleSearchTest(){
        SeleniumHelper helper = new SeleniumHelper(driver);
        PageFactory.initElements(driver, this ); //lub (driver, GoogleSearchTest.class); page factory inicjaluzuje nam search input
        driver.get("https://www.google.com");
        searchInput.sendKeys("Selenium");
        helper.takeScreenshot();
        searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumPageLink = driver.findElement(By.className("iUh30"));
        seleniumPageLink.click();
        helper.takeScreenshot();
    }

    /*@Test
    public void googleSearchTest2(){ //przy użyciu page factory możemy odwoływać się do searchInput z każdego testu w klasie
    searchInput
    }*/

}
