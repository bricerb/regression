package mobile.android.tests;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.junit.Test;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class CheckEligibilityDisabledTest extends AbstractTest {

    @Test
    public void checkEligibility() {
        app.termsAndConditionsScreen().findElementWithTimeout(By.id("com.incomm.otc:id/tc_accept_cb"), 30);
        //Terms & Conditions
        app.termsAndConditionsScreen().checkBox.click();
        app.termsAndConditionsScreen().submitButton.click();

        //Walkthrough
        app.walkthroughScreen().nextButton.click();
        app.walkthroughScreen().nextButton.click();
        app.walkthroughScreen().nextButton.click();
        app.walkthroughScreen().nextButton.click();

        //Add Initial Valid Card
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        app.addNewCardScreen().cardNumber.setValue("1234567890123456789");
        driver.hideKeyboard();
        app.addNewCardScreen().addCardBtn.click();


        //Dashboard
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Assert.assertTrue((app.dashboardScreen().findElementWithTimeout(By.id("com.incomm.otc:id/selected_card"), 30)).isDisplayed());
        app.dashboardScreen().findElementWithTimeout(By.id("com.incomm.otc:id/scan_products_btn"), 30);
        app.dashboardScreen().scanProductsBtn.click();

        //Retailer Page
        MobileElement cvsCheckedTV = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.CheckedTextView[1]");
        cvsCheckedTV.click();
        String isChecked = cvsCheckedTV.getAttribute("checked");
        Assert.assertEquals("true", isChecked);
        app.selectRetailerScreen().submitRetailerBtn.click();

        //Scan Screen
        Assert.assertTrue((app.scanScreen().findElementWithTimeout(By.id("com.incomm.otc:id/scan_button"), 30)).isDisplayed());
        MobileElement submitButton = app.scanScreen().findElementWithTimeout(By.id("com.incomm.otc:id/enter_upc_btn"), 30);
        Assert.assertTrue(submitButton.isDisplayed());
        submitButton.click();

        //Enter UPC Screen
        MobileElement upcEntry = app.enterUPCScreen().findElementWithTimeout(By.id("com.incomm.otc:id/upc_entry_ET"), 30);
        upcEntry.sendKeys("123456789");
        driver.hideKeyboard();
        MobileElement upcSubmit = app.enterUPCScreen().findElementWithTimeout(By.id("com.incomm.otc:id/upc_submit_btn"), 30);
        upcSubmit.click();


        //Verify we did not make it off of the UPC Entry Screen
        Assert.assertNotNull(app.enterUPCScreen().upcSubmitBtn);
        Assert.assertNotNull(app.enterUPCScreen().enterUpcField);
    }
}
