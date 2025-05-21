package com.test.Login;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import com.test.Base.Base;
import com.test.ReportUtils.ExtentReport;

public class Login extends Base {
	@BeforeSuite
	public void setup() {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.xbox.com/en-IN/");
	}
	
    @FindBy(id = "nav-link-accountList") 
    WebElement loginButton;

    public Login() {
        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e");
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        return title;
    }

    public void clickLogin() {
        loginButton.click();
        System.out.println("Login button clicked.");
    }
}
