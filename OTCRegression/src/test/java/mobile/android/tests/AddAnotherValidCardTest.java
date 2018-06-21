package mobile.android.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class AddAnotherValidCardTest extends AbstractTest{


    @Test
    public void anotherValidCard(){
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

        app.dashboardScreen().findElementWithTimeout(By.id("com.incomm.otc:id/scan_products_btn"), 30);
        Assert.assertTrue(app.dashboardScreen().scanProductsBtn.isDisplayed());





    }
}
