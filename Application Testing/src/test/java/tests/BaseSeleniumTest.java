package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseSeleniumTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        String driverPath = "C:\\Users\\Admin\\Desktop\\JAVA\\Selenium\\Application Testing\\src\\main\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        //driver.quit();

    }
}
