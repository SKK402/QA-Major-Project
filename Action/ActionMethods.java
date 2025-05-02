package polarisweb;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class Testiiii {
	WebDriver driver;
	String id;
	String xpath;
	WebElement element;

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
  @Test(priority=1)
    public void hover() throws InterruptedException {
	driver.get("https://www.xbox.com/en-IN/");
		Thread.sleep(2000);
    	Actions a=new Actions(driver);
    	id="uhfCatLogo";
    	element=driver.findElement(By.id(id));
    	a.moveToElement(element).perform();
    	
    	
}
  @Test(priority=2)
  public void clickMe() throws InterruptedException {
		driver.get("https://www.xbox.com/en-IN/");
  	id="c-shellmenu_46";
  	element=driver.findElement(By.id(id));
  	element.click();
  	
  }
  @Test(priority=3)
  public void input() throws InterruptedException {
  	driver.get("https://www.xbox.com/en-IN/");
  	Thread.sleep(2000);
  	Actions a = new Actions(driver);

  	driver.findElement(By.id("search")).click();
  	WebElement element = driver.findElement(By.id("cli_shellHeaderSearchInput"));
  	element.click();
  	element.sendKeys("Baldur");
  	element.sendKeys(Keys.ENTER);

  	Thread.sleep(2000); 

  	driver.findElement(By.id("search")).click();
  	element = driver.findElement(By.id("cli_shellHeaderSearchInput"));

  	a.click(element).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();

  	element.clear();
  	Thread.sleep(2000);

  	a.click(element).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
  }

  @AfterMethod
  public void closeBrowser() throws InterruptedException {
  	Thread.sleep(2000);
      driver.quit();
  }
}
    	
