import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class WaitsTest extends BaseSeleniumTest {

    @Test
    public void waitTest() {

        driver.get("C:/Users/Admin/Desktop/JAVA/Selenium/Waits2.html");
        driver.findElement(By.id("clickOnMe")).click();
        waitForWebElement(By.tagName("p"));
        WebElement paragraph = driver.findElement(By.tagName("p"));
        System.out.println(paragraph.getText());
        Assert.assertTrue(paragraph.getText().equals("Dopiero się pojawiłem!"));
    }

    private void waitForWebElement(By locator) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.pollingEvery(Duration.ofMillis(500)); //wykonuje zapytanie o element którego poszukujemy
        wait.withTimeout(Duration.ofSeconds(10L));
        wait.ignoring(NoSuchElementException.class); //dodajemy ponieważ fluent wait nie ignoruje NoFundException
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
