package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ScanScreen extends AbstractScreen {

    @AndroidFindBy(id = "com.incomm.otc:id/enter_upc_btn")
    public MobileElement enterUpcBtn;

    public ScanScreen(AppiumDriver driver) {
        super(driver);
    }

}