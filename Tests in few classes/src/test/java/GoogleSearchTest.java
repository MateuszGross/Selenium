import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class GoogleSearchTest extends BaseSeleniumTest{

    @Test
    public void googleSearchTest(){
        SeleniumHelper helper = new SeleniumHelper(driver);
        driver.get("https://www.google.com");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        helper.takeScreenshot();
        searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumPageLink = driver.findElement(By.className("iUh30"));
        seleniumPageLink.click();
        helper.takeScreenshot();
    }
}
