package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ItemEligibilityScreen extends AbstractScreen {

    @AndroidFindBy(id="scan_new_item_ll")
    public MobileElement scanNewItem;

    @AndroidFindBy(id="com.incomm.otc:id/submit_item_survey_btn")
//    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
//            "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
//            "/android.widget.LinearLayout[3]/android.widget.Button")
    public MobileElement submitItemBtn;

    @AndroidFindBy(id = "com.incomm.otc:id/eligible_item_tv")
    public MobileElement itemIsEligibleOrNot;

    public ItemEligibilityScreen(AppiumDriver driver) {
        super(driver);
    }

}