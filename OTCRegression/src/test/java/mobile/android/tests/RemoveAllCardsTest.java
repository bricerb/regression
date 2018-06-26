package mobile.android.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

import java.util.concurrent.TimeUnit;

public class RemoveAllCardsTest extends AbstractTest{


    @Test
    public void removeCards(){
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


        //Delete First Card
        deleteCard();

        //Delete Second Card
        deleteCard();

        Assert.assertNotNull(app.addNewCardScreen().addCardBtn);
        
    }


    public void deleteCard() {
        try {
            Thread.sleep(7000);
        } catch (Exception e) {

        }

        new TouchAction(driver).press(900, 850).waitAction(500).moveTo(200, 850).release().perform();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        new TouchAction(driver).tap(790, 815).perform();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        MobileElement dialogAcceptButton1 = (MobileElement) driver.findElementById("android:id/button1");
        dialogAcceptButton1.click();
    }
}
