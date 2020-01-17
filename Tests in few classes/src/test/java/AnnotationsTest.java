import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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

    @FindBy(xpath = "//input")
    private List<WebElement> inputs;

    @FindBy(xpath = "//button")
    private List<WebElement> buttons;

    @FindAll({
            @FindBy(xpath = "//input"),
            @FindBy(xpath = "//button")
    })
    private List<WebElement> inputsAndButtons;

    @Test
    public void googleSearchTest(){
        PageFactory.initElements(driver, this ); //lub (driver, GoogleSearchTest.class); page factory inicjaluzuje nam search input
        driver.get("C:\\Users\\Admin\\Desktop\\JAVA\\Selenium\\Test.html");
        System.out.println("Input size is: " + inputs.size());
        System.out.println("Buttons size is: " + buttons.size());


        System.out.println("Input and buttons size is: " + inputsAndButtons.size());


    }

}
