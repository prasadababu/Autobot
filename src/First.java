package src;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;

public class First {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./chromedriver");
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        TakesScreenshot screnshot = (TakesScreenshot) driver;

        File file = screnshot.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(file, new File("./Screenshots/Screen.png"));
        // Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@aria-label='Sign in']")).click();;
        // driver.close();

    }
}
