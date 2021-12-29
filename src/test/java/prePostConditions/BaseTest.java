package prePostConditions;

import config.Config;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.TestUtils;
import java.io.IOException;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {

    public WebDriver driver;

    @BeforeAll
    public void setUp() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(Config.getUrl());
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    @AfterAll
    public void tearDown(){
        TestUtils.sleep(5000);
        driver.quit();
    }
}