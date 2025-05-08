package polarisweb;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Class {
WebDriver driver;
JavascriptExecutor js;
    
    @BeforeMethod
	public void openBrowser() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			js=(JavascriptExecutor) driver;
	}
    @Test(priority=1)
    public void Test() throws InterruptedException{
    	driver.get("https://www.xbox.com/en-IN/");
    	driver.findElement(By.xpath("//*[@id=\"mectrl_main_trigger\"]/div")).click();
    	WebElement a=driver.findElement(By.id("usernameEntry"));
    	a.click();
    	a.sendKeys("youremailorphonenumber");
    	driver.findElement(By.xpath("//*[@data-testid=\"primaryButton\"]")).click();
    	WebElement b=driver.findElement(By.id("passwordEntry"));
        b.click();
        b.sendKeys("yourpassword");
        driver.findElement(By.xpath("//*[@data-testid=\"primaryButton\"]")).click();
        driver.findElement(By.xpath("//*[@data-testid=\"primaryButton\"]")).click();
        js.executeScript("window.scrollBy(arguments[0],arguments[1])",0,1200);
        driver.findElement(By.xpath("//*[@id=\"ContentBlockList_5\"]/div/div/ul/li[7]/a")).click();
        ArrayList <String> tab= new ArrayList<>(driver.getWindowHandles());
    	driver.switchTo().window(tab.get(1));
       	WebElement e= driver.findElement(By.xpath("//*[@id=\"page-header\"]/yt-page-header-renderer/yt-page-header-view-model/div/div[1]/div/yt-dynamic-text-view-model/h1/span"));
    	String f=e.getText();
    	driver.close();
    	driver.switchTo().window(tab.get(0));
    	WebElement c=driver.findElement(By.id("search"));
    	c.click();
    	c.sendKeys(f);
    	c.sendKeys(Keys.ENTER);
    }
    @AfterMethod
    public void closeBrowser() throws InterruptedException {
    	Thread.sleep(2000);
        driver.quit();
    }

}
