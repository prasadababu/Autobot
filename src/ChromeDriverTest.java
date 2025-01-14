package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverTest {
    public static void main(String[] args) {

        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        // System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);

        driver.findElement(By.xpath("//a[@aria-label='Sign in']")).click();
    
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.bing.com");
        
        // driver.quit();
    }
}
