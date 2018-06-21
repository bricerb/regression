package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddNewCardScreen extends AbstractScreen{

    @AndroidFindBy(id = "com.incomm.otc:id/submit_card_btn")
    public MobileElement addCardBtn;

    @AndroidFindBy(id = "com.incomm.otc:id/add_card_et")
    public MobileElement cardNumber;

    public AddNewCardScreen (AppiumDriver driver) {
        super(driver);
    }
}
