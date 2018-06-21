package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SelectRetailerScreen extends AbstractScreen {

    @AndroidFindBy(id ="com.incomm.otc:id/checked_text_item")
    public MobileElement retailer;

    @AndroidFindBy(id = "com.incomm.otc:id/submit_button_item")
    public MobileElement submitRetailerBtn;

    @AndroidFindBy(id = "com.incomm.otc:id/retailers_list_view")
    public MobileElement retailerListView;


    public SelectRetailerScreen(AppiumDriver driver) {
        super(driver);
    }

}