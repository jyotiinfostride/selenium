package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage extends Demo1 {
	String actualTitle;
	@Test
	public void verifyPage() 
	{
		actualTitle=driver.getTitle();
//		String expected= "I am High today";
		assertEquals(actualTitle,"saucedemo");
		
	}
	@Test
	public void Logout()
	{
		driver.findElement(By.linkText("Logout")).click();
	}

}
