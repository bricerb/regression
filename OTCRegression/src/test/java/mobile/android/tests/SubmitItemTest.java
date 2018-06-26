package mobile.android.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SubmitItemTest extends AbstractTest {

    @Test
    public void submitItem() {
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
        app.addNewCardScreen().cardNumber.setValue(medicareNoOffersCardNumber);
        driver.hideKeyboard();
        app.addNewCardScreen().addCardBtn.click();

        //start scanning
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        app.dashboardScreen().findElementWithTimeout(By.id("com.incomm.otc:id/scan_products_btn"), 30);
        app.dashboardScreen().scanProductsBtn.click();

        //select retailer & submit
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        app.selectRetailerScreen().retailer.click();
        app.selectRetailerScreen().submitRetailerBtn.click();

//        enter upc number & submit
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        app.scanScreen().enterUpcBtn.click();
        app.enterUPCScreen().enterUpcField.setValue(eligibleItemWithoutOffers);
        driver.hideKeyboard();
        app.enterUPCScreen().upcSubmitBtn.click();

        System.out.println("DATA:" + driver.getPageSource());

        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println("Oops!");
        }

        app.itemEligibilityScreen().findElementWithTimeout(By.id("com.incomm.otc:id/scan_new_item_ll"), 30);

        if (app.itemEligibilityScreen().scanNewItem.isDisplayed()) {
            System.out.println("Scan new item btn shown");
        }
        if (app.itemEligibilityScreen().submitItemBtn.isDisplayed()) {
            System.out.println("submit item btn shown");
        }
        app.itemEligibilityScreen().submitItemBtn.click();

        //select that item should be eligible

        //checks to see if the item is present and visible
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.incomm.otc:id/submit_item_survey_btn")));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
//                "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
//                "/android.widget.LinearLayout[3]/android.widget.Button")));
//        app.itemEligibilityScreen().findElementWithTimeout(By.id("com.incomm.otc:id/submit_btn"), 30);
        app.itemEligibilityScreen().submitItemBtn.click();
        app.surveyScreen().checkMarkEligible.click();
        app.surveyScreen().submitItemSurveyBtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.incomm.otc:id/enter_upc_btn")));
        //app.dashboardScreen().findElementWithTimeout(By.id("com.incomm.otc:id/enter_upc_btn"), 30);
        Assert.assertTrue(app.scanScreen().enterUpcBtn.isDisplayed());

    }
}
