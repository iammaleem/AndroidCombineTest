package Vdotok.Flutter.Testcases;

import org.testng.annotations.Test;

import VdoTok.flutter.Capabilities.flutterOne2OneCapability;
import VdotokPageObjs_Flutter.flutterCombine_obj;

import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

//import static io.appium.java_client.touch.TapOptions.tapOptions;
//import static io.appium.java_client.touch.offset.ElementOption.element;


public class FlutterCombineTest extends flutterOne2OneCapability  {
@Test
		public void SmokeFLutterCombine() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AppiumDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Logger logger = Logger.getLogger("");
		//PropertyConfigurator.configure("/Users/aleem/Documents/vdotokWeb/log.properties");
		flutterCombine_obj vt_getElement = new flutterCombine_obj(driver);
		
		/*
		String expectedtapSignup = "Sign In";
		String resulttapSignup = VdoTokSmoke.SignUpTitle.getText();
		AssertJUnit.assertEquals(resulttapSignup, expectedtapSignup, "Sign In");
		//System.out.println(resulttapAccommodation);
		System.out.println(resulttapSignup);
		*/

		MobileElement loginButton = driver.findElementByXPath("//android.widget.Button[@content-desc=\"SIGN IN\"]");

		loginButton.click();

		WebDriverWait driverWait = new WebDriverWait (driver, 10);
		//vt_getElement.EnterUser.click();
		vt_getElement.EnterUser.sendKeys("aleem@vt.com");
		vt_getElement.EnterPassword.click();
		vt_getElement.EnterPassword.sendKeys("12345678");
		//driver.hideKeyboard();
		//driver.navigate().back();
		vt_getElement.ClickSignUp.click();
		String expectedtitle = "Chat Rooms";
		String resulttapTitle = vt_getElement.homeTitle.getText();
		AssertJUnit.assertEquals(resulttapTitle, expectedtitle, "Chat Rooms");

		logger.info("Screen Title is" + expectedtitle);


		if( vt_getElement.homeTitle.isDisplayed() )
			{
			System.out.println("Landed on Home Screen");
			}
			else
			{
			System.out.println("Navigation Failed");

			}
		vt_getElement.OpenGroup.click();
		logger.info("Group Opened");
		//logger.error("Accommodation button is not click able");
		//logger.debug("Test Action Button");
		vt_getElement.CreateGroup.click();
		String expectedGroupTitle = "Create Group Chat";
		String resulttapGroupTitle = vt_getElement.createGroupTitle.getText();
		AssertJUnit.assertEquals(resulttapGroupTitle, expectedGroupTitle, "Create Group Chat");
		logger.info("Screen Title is " + expectedGroupTitle);

		// System.out.println(expectedGroupTitle);
		vt_getElement.SelectParticipantsA.click();
		logger.debug("Test Action Button");

		vt_getElement.SelectParticipantsB.click();


		vt_getElement.TickToCreateChat.click();
		vt_getElement.enterGroupTitle.click();
		vt_getElement.enterGroupTitle.sendKeys("Aleem@Norgic");
		logger.info("Screen Title is " + expectedGroupTitle);

		//driver.findElementByCssSelector("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"About the accommodation & rules\").instance(0))");

		vt_getElement.SaveTitle.click();
		vt_getElement.startTyping.click();
		vt_getElement.startTyping.sendKeys("Smoke test is in progress");
		vt_getElement.sendMessage.click();
		vt_getElement.startTyping.sendKeys("Thank You");
		vt_getElement.sendMessage.click();

		//driver.findElementByCssSelector("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"About the accommodation & rules\").instance(0))");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.hideKeyboard();
		driver.navigate().back();

		//driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc=\\\"LOG OUT\\\"]")));
		vt_getElement.clickLogout.click();
		logger.info("User Logged Out Successfully");
		logger.debug("Test Action Button");
		}

		}