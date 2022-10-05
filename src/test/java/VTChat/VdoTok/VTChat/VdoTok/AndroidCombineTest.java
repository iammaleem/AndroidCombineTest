package VTChat.VdoTok.VTChat.VdoTok;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import VTChat.VdoTok.DesiredCapability;
import VTChat.VdoTok.androidCababilities;

import org.testng.AssertJUnit;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import io.appium.java_client.android.AndroidStopScreenRecordingOptions;
import io.appium.java_client.screenrecording.CanRecordScreen;
import io.appium.java_client.screenrecording.ScreenRecordingUploadOptions;
import vdotokPageObj.androidCombineOBJ;

//import static io.appium.java_client.touch.TapOptions.tapOptions;
//import static io.appium.java_client.touch.offset.ElementOption.element;


public class AndroidCombineTest extends androidCababilities  {
	
@Test
		public void SmokeAndroidCombine() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		AppiumDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Logger logger = Logger.getLogger("");
		//PropertyConfigurator.configure("/Users/aleem/Documents/vdotokWeb/log.properties");
		androidCombineOBJ vt_getElement = new androidCombineOBJ(driver);
		
		/*
		String expectedtapSignup = "Sign In";
		String resulttapSignup = VdoTokSmoke.SignUpTitle.getText();
		AssertJUnit.assertEquals(resulttapSignup, expectedtapSignup, "Sign In");
		//System.out.println(resulttapAccommodation);
		System.out.println(resulttapSignup);
		*/

		//MobileElement loginButton = driver.findElementByXPath("//android.widget.Button[@content-desc=\"SIGN IN\"]");

		//loginButton.click();
		Map<String, Object> args = new HashMap<>();
		args.put("width", 1080);
		args.put("height", 1920);
		args.put("considerRotation", true);
		args.put("quality", 45);
		args.put("bitRate", 500000);
		driver.executeScript("mobile: startScreenStreaming", args);
		

		WebDriverWait driverWait = new WebDriverWait (driver, 10);
		//vt_getElement.EnterUser.click();
		vt_getElement.EnterUser.sendKeys("one@gmail.com");
		vt_getElement.EnterPassword.click();
		vt_getElement.EnterPassword.sendKeys("12345678");
		//driver.hideKeyboard();
		//driver.navigate().back();
		vt_getElement.ClickSignUp.click();
		String expectedtitle = "ALEEM";
		String resulttapTitle = vt_getElement.homeTitle.getText();
		AssertJUnit.assertEquals(resulttapTitle, expectedtitle, "ALEEM");

		logger.info("Screen Title is" + expectedtitle);
/*******************

		if( vt_getElement.homeTitle.isDisplayed() )
			{
			System.out.println("Landed on Home Screen");
			}
			else
			{
			System.out.println("Navigation Failed");

			}
	//	vt_getElement.AddGroup.click();
		logger.info("Group Opened");
		//logger.error("Accommodation button is not click able");
		//logger.debug("Test Action Button");
		
		vt_getElement.openChatGroup.click();
		
		vt_getElement.startGroupCall.click();
		//driver.startAudioRecording(new AndroidStartAudioRecordingOptions).

		((CanRecordScreen)driver).startRecordingScreen(new AndroidStartScreenRecordingOptions()
				.withVideoSize("720x1280"));
				//.withUploadOptions("/Users/aleem/Desktop/new.mp4"));

		Thread.sleep(20000);
		
		//driver.executeScript("mobile: stopScreenStreaming");
		
		//((CanRecordScreen)driver).stopRecordingScreen(new AndroidStopScreenRecordingOptions().withUploadOptions(ScreenRecordingUploadOptions.uploadOptions()));

		

		String base64String = ((CanRecordScreen)driver).stopRecordingScreen();
		byte[] data = Base64.decodeBase64(base64String);
		String
		destinationPath="/Users/aleem/Desktop/SessionRecorded.mp4";
		Path path = Paths.get(destinationPath);
		Files.write(path, data);
		
		Thread.sleep(10000);
		driver.executeScript("mobile: stopScreenStreaming");

**********************/
		/*
		
		
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
		*/
		}

}