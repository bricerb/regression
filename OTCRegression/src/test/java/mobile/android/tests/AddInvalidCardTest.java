package mobile.android.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNull;

public class AddInvalidCardTest  extends AbstractTest{

    @Test
    public void invalidCard(){
        app.termsAndConditionsScreen().findElementWithTimeout(By.id("com.incomm.otc:id/tc_accept_cb"), 30);
//        terms & conditions
        app.termsAndConditionsScreen().checkBox.click();
        app.termsAndConditionsScreen().submitButton.click();

//      walkthrough
        app.walkthroughScreen().nextButton.click();
        app.walkthroughScreen().nextButton.click();
        app.walkthroughScreen().nextButton.click();
        app.walkthroughScreen().nextButton.click();

//        add invalid card
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        app.addNewCardScreen().cardNumber.setValue("");
        driver.hideKeyboard();
        app.addNewCardScreen().addCardBtn.click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Assert.assertNotNull(app.addNewCardScreen().cardNumber);



    }
}
