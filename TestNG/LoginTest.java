package TestNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends Demo1 {
	@Test
	public void Login()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.navigate().back();
		
	}
	
}
