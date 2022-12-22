package Vdotok.Android.Testcases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.GsmCallActions;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class callTest {

    private AndroidDriver driver;
    private String APP = "https://github.com/cloudgrey-io/the-app/releases/download/v1.7.1/TheApp-v1.7.1.apk";
    private String PHONE_NUMBER = "923444562519";

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "RF8N209HQRM");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", APP);

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testPhoneCall() throws InterruptedException {
        // do something in our app
        driver.findElementByAccessibilityId("Login Screen").click();

        // receive and accept a call
        driver.makeGsmCall(PHONE_NUMBER, GsmCallActions.CALL);
        Thread.sleep(2000); // pause just for effect
        driver.makeGsmCall(PHONE_NUMBER, GsmCallActions.ACCEPT);

        // continue to do something in our app
        driver.findElementByAccessibilityId("username").sendKeys("hi");
        Thread.sleep(2000); // pause just for effect

        // end the call
        driver.makeGsmCall(PHONE_NUMBER, GsmCallActions.CANCEL);
        Thread.sleep(2000); // pause just for effect
    }
}