package mobile.android.tests;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RetailerDisplayMedicaidCardTest extends AbstractTest {

    @Test
    public void retailerDisplayMedicareCardTest () {
        String[] expectedRetailers = {"CVS", "Discount Drug Mart", "Dollar General",
                "Duane Reade", "Family Dollar"};
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

//        Dashboard
        app.dashboardScreen().findElementWithTimeout(By.id("com.incomm.otc:id/scan_products_btn"), 30);
        app.dashboardScreen().scanProductsBtn.click();

//        Retailer List
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        List<MobileElement> retailers = app.selectRetailerScreen().retailerListView
                .findElements(By.className("android.widget.CheckedTextView"));
        for (int i = 0; i < retailers.size(); i++) {
            Assert.assertEquals(expectedRetailers[i], retailers.get(i).getText());
        }
    }
}
