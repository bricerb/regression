package mobile.android.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class AddValidCardTest extends AbstractTest {

    @Test
    public void validCard(){
        app.termsAndConditionsScreen().findElementWithTimeout(By.id("com.incomm.otc:id/tc_accept_cb"), 30);
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Assert.assertNotNull(app.dashboardScreen().addCardDashboardBtn);
    }
}