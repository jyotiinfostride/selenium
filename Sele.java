import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class Sele {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\Downloads\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        //  driver.navigate().to("https://opensource-demo.orangehrmlive.com");
//        driver.get("https://www.google.com");
        //  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        // driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        // driver.findElement(By.id("btnLogin")).click();
        //  Thread.sleep(5000);
        //driver.quit();

        //  }
//}
        Thread.sleep(1000);
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        //driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
       // driver.findElement(By.id("shopping_cart_container")).click();
        //driver.findElement(By.id("checkout")).click();
        //driver.findElement(By.id("first-name")).sendKeys("Gun");
        //driver.findElement(By.id("last-name")).sendKeys("Sharma");
        //driver.findElement(By.id("postal-code")).sendKeys("A1A 1A1");
        //driver.findElement(By.id("continue")).click();
        //driver.findElement(By.id("finish")).click();
        //driver.findElement(By.id("back-to-products")).click();

        //driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        //driver.findElement(By.id("shopping_cart_container")).click();
        //driver.findElement(By.id("continue-shopping")).click();
        //driver.findElement(By.id("checkout")).click();
        //driver.findElement(By.id("first-name")).sendKeys("Nitin");
        //driver.findElement(By.id("last-name")).sendKeys("Kumar");
        //driver.findElement(By.id("postal-code")).sendKeys("49715");
        //driver.findElement(By.id("continue")).click();
        //driver.findElement(By.id("cancel")).click();
        //driver.findElement(By.id("finish")).click();
        //driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
       // driver.findElement(By.id("shopping_cart_container")).click();
        //driver.findElement(By.id("checkout")).click();
       //driver.findElement(By.id("first-name")).sendKeys("Priya");
       //driver.findElement(By.id("last-name")).sendKeys("Patil");
       //driver.findElement(By.id("postal-code")).sendKeys("48001");
      // driver.findElement(By.id("continue")).click();
      // driver.findElement(By.id("cancel")).click();
       //driver.findElement(By.id("finish")).click();
      // driver.findElement(By.id("back-to-products")).click();
        //driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        //driver.findElement(By.id("shopping_cart_container")).click();
        //driver.findElement(By.id("continue-shopping")).click();
       // driver.findElement(By.id("checkout")).click();
        //driver.findElement(By.id("first-name")).sendKeys("Nitin");
       // driver.findElement(By.id("last-name")).sendKeys("Rana");
       // driver.findElement(By.id("postal-code")).sendKeys("00125");
       // driver.findElement(By.id("continue")).click();
       // driver.findElement(By.id("cancel")).click();
       // driver.findElement(By.id("finish")).click();
       // driver.findElement(By.id("back-to-products")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Ram");
        driver.findElement(By.id("last-name")).sendKeys("Kumar");
        driver.findElement(By.id("postal-code")).sendKeys("72471");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();

        //Thread.sleep(6000);
      //  driver.quit();
    }
}
