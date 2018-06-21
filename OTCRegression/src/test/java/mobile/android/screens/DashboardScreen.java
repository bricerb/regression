package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DashboardScreen extends AbstractScreen {

    @AndroidFindBy(id = "com.incomm.otc:id/scan_products_btn")
    public MobileElement scanProductsBtn;

    @AndroidFindBy(id = "com.incomm.otc:id/add_card_btn")
    public MobileElement addCardDashboardBtn;

    @AndroidFindBy(id = "com.incomm.otc:id/discount_btn")
    public MobileElement discountLinkButton;

    @AndroidFindBy(id = "com.incomm.otc:id/account_balance")
    public MobileElement accountBalance;

    public DashboardScreen(AppiumDriver driver) {
        super(driver);
    }
}
