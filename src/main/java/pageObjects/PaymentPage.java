package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class PaymentPage {
    private WebDriver driver;
    public PaymentPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//label[starts-with(@class, 'exampleButton az btn')]") private WebElement selectAzLang;
    @FindBy(id = "onlinePaymenNewPaymentButton") private WebElement newPaymentButton;
    @FindBy(xpath = "//input[@id='onlinePaymentInput-0']") private WebElement fieldSum;
    @FindBy(xpath="//h6[@id='onlinePaymentTitle']") private WebElement elementForClick;
    @FindBy(id = "onlinePaymentCheckBoxByCode-0-label") private WebElement checkboxSum;
    @FindBy(id = "onlinePaymentPayButton") private WebElement buttonPay;


    public void setSelectAzLang(){
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        selectAzLang.click();
    }
    public void clickNewPaymentButton(){
        newPaymentButton.click();
    }
    public void paymentPageMethods(){
        setSelectAzLang();
        clickNewPaymentButton();
    }
    public void inputFieldSum(){
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        fieldSum.click();
        fieldSum.sendKeys("777");
        elementForClick.click();
    }
    public void selectCheckboxSum(){
        checkboxSum.click();
    }
    public void clickButtonPay(){
        buttonPay.click();
    }
    public void payForTaxMethods(){
        inputFieldSum();
        selectCheckboxSum();
        clickButtonPay();
    }
}
