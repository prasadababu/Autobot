package src;

// import org.testng.Assert;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class AssertionsTest {
    public static void main(String[] args) {

        // System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver");
        // System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        // driver.get("https://google.com");

     
       
        // assertTrue("options", "optios","unable to assert");
        Assert.assertTrue("test message",true);
        String obj1="options";
        String obj2="options";
        Assert.assertEquals(obj1, obj2);

        Assert.fail("KKKKKKKKKKKKK");

        
        // driver.quit();
    }
}
