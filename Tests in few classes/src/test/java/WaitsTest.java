import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        Wait<WebDriver> wait = new WebDriverWait(driver, 10L);
        ((WebDriverWait) wait).pollingEvery(Duration.ofMillis(500)); //wykonuje zapytanie o element którego poszukujemy
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
