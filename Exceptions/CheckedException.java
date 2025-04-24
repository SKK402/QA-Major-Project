package polarisweb;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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


    public class CheckedExample {
        public static void main(String[] args) {
            try {
                FileReader file = new FileReader("test.txt");
                System.out.println("File opened successfully");
            } catch (IOException e) {
                System.out.println("File not found or can't be read");
            }
        }
    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        driver.quit();
    }
}
