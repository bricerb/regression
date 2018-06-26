package mobile.android.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class DiscountEligibilityEligibleAndOptedInTest extends AbstractTest {

    @Test
    public void discountEligibleAndOptIn() {
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
        app.addNewCardScreen().cardNumber.setValue(medicaidOffersCardNumber);
        driver.hideKeyboard();
        app.addNewCardScreen().addCardBtn.click();

        //start scanning
        app.dashboardScreen().findElementWithTimeout(By.id("com.incomm.otc:id/scan_products_btn"), 30);
        app.dashboardScreen().scanProductsBtn.click();

        //select retailer & submit
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        app.selectRetailerScreen().retailer.click();
        app.selectRetailerScreen().submitRetailerBtn.click();

//        enter upc number & submit
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        app.scanScreen().enterUpcBtn.click();
        app.enterUPCScreen().enterUpcField.setValue(eligibleItemWithOffers);
        app.enterUPCScreen().upcSubmitBtn.click();

//        //item is eligible
        app.itemEligibilityScreen().findElementWithTimeout(By.id("com.incomm.otc:id/eligible_item_tv"), 30);
        Assert.assertEquals("This Item is Eligible", app.itemEligibilityScreen().itemIsEligibleOrNot.getText());

    }
}