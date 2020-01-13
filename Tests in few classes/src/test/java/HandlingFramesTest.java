import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HandlingFramesTest extends BaseSeleniumTest {

    @Test
    public void handlingFramesTest(){
        driver.get("file:///C:/Users/Admin/Desktop/MaterialyDoSelenium/iFrameTest.html");
        driver.switchTo().frame(0);
        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();
        driver.switchTo().alert().accept();
        //driver.switchTo().defaultContent(); //switch do pierwotnego htmla
        List<WebElement> headers = driver.findElements(By.tagName("h1"));
        System.out.println(headers.size());
        headers.forEach(WebElement ->
                System.out.println(WebElement.getText()));
    }
}
