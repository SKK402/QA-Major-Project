package polarisweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test(priority = 1)
    public void youtube() {
        driver.get("https://www.xbox.com/en-IN/");

        WebElement inputbox = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//*[@id=\"ContentBlockList_3\"]/div/div/a[2]/div/p/span")
        ));
        inputbox.click();

        WebElement editionLink = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//*[text() = \"Minecraft: Java & Bedrock Edition for PC\"]")
        ));
        editionLink.click();
    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
