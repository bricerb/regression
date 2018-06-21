package mobile.android.tests;

import io.appium.java_client.AppiumDriver;
import org.junit.Before;

import mobile.android.OTC;
import mobile.android.utils.AppiumDriverBuilder;
import java.net.MalformedURLException;

public class AbstractTest {
    protected AppiumDriver driver;
    protected OTC app;
    protected String medicareNoOffersCardNumber = "1234567890123456789";
    protected String medicaidOffersCardNumber = "0000000000000000000";

    @Before
    public void connect() throws MalformedURLException {
        this.driver = AppiumDriverBuilder.forAndroid().build();
        app = new OTC(driver);
    }
}
