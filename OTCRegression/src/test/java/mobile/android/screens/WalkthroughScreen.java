package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WalkthroughScreen extends AbstractScreen {

    @AndroidFindBy(id = "com.incomm.otc:id/next_button")
    public MobileElement nextButton;

    public WalkthroughScreen(AppiumDriver driver) {
        super(driver);
    }

}