package mobile.android;

public class TestCapabilities {

    private static boolean isBitriseBuild = (System.getenv().get("REGRESSION_TEST_GIT_URL") != null);
    public static final String APK_PATH = isBitriseBuild ? System.getenv("BITRISE_APK_PATH") : "/Users/Brice/AndroidStudioProjects/mobile-otc-android-andotc/app/build/outputs/apk/regression/app-regression.apk";
    public static final String PLATFORM_VERSION_NUMBER = isBitriseBuild ? "8.0" : "8.0";


//    Bitrise URL and Version
//    public static final String APK_PATH = "/bitrise/deploy/app-regression.apk";
//    public static final String PLATFORM_VERSION_NUMBER = "8.0" : "8.0";

//    Local URL and Version
//    public static final String APK_PATH = "/Users/Brice/AndroidStudioProjects/mobile-otc-android-andotc/app/build/outputs/apk/regression/app-regression.apk";
//    public static final String PLATFORM_VERSION_NUMBER = "8.1";


//    Rebecca's local
//    public static final String APK_PATH = isBitriseBuild ? "/bitrise/deploy/app-debug.apk" : "C:/Users/rtellez/AndroidStudioProjects/Incomm/mobile-otc-android-andotc/app/build/outputs/apk/regression/app-regression.apk";
//    public static final String PLATFORM_VERSION_NUMBER = isBitriseBuild ? "8.0" : "8.1";
  
//   David's Local
//   public static final String APK_PATH = isBitriseBuild ? "/bitrise/deploy/app-debug.apk" : "C:/NotOneDrive/Appium/app-regression.apk";
//   public static final String PLATFORM_VERSION_NUMBER = isBitriseBuild ? "8.0" : "8.0";


    public static final String PLATFORM_NAME = "Android";
    public static final String DEVICE_NAME = "Android Emulator";
    public static final String END_POINT = "http://localhost:4723/wd/hub";
    public static final String APP_WAIT_ACTIVITY = "com.incomm.otc.views.termscondition.TermsAndConditionsActivity";
}
