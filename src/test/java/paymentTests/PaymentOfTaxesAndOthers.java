package paymentTests;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;
import prePostConditions.BaseTest;
import java.io.IOException;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PaymentOfTaxesAndOthers extends BaseTest {

    @Test
    @Order(1)
    public void loginPageTest() throws IOException{
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.LoginPageMethods();
    }
    @Test
    @Order(2)
    public void profileSelectionPageTest(){
        ProfileSelectionPage profileSelectionPage = PageFactory.initElements(driver, ProfileSelectionPage.class);
        profileSelectionPage.clickTinButton();
    }
    @Test
    @Order(3)
    public void mainPageTest(){
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.clickİnvoiceButton();
    }
    @Test
    @Order(4)
    public void paymentPageTest1(){
        PaymentPage paymentPage = PageFactory.initElements(driver, PaymentPage.class);
        paymentPage.paymentPageMethods();
    }
    @Test
    @Order(5)
    public void newPaymentModalWinTest(){
        NewPaymentModalWin newPaymentModalWin = PageFactory.initElements(driver, NewPaymentModalWin.class);
        newPaymentModalWin.newPaymentModalWinMethods();
    }
    @Test
    @Order(6)
    public void paymentPageTest2(){
        PaymentPage paymentPage = PageFactory.initElements(driver, PaymentPage.class);
        paymentPage.payForTaxMethods();
    }
    @Test
    @Order(7)
    public void gppPageTest() throws IOException{        // First Gpp Page
        GppPage gppPage = PageFactory.initElements(driver, GppPage.class);
        gppPage.gppPageMethods();
    }
    @Test
    @Order(8)
    public void assertExpectedWithActual(){
        GppPage gppPage = PageFactory.initElements(driver, GppPage.class);
        gppPage.assertValues();
    }
}