import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitsTest extends BaseSeleniumTest {

    @Test
    public void waitTest() {
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        driver.get("C:/Users/Admin/Desktop/JAVA/Selenium/Waits2.html");
        driver.findElement(By.id("clickOnMe")).click();
        WebElement paragraph = driver.findElement(By.tagName("p"));
        System.out.println(paragraph.getText());
        Assert.assertTrue(paragraph.getText().equals("Dopiero się pojawiłem!"));
    }
}
