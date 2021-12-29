package pageObjects;

import config.Config;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GppPage {
    private WebDriver driver;
    String expectedResult = "Sizin ödəniş əməliyyatınız uğurla tamamlandı.";
    public GppPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(id = "cardBinCode") private WebElement cardField;
    @FindBy(xpath = "//a[@class='next']") private WebElement goOnButton;
    @FindBy(xpath = "//a[@href='authorization.jsp']") private WebElement confirmAndGoButton;
    @FindBy(xpath = "//div[@class='payment_success']/h2") private WebElement actualResult;

    public void inputCardField() throws IOException { // First GPP Page
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        cardField.sendKeys(Config.getCardId());
    }
    public void clickGoOnButton(){    // First GPP Page
        goOnButton.click();
    }
    public void clickConfirmAndGoOnButton(){    //Second GPP Page
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(confirmAndGoButton)).click();
    }
    public String getSuccessMessage(){       // Third GPP Page
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        return actualResult.getText();
    }
    public void gppPageMethods() throws IOException{
        inputCardField();
        clickGoOnButton();
        clickConfirmAndGoOnButton();
        getSuccessMessage();
    }
    public void assertValues(){
        Assertions.assertEquals(expectedResult, getSuccessMessage(), "Payment wasn't succeed");
    }
}