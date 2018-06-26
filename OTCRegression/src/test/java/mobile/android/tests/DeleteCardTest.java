package mobile.android.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

import java.util.concurrent.TimeUnit;

public class DeleteCardTest extends AbstractTest{


    @Test
    public void removeCard(){
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



        //Delete Card
        try {
            Thread.sleep(7000);
        } catch(Exception e) {
            //Nothing
        }

        new TouchAction(driver).press(900, 850).waitAction(500).moveTo(200, 850).release().perform();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        new TouchAction(driver).tap(790, 815).perform();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        MobileElement dialogAcceptButton1 = (MobileElement) driver.findElementById("android:id/button1");
        dialogAcceptButton1.click();



        Assert.assertNotNull(app.addNewCardScreen().addCardBtn);

    }

}
