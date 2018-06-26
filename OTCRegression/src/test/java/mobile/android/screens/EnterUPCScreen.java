package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EnterUPCScreen extends AbstractScreen {

    @AndroidFindBy(id = "upc_entry_ET")
    public MobileElement enterUpcField;

    @AndroidFindBy(id = "upc_submit_btn")
    public MobileElement upcSubmitBtn;



    public EnterUPCScreen(AppiumDriver driver) {
        super(driver);
    }

}