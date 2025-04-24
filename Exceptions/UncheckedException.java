package polarisweb;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    


    @Test(priority = 1)
    public void searchGoogle() throws InterruptedException {
        driver.get("https://www.xbox.com/en-IN/");

        try {
        	WebElement inputbox = driver.findElement(By.xpath("123"));
        } catch (NoSuchElementException e) {
            System.out.println("Search not found");
            }
        }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        driver.quit();
    }
}
