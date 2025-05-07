package polarisweb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
WebDriver driver;
JavascriptExecutor js;
    
    @BeforeMethod
	public void openBrowser() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			js=(JavascriptExecutor) driver;
	}
    @Test(priority=1)
    public void JSExecutor() throws InterruptedException{
    	driver.get("https://www.xbox.com/en-IN/");
        js.executeScript("window.scrollBy(arguments[0],arguments[1])",0,600);
    	Thread.sleep(3000);
    	js.executeScript("window.scrollBy(arguments[0],arguments[1])",0,-600);
    	js.executeScript("window.scrollBy(0,document.body.scrollHeight);");

        js.executeScript("document.body.style.zoom='20%';");
        Thread.sleep(3000);
        js.executeScript("document.body.style.zoom='120%';");
        
    	String id = "c-shellmenu_46";
    	WebElement btn=driver.findElement(By.id(id));
    	js.executeScript("arguments[0].setAttribute('disabled','')",btn);
    	js.executeScript("arguments[0].style.border = '200px solid cyan'",btn);
    }
    

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
    	Thread.sleep(2000);
        driver.quit();
    }

}
