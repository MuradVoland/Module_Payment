package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

public class ProfileSelectionPage {
    private WebDriver driver;
    public ProfileSelectionPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//div[text()='9900050571']") private WebElement tinButton;

    public void clickTinButton() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        tinButton.click();
    }
}