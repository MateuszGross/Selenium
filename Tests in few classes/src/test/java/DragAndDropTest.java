import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseSeleniumTest {

    @Test
    public void dragAndDropTest() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Actions action = new Actions(driver);
        Thread.sleep(1000);
        action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droptarget"))).build().perform();
    }
}
