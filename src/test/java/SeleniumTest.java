import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumTest {

    @Test
    public void chromeOpenTest() {
        String driverPath = "C:/Users/Admin/Desktop/Kurs JAVA/Selenium1/src/main/resources/executables/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\Admin\\Desktop\\MaterialyDoSelenium\\Test.html");
        /*WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        WebElement firstNameInput = driver.findElement(By.name("fname"));
        WebElement W3schools = driver.findElement(By.linkText("Visit W3Schools.com!"));
        WebElement googleLink = driver.findElement(By.partialLinkText("Weird"));
        WebElement topSecret = driver.findElement(By.className("topSecret"));
        WebElement firstInput = driver.findElement(By.tagName("input"));*/

        //KLIKANIE PO STRONIE
        /*WebElement clickOnMeCssButton = driver.findElement(By.id("clickOnMe"));
        clickOnMeCssButton.click();

        //POMINIĘCIE ALERTU Z KLIKNIĘCIA ABY WPISAĆ TEKST
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Mateusz");
        WebElement firstUserNameInput = driver.findElement(By.name("username"));
        firstUserNameInput.clear();
        firstUserNameInput.sendKeys("Brzęczyszczykiewicz");*/
        //WYBÓR Z LISTY PO WIDOCZNYM TEKSCIE
        /*Select carSelect = new Select(driver.findElement(By.tagName("select")));
        carSelect.selectByVisibleText("Saab");*/

        //POBIERANIE WARTOSCI Z POLA
        /*WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Mateusz");
        System.out.println("Wartość to: " + firstNameInput.getText());
        System.out.println("Wartość to: " + firstNameInput.getAttribute("value"));
        WebElement labelInput = driver.findElement(By.tagName("label")); //Znajdzie nam pierwszy element label na stronie
        System.out.println("Wartość dla tagu label: " + labelInput.getText());
        //aby znaleźć drugi postępujemy jak  niżej
        List<WebElement> labels = driver.findElements(By.tagName("label"));
        System.out.println("Wartość drugiego labela to: " + labels.get(1).getText());*/

        //CHECKBOX I RADIO BUTTON
        /*WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        checkbox.click();

        WebElement radioButton = driver.findElement(By.xpath("//input[@value='male']"));
        radioButton.click();*/

        //POBIERANIE TEKSTU Z UKRYTEGO ELEMENTU
     /* WebElement paragraph = driver.findElement(By.className("topSecret"));
        System.out.println("Ukryty tekst to: " + paragraph.getAttribute("textContent")); //dziala*/

        //SPRAWDZANIE CZY OBRAZEK POBRAL SIE PRAWIDLOWO
        /*
        WebElement smileImage = driver.findElement(By.id("smileImage"));
        System.out.println(smileImage.getAttribute("naturalHeight"));
        */

        //SPRAWDZENIE CZY ELEMENT JEST EDYTOWALNY
        /*WebElement firstNameInput = driver.findElement(By.name("fname"));
        firstNameInput.sendKeys("Mateusz");
        //jeżeli element będzie wyszarzony ('disabled' przy polu) to selenium wyrzuci nam błąd
        if(firstNameInput.isEnabled())
        {
            System.out.println("Element nie jest zablokowany dla użytkownika");
        }
        else
        {
            System.out.println("Element jest zablokowany");
        }*/

        //SPRAWDZENIE CZY CHECKBOX JEST ZAZNACZONY
        /*WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        checkbox.click();
        if(checkbox.isSelected())
            System.out.println("Checkbox jest zaznaczony");
        else
            System.out.println("Checkbox nie jest zaznaczony");*/

        driver.quit();
    }
}
