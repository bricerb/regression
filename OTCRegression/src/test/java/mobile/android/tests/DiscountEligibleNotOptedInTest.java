package mobile.android.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class DiscountEligibleNotOptedInTest extends AbstractTest {

    @Test
    public void discountEligibleAndNotOptIn() {
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
        app.addNewCardScreen().cardNumber.setValue(medicareNoOffersCardNumber);
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
        app.enterUPCScreen().enterUpcField.setValue("00000000000");
        app.enterUPCScreen().upcSubmitBtn.click();

//        //item is not eligible
        app.itemEligibilityScreen().findElementWithTimeout(By.id("com.incomm.otc:id/eligible_item_tv"), 30);
        Assert.assertEquals("This Item is not Eligible", app.itemEligibilityScreen().itemIsEligibleOrNot.getText());
    }
}
