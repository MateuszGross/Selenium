import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class SeleniumTest {

    @Test
    public void chromeOpenTest() {
        String driverPath = "C:/Users/Admin/Desktop/JAVA/Selenium/src/main/resources/executables/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("C:\\Users\\Admin\\Desktop\\MaterialyDoSelenium\\Test.html");
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

        //SPRAWDZENIE CZY ELEMENT ISTNIEJE NA STRONIE
        //checkIfElementExist(By.tagName("a"), driver);
        //checkIfElementExist(By.tagName("abbbbbbbbbbbbbbbbbbbbbbb"), driver);

        //JAK WYZEJ ALE ZA POMOCA BLOKU TRY CATCH
        //checkIfElementExist(By.tagName("a"), driver);
        //checkIfElementExist(By.tagName("abbbbbbbbbbbbbbbbbbbbbbb"), driver);

        //PRZELACZANIE POMIEDZY OKNAMI
       /* WebElement newPageButton = driver.findElement(By.id("newPage"));
        newPageButton.click();
        String currentWindowName = driver.getWindowHandle();
        switchToNewWindow(driver, currentWindowName);
        System.out.println("Tytul strony z aktywnego okna: " + driver.getTitle());
        System.out.println("Obecny URL to: " + driver.getCurrentUrl());

        //POWROT DO POPRZEDNIEGO OKNA
        driver.switchTo().window(currentWindowName);
        driver.findElement(By.name("username")).sendKeys(" Duck");*/

        //UZYWANIE PRZEGLADARKI ZA POMOCA SELENIUM
        driver.get("https://www.google.com");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumPageLink = driver.findElement(By.className("iUh30"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        seleniumPageLink.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement readMoreLink = driver.findElement(By.className("read-more"));
        readMoreLink.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    //METODA PRZEGLADAJACA OKNA
    //JEZELI W KOLEKCJI BEDZIE WIECEJ NIZ JEDNO OKNO TO PRZELACZA SIE NA OKNO KTOREGO NAZWA JEST INNA OD OBECNIE OTWARTEGO

    private void switchToNewWindow(WebDriver driver, String currentWindowName) {
        System.out.println("Wartosc zmiennej currentWindowName: " + currentWindowName);
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Ilosc okien przegladarki: " + windows.size());

        for(String window : windows) {
            if(!window.equals(currentWindowName))
            {
                driver.switchTo().window(window);
            }
        }
    }

    //METODY SPRAWDZAJACE CZY ELEMENT ISTNIEJE NA STRONIE
    public boolean checkIfElementExist(By locator, WebDriver driver)
    {
        if(driver.findElements(locator).size()>0)
        {
            System.out.println("Element istnieje na stronie.");
            return true;
        }
        System.out.println("Element nie istnieje na stronie.");
        return false;
    }

    public void checkIfElementExist(WebDriver driver, By locator)
    {
        try {
            driver.findElements(locator);
            System.out.println("Element istnieje na stronie.");

        }catch (NoSuchElementException ex) {
            System.out.println("Element nie istnieje na stronie.");
        }
    }

}