package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo1 {
	public static WebDriver driver;
	String path;
	
@BeforeSuite
	void login() {
//	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
//	System.setProperty("Webdriver.chrome.driver", path);
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
		
}	
@AfterSuite
public void Close_Browser()
{
	driver.close();
}
}
