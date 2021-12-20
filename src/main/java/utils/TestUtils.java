package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestUtils {

    public static WebDriver driver;

//    public void TestUtils(WebDriver driver){
//        driver = this.driver;
//    }

    public static WebDriver driverMethod(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public static void sleep(long m) {

        try {
            Thread.sleep(m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void wait10Seconds(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}