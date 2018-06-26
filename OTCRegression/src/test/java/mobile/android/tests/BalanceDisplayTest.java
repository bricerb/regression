package mobile.android.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class BalanceDisplayTest extends AbstractTest {

    @Test
    public void balanceDisplayTest () {
        String cardNumber = "0000000000000000000";
        String expectedBalance = "$55.00";

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
        app.addNewCardScreen().cardNumber.setValue(cardNumber);
        driver.hideKeyboard();
        app.addNewCardScreen().addCardBtn.click();

        app.dashboardScreen().findElementWithTimeout(By.id("com.incomm.otc:id/account_balance"), 30);
        Assert.assertEquals(expectedBalance, app.dashboardScreen().accountBalance.getText());
    }
}