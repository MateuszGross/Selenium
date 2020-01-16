import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


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
        WebDriverWait wait = new WebDriverWait(driver, 10L);
        wait.until(driver1 -> {
            System.out.println("Sprawdzam czy element jest wyświetlony");   //LUB   List<WebElement> elements = driver.findElements(locator); przy uzyciu listy wchodzimy do elsa, w przypadku bez listy pomijamy else ponieważ ignorujemy wyjątek
            if (driver.findElement(locator).isDisplayed()) {                         //if(elements.size()>0) {
                System.out.println("Element jest wyświetlony");
                return true;
            } else {
                System.out.println("Element nie jest wyświetlony");
                return false;
            }
        });
    }
}

