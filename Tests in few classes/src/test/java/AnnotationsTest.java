import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;


public class AnnotationsTest extends BaseSeleniumTest{

    @FindBys({  //kolejnosc ma znaczenie, jezeli zamienimy table z tableHeader to nie znajdzie nam zadnych elementow
            @FindBy(tagName = "table"),
            @FindBy(className ="tableHeader")
    })
    private List<WebElement> elements;

    @Test
    public void googleSearchTest(){
        SeleniumHelper helper = new SeleniumHelper(driver);
        PageFactory.initElements(driver, this ); //lub (driver, GoogleSearchTest.class); page factory inicjaluzuje nam search input
        driver.get("C:\\Users\\Admin\\Desktop\\JAVA\\Selenium\\Test.html");
        System.out.println("Elements size is " + elements.size());

    }

}
