package mobile.android;

import io.appium.java_client.AppiumDriver;

import mobile.android.screens.*;

public class OTC {

    private final AppiumDriver driver;

    public OTC(AppiumDriver driver) {
        this.driver = driver;
    }

    public TermsAndConditionsScreen termsAndConditionsScreen() {
        return new TermsAndConditionsScreen(driver);
    }

    public WalkthroughScreen walkthroughScreen() {
        return new WalkthroughScreen(driver);
    }

    public AddNewCardScreen addNewCardScreen() {
        return new AddNewCardScreen(driver);
    }

    public DashboardScreen dashboardScreen() {
        return new DashboardScreen(driver);
    }

    public SelectRetailerScreen selectRetailerScreen() {
        return new SelectRetailerScreen(driver);
    }

    public ScanScreen scanScreen() {
        return new ScanScreen(driver);
    }

    public EnterUPCScreen enterUPCScreen() {
        return new EnterUPCScreen(driver);
    }

    public ItemEligibilityScreen itemEligibilityScreen(){
        return new ItemEligibilityScreen(driver);
    }

    public SurveyScreen surveyScreen(){
        return new SurveyScreen(driver);
    }
}

