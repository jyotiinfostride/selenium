import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class Sele {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\Downloads\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.quit();

    }
}
