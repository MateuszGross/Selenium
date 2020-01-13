import org.openqa.selenium.*;
import org.testng.annotations.Test;


public class GoogleSearchTest extends BaseSeleniumTest{

    @Test
    public void googleSearchTest(){
        driver.get("https://www.google.com");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumPageLink = driver.findElement(By.className("iUh30"));
        seleniumPageLink.click();
    }
}
