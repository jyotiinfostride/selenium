package demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.jodah.failsafe.internal.util.Assert;

public class Base {
	  static WebDriver driver;

	     void login() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.navigate().to("https://www.saucedemo.com/");
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();
	       // driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	       // driver.findElement(By.id("inventory_sidebar_link")).click();
	     //   driver.findElement(By.id("about_sidebar_link")).click();
	        //driver.findElement(By.id("logout_sidebar_link")).click();
	       // driver.findElement(By.id("reset_sidebar_link")).click();
	        //driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
	        //String ActTitile = driver.getTitle();
	        //Assert.assertEquals(ActTitile, "Swag Labs");
	      //  System.out.println("Match");
	      //  driver.close();

}
	  
	     void addtocartsaucelabsbackpack() {
	        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	       // String item = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
	       // Assert.assertEquals(item, "Sauce Labs Backpack");
	       // System.out.println("We are on right page.....");
	       // driver.findElement(By.id("shopping_cart_container")).click();
	        //driver.findElement(By.id("checkout")).click();
	        //driver.findElement(By.id("first-name")).sendKeys("Gun");
	        //driver.findElement(By.id("last-name")).sendKeys("Sharma");
	        //driver.findElement(By.id("postal-code")).sendKeys("A1A 1A1");
	        //driver.findElement(By.id("continue")).click();
	        //driver.findElement(By.id("finish")).click();
	        //driver.findElement(By.id("back-to-products")).click();

	    }
	    void addtocartsaucelabsbikelight() {
	        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	        //String item = driver.findElement(By.xpath("//div[@class='inventory_item_name'][contains(text(),'Sauce Labs Bike Light')]")).getText();
	        //Assert.assertEquals(item,"Sauce Labs Bike Light");
	        //System.out.println("We are on Shopping page...");
	        driver.findElement(By.id("shopping_cart_container")).click();
	        driver.findElement(By.id("continue-shopping")).click();
	        driver.findElement(By.id("checkout")).click();
	        driver.findElement(By.id("first-name")).sendKeys("Nitin");
	        driver.findElement(By.id("last-name")).sendKeys("Kumar");
	        driver.findElement(By.id("postal-code")).sendKeys("49715");
	        driver.findElement(By.id("continue")).click();
	        driver.findElement(By.id("cancel")).click();
	        driver.findElement(By.id("finish")).click();
	        }
	    void addtocartsaucelabsbolttshirt(){
           driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        //String item = driver.findElement(By.xpath(" //div[@class='inventory_item_name'][contains(text(),'Sauce Labs Bolt T-Shirt')]")).getText();
        // Assert.assertEquals(item,"Sauce Labs Bolt T-Shirt");
        //   System.out.print("We are on shoping page...");
         driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Priya");
        driver.findElement(By.id("last-name")).sendKeys("Patil");
        driver.findElement(By.id("postal-code")).sendKeys("48001");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("cancel")).click();
        driver.findElement(By.id("finish")).click();
        driver.findElement(By.id("back-to-products")).click();
        }
	  void addtocartsaucelabsfleecejacket(){
          driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
         //String item =driver.findElement(By.xpath( "//div[@class='inventory_item_name'][contains(text(),'Sauce Labs Fleece Jacket')]")).getText();
        //Assert.assertEquals(item,"Sauce Labs Fleece Jacket");
        //System.out.println("match");
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
        }
	  void addtocartsaucelabsonesie(){
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
      //String item = driver.findElement(By.xpath("//div[@class='inventory_item_name'][contains(text(),'Sauce Labs Onesie')]")).getText();
      // Assert.assertEquals(item,"Sauce Labs Onesie");
      //  System.out.println("We are on Shopping Page");
      driver.findElement(By.id("shopping_cart_container")).click();
      driver.findElement(By.id("checkout")).click();
      driver.findElement(By.id("first-name")).sendKeys("Ram");
      driver.findElement(By.id("last-name")).sendKeys("Kumar");
      driver.findElement(By.id("postal-code")).sendKeys("72471");
      driver.findElement(By.id("continue")).click();
      driver.findElement(By.id("finish")).click();
      driver.findElement(By.id("cancel")).click();
      driver.findElement(By.id("back-to-products")).click();
      }
	void AddToCart(){
         driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
      //String item=driver.findElement(By.xpath("//div[@class='inventory_item_name'][contains(text(),'Test.allTheThings() T-Shirt (Red)')]")).getText();
      //Assert.assertEquals(item,"Test.allTheThings() T-Shirt (Red)");
      //System.out.println("WE ARE ON SHOPPING PAGE");

       driver.findElement(By.id("shopping_cart_container")).click();
      driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
      driver.findElement(By.id("checkout")).click();
      driver.findElement(By.id("first-name")).sendKeys("Dimple");
      driver.findElement(By.id("last-name")).sendKeys("Sharma");
      driver.findElement(By.id("postal-code")).sendKeys("27916");
      driver.findElement(By.id("continue")).click();
      driver.findElement(By.id("finish")).click();
      driver.findElement(By.id("back-to-products")).click();
      }

	
	   
	    }
	    

