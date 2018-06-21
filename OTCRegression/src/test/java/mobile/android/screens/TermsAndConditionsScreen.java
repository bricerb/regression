package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TermsAndConditionsScreen extends AbstractScreen {

    @AndroidFindBy(id = "com.incomm.otc:id/tc_accept_cb")
    public MobileElement checkBox;

    @AndroidFindBy(id = "com.incomm.otc:id/submit_button")
    public MobileElement submitButton;

    public TermsAndConditionsScreen (AppiumDriver driver) {
        super(driver);
    }

}
