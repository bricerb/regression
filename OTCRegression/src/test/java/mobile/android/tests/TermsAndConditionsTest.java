package mobile.android.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class TermsAndConditionsTest extends AbstractTest {

    @Test
    public void acceptTermsAndConditions() {
        app.termsAndConditionsScreen().findElementWithTimeout(By.id("com.incomm.otc:id/tc_accept_cb"), 30);

        app.termsAndConditionsScreen().checkBox.click();
        app.termsAndConditionsScreen().submitButton.click();
        Assert.assertNotNull(app.walkthroughScreen().nextButton);
    }
}
