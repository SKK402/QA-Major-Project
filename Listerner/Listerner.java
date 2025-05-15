package class3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Base {
	static Properties prop;
	static WebDriver driver;
	
	public Base() {
		prop = new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream("src/main/resources/config.properties");
			prop.load(file);
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		initialize();
		
	}
	public void initialize() {
		String browserName = prop.getProperty("browser");
		if(browserName == "chrome") {
			System.out.println("chrome driver initialized");		}
	}
	
	public String getUsername() {
		return prop.getProperty("username");
	}
}
