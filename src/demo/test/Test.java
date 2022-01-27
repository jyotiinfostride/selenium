package demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	

//Thread.sleep(5000)

public class Test {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        driver.findElement(By.id("inventory_sidebar_link")).click();
       driver.findElement(By.id("about_sidebar_link")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();
       driver.findElement(By.id("reset_sidebar_link")).click();
        driver.findElement(By.id("react-burger-cross-btn")).click();
        driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
        // Select se = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
              // se.selectByValue("az");
              // Select se = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
              // se.selectByValue("za");
             //  Select se = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
              // se.selectByValue("lohi");
             //  Select se = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
             //  se.selectByValue("hilo");
       driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
      driver.findElement(By.id("shopping_cart_container")).click();
       driver.findElement(By.id("checkout")).click();
       driver.findElement(By.id("first-name")).sendKeys("Gun");
       driver.findElement(By.id("last-name")).sendKeys("Sharma");
       driver.findElement(By.id("postal-code")).sendKeys("A1A 1A1");
       driver.findElement(By.id("continue")).click();
         driver.findElement(By.id("finish")).click();
         driver.findElement(By.id("back-to-products")).click();
         driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
         driver.findElement(By.id("shopping_cart_container")).click();
         driver.findElement(By.id("continue-shopping")).click();
         driver.findElement(By.id("checkout")).click();
         driver.findElement(By.id("first-name")).sendKeys("Nitin");
         driver.findElement(By.id("last-name")).sendKeys("Kumar");
         driver.findElement(By.id("postal-code")).sendKeys("49715");
         driver.findElement(By.id("continue")).click();
         driver.findElement(By.id("cancel")).click();
         driver.findElement(By.id("finish")).click();
         driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
         driver.findElement(By.id("shopping_cart_container")).click();
          driver.findElement(By.id("checkout")).click();
         driver.findElement(By.id("first-name")).sendKeys("Priya");
         driver.findElement(By.id("last-name")).sendKeys("Patil");
         driver.findElement(By.id("postal-code")).sendKeys("48001");
         driver.findElement(By.id("continue")).click();
         driver.findElement(By.id("cancel")).click();
         driver.findElement(By.id("finish")).click();
         driver.findElement(By.id("back-to-products")).click();
         driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
         driver.findElement(By.id("shopping_cart_container")).click();
         driver.findElement(By.id("continue-shopping")).click();
         driver.findElement(By.id("checkout")).click();
         driver.findElement(By.id("first-name")).sendKeys("Nitin");
         driver.findElement(By.id("last-name")).sendKeys("Rana");
         driver.findElement(By.id("postal-code")).sendKeys("00125");
         driver.findElement(By.id("continue")).click();
         driver.findElement(By.id("cancel")).click();
         driver.findElement(By.id("finish")).click();
         driver.findElement(By.id("back-to-products")).click();
         driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
         driver.findElement(By.id("shopping_cart_container")).click();
         driver.findElement(By.id("checkout")).click();
         driver.findElement(By.id("first-name")).sendKeys("Ram");
         driver.findElement(By.id("last-name")).sendKeys("Kumar");
         driver.findElement(By.id("postal-code")).sendKeys("72471");
         driver.findElement(By.id("continue")).click();
         driver.findElement(By.id("finish")).click();
         driver.findElement(By.id("cancel")).click();
         driver.findElement(By.id("back-to-products")).click();driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
         driver.findElement(By.id("shopping_cart_container")).click();
         driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
         driver.findElement(By.id("checkout")).click();
         driver.findElement(By.id("first-name")).sendKeys("Dimple");
         driver.findElement(By.id("last-name")).sendKeys("Sharma");
         driver.findElement(By.id("postal-code")).sendKeys("27916");
         driver.findElement(By.id("continue")).click();
         driver.findElement(By.id("finish")).click();
         driver.findElement(By.id("back-to-products")).click();

         //Thread.sleep(6000);
       //  driver.quit();
         

	}

}
