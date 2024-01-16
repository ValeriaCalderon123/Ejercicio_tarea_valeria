package dev.magento;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
public class BaseTest {

    protected WebDriver driver;
    protected int TIME_OUT = 10;
   // protected String BASE_URL = "https://magento.softwaretestingboard.com/";

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

}
