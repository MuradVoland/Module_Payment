package prePostConditions;

import config.Config;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {

    public WebDriver driver;

    @BeforeAll
    public void setUp() throws IOException {
//        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
//        driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(Config.getUrl());
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

//    @AfterAll
//    public void tearDown(){
//        driver.quit();
//    }
}
