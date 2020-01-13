import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavascriptExecution extends BaseSeleniumTest{

    @Test
    public void googleSearchTest(){
        driver.get("https://www.google.com");
        WebElement searchInput = driver.findElement(By.name("q"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        //Jesli sendKeys z jakiegos powodu nie dziala to ratujemy sie javascriptem
        //executor.executeScript("alert('Hello World')");
        //executor.executeScript("arguments[0].click()", searchInput);
        executor.executeScript("arguments[0].setAttribute('value','Selenium')", searchInput);
        searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumLink = driver.findElement(By.className("iUh30"));
        executor.executeScript("arguments[0].click();", seleniumLink);
        //seleniumPageLink.click();
    }
}
