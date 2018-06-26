package mobile.android.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;

import java.util.concurrent.TimeUnit;

public class AddSixCardsTest extends AbstractTest {

    @Test
    public void addCards(){
        app.termsAndConditionsScreen().findElementWithTimeout(By.id("com.incomm.otc:id/tc_accept_cb"), 30);
//        terms & conditions
        app.termsAndConditionsScreen().checkBox.click();
        app.termsAndConditionsScreen().submitButton.click();

//      walkthrough
        app.walkthroughScreen().nextButton.click();
        app.walkthroughScreen().nextButton.click();
        app.walkthroughScreen().nextButton.click();
        app.walkthroughScreen().nextButton.click();

//       add initial valid card
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        app.addNewCardScreen().cardNumber.setValue("1234567890123456789");
        driver.hideKeyboard();
        app.addNewCardScreen().addCardBtn.click();


//        add an additional valid card
        app.dashboardScreen().findElementWithTimeout(By.id("com.incomm.otc:id/add_card_btn"), 30);
        app.dashboardScreen().addCardDashboardBtn.click();
        app.addNewCardScreen().cardNumber.setValue("0000000000000000000");
        driver.hideKeyboard();
        app.addNewCardScreen().addCardBtn.click();

        //Third Card
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        app.dashboardScreen().findElementWithTimeout(By.id("com.incomm.otc:id/add_card_btn"), 30);
        app.dashboardScreen().addCardDashboardBtn.click();
        app.addNewCardScreen().cardNumber.setValue("5555555555555555123");
        driver.hideKeyboard();
        app.addNewCardScreen().addCardBtn.click();

        //Fourth Card
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        app.dashboardScreen().findElementWithTimeout(By.id("com.incomm.otc:id/add_card_btn"), 30);
        app.dashboardScreen().addCardDashboardBtn.click();
        app.addNewCardScreen().cardNumber.setValue("6666666666666666789");
        driver.hideKeyboard();
        app.addNewCardScreen().addCardBtn.click();

        //Fifth Card
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        app.dashboardScreen().findElementWithTimeout(By.id("com.incomm.otc:id/add_card_btn"), 30);
        app.dashboardScreen().addCardDashboardBtn.click();
        app.addNewCardScreen().cardNumber.setValue("7777777777777777890");
        driver.hideKeyboard();
        app.addNewCardScreen().addCardBtn.click();

        //Attempt to add Sixth Card
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        app.dashboardScreen().findElementWithTimeout(By.id("com.incomm.otc:id/add_card_btn"), 30);
        app.dashboardScreen().addCardDashboardBtn.click();
        MobileElement dialogAcceptButton = (MobileElement) driver.findElementById("android:id/button1");
        dialogAcceptButton.click();

    }
}