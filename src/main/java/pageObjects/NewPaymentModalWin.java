package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestUtils;

public class NewPaymentModalWin {
    private WebDriver driver;

    public NewPaymentModalWin(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//label[text()='Ödənişin təyinatı']/parent::*//div/input") private WebElement destinationDropdown;
    @FindBy(xpath = "//label[text()='Büdcə təsnifat kodu']/parent::*//div/input") private WebElement valueOfDestinationDropdown;
    @FindBy(xpath = "//button[@id='onlinePaymentClassificationCodeModalAddBtn']") private WebElement addButton;

    public void clickDestinationDropdown(){
        TestUtils.sleep(1000);
        destinationDropdown.sendKeys("Vergi");
        TestUtils.sleep(1000);
        destinationDropdown.sendKeys(Keys.ENTER);
    }
    public void selectValueOfDestinationDropdown() {
        TestUtils.sleep(1000);
        valueOfDestinationDropdown.sendKeys("111111");
        TestUtils.sleep(1000);
        valueOfDestinationDropdown.sendKeys(Keys.ENTER);
    }
    public void clickAddButton() {
        addButton.click();
    }

    public void newPaymentModalWinMethods(){
        clickDestinationDropdown();
        selectValueOfDestinationDropdown();
        clickAddButton();
    }
}