//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.List;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//public class Sele {
//    public static void main(String[] args) throws InterruptedException{
//
//    WebDriverManager.chromedriver().setup();
////        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new ChromeDriver();
//        //  driver.navigate().to("https://opensource-demo.orangehrmlive.com");
////        driver.get("https://www.google.com");
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//       // WebDriverWait wait =new WebDriverWait(driver,30);
//        //  Thread.sleep(5000);
//        //driver.quit();
//
//        //  }
////}
//        //Thread.sleep(1000);
//       // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        driver.navigate().to("https://www.saucedemo.com/");
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
//        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
//        //driver.findElement(By.id("inventory_sidebar_link")).click();
//       // driver.findElement(By.id("about_sidebar_link")).click();
//        //driver.findElement(By.id("logout_sidebar_link")).click();
//       //driver.findElement(By.id("reset_sidebar_link")).click();
//        driver.findElement(By.id("react-burger-cross-btn")).click();
//       // driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
///*        Select select = new Select(WebElement webelement);*/
//       // Select se = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
//         //       se.selectByValue("az");
//           //     Select se = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
//             //   se.selectByValue("za");
//               // Select se = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
//                //se.selectByValue("lohi");
//                //Select se = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
//               // se.selectByValue("hilo");
//      //  driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//     //  driver.findElement(By.id("shopping_cart_container")).click();
//      //  driver.findElement(By.id("checkout")).click();
//       // driver.findElement(By.id("first-name")).sendKeys("Gun");
//     //   driver.findElement(By.id("last-name")).sendKeys("Sharma");
//        //driver.findElement(By.id("postal-code")).sendKeys("A1A 1A1");
//       // driver.findElement(By.id("continue")).click();
//      //  driver.findElement(By.id("finish")).click();
//       // driver.findElement(By.id("back-to-products")).click();
//
//      //driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
//        //driver.findElement(By.id("shopping_cart_container")).click();
//        //driver.findElement(By.id("continue-shopping")).click();
//        //driver.findElement(By.id("checkout")).click();
//        //driver.findElement(By.id("first-name")).sendKeys("Nitin");
//        //driver.findElement(By.id("last-name")).sendKeys("Kumar");
//        //driver.findElement(By.id("postal-code")).sendKeys("49715");
//        //driver.findElement(By.id("continue")).click();
//        //driver.findElement(By.id("cancel")).click();
//        //driver.findElement(By.id("finish")).click();
//       // driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
//       //driver.findElement(By.id("shopping_cart_container")).click();
//        //driver.findElement(By.id("checkout")).click();
//       //driver.findElement(By.id("first-name")).sendKeys("Priya");
//       //driver.findElement(By.id("last-name")).sendKeys("Patil");
//       //driver.findElement(By.id("postal-code")).sendKeys("48001");
//       //driver.findElement(By.id("continue")).click();
//       //driver.findElement(By.id("cancel")).click();
//       //driver.findElement(By.id("finish")).click();
//       //driver.findElement(By.id("back-to-products")).click();
//       // driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
//        //driver.findElement(By.id("shopping_cart_container")).click();
//        //driver.findElement(By.id("continue-shopping")).click();
//        //driver.findElement(By.id("checkout")).click();
//        //driver.findElement(By.id("first-name")).sendKeys("Nitin");
//        //driver.findElement(By.id("last-name")).sendKeys("Rana");
//        //driver.findElement(By.id("postal-code")).sendKeys("00125");
//        //driver.findElement(By.id("continue")).click();
//        //driver.findElement(By.id("cancel")).click();
//        //driver.findElement(By.id("finish")).click();
//        //driver.findElement(By.id("back-to-products")).click();
//      // driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
//        //driver.findElement(By.id("shopping_cart_container")).click();
//        //driver.findElement(By.id("checkout")).click();
//        //driver.findElement(By.id("first-name")).sendKeys("Ram");
//        //driver.findElement(By.id("last-name")).sendKeys("Kumar");
//        //driver.findElement(By.id("postal-code")).sendKeys("72471");
//        //driver.findElement(By.id("continue")).click();
//        //driver.findElement(By.id("finish")).click();
//        //driver.findElement(By.id("cancel")).click();
//        //driver.findElement(By.id("back-to-products")).click();
//      //  driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
//        //driver.findElement(By.id("shopping_cart_container")).click();
//        //driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
//        //driver.findElement(By.id("checkout")).click();
//        //driver.findElement(By.id("first-name")).sendKeys("Dimple");
//        //driver.findElement(By.id("last-name")).sendKeys("Sharma");
//        //driver.findElement(By.id("postal-code")).sendKeys("27916");
//        //driver.findElement(By.id("continue")).click();
//        //driver.findElement(By.id("finish")).click();
//        //driver.findElement(By.id("back-to-products")).click();
//
//        //Thread.sleep(6000);
//      //  driver.quit();
//    }
//}
