package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SurveyScreen extends AbstractScreen {

    @AndroidFindBy(id = "com.incomm.otc:id/eligible_check_iv")
    public MobileElement checkMarkEligible;

    @AndroidFindBy(id = "com.incomm.otc:id/survey_submit_btn")
    public MobileElement submitItemSurveyBtn;

    public SurveyScreen(AppiumDriver driver) {
        super(driver);
    }

}