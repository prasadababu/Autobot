package src;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesTest {
    public static void main(String[] args) throws IOException{
        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        // System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        JavascriptExecutor jr = (JavascriptExecutor) driver;
        jr.executeScript("window.open('https://bing.com','_blank')");
        jr.executeScript("window.open('https://facebook.com','_blank')");

        Set<String> str = driver.getWindowHandles();
        for (String string : str) {
            driver.switchTo().window(string);
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());
            driver.close();
        }
        // driver.quit();
    }
}
