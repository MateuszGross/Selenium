import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClickTest extends BaseSeleniumTest {

    @Test
    public void doubleClickTest() {
        driver.get("file:///C:/Users/Admin/Desktop/JAVA/Selenium/DoubleClick.html");
        WebElement button = driver.findElement(By.id("bottom"));
        Actions action = new Actions(driver);
        action.moveToElement(button);
        action.doubleClick().build().perform();
        Assert.assertTrue(driver.getWindowHandles().size()>1);

    }
}
