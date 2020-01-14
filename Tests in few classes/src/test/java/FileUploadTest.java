import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest extends BaseSeleniumTest {

    @Test
    public void uploadFileTest() {
        driver.get("file:///C:/Users/Admin/Desktop/JAVA/Selenium/FileUpload.html");
        String path = new File("src/main/resources/test970261800.png").getAbsolutePath();
        WebElement input = driver.findElement(By.id("myFile"));
        input.sendKeys(path);

    }
}
