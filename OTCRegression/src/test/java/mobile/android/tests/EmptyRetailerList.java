package mobile.android.tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EmptyRetailerList extends AbstractTest {

    @Test
    public void EmptyRetailerList() {

//       Walkthrough
        app.termsAndConditionsScreen().findElementWithTimeout(By.id("com.incomm.otc:id/tc_accept_cb"), 30);

//       Terms & Conditions
        app.termsAndConditionsScreen().checkBox.click();
        app.termsAndConditionsScreen().submitButton.click();

//       Walkthrough
        app.walkthroughScreen().nextButton.click();
        app.walkthroughScreen().nextButton.click();
        app.walkthroughScreen().nextButton.click();
        app.walkthroughScreen().nextButton.click();

//       Add initial valid card
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        app.addNewCardScreen().cardNumber.setValue("1234561234561234567");

        driver.hideKeyboard();

        app.addNewCardScreen().addCardBtn.click();

//        Dashboard Screen
        app.dashboardScreen().findElementWithTimeout(By.id("com.incomm.otc:id/scan_products_btn"), 30);
        app.dashboardScreen().scanProductsBtn.click();

//        Select Retailer Screen
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        List<MobileElement> retailers = app.selectRetailerScreen().retailerListView
                .findElements(By.className("android.widget.CheckedTextView"));
        Assert.assertTrue(retailers.isEmpty());


    }
}
