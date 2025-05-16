
package qa;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Content{
	WebDriver driver;
    WebDriverWait wait;
    String id;
    JavascriptExecutor js;
    WebElement element;
	 @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("Before Suite");
	    }
	    @BeforeTest
	    public void openBrowser() {
	       
	    }



	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("Before Class");
	    }

	    @BeforeMethod(alwaysRun = true)
	    public void beforeMethod() throws InterruptedException {
	    	 WebDriverManager.chromedriver().setup();
	         driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	         js = (JavascriptExecutor)driver;
	         driver.get("https://www.xbox.com/en-IN/");
	    }
	    @Test
	    public void getTitle() throws InterruptedException{
	    	String title = driver.getTitle();
	    	
	    	Assert.assertEquals(title, "XBOX");
	    }
	    
	    @AfterMethod(alwaysRun =true)
	    public void afterMethod() throws InterruptedException{
	        Thread.sleep(2000);
	        driver.quit();
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("After Class");
	    }

	    @AfterTest
	    public void afterTest() {
	        System.out.println("After Test");
	    }

	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("After Suite");
	    }
}
