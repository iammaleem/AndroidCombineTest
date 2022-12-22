package VdotokPageObjs_Android;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Smoke {


	public Smoke(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath ="//android.view.View[@content-desc=\"Sign In\"]")

	public MobileElement SignUpTitle;

	//@AndroidFindBy(xpath ="//*[@text='Email Address']")
	@AndroidFindBy(id ="com.vdotok.app:id/edtEmail")



	public MobileElement EnterUser;

	@AndroidFindBy(xpath ="//*[@text='Password']")

	public MobileElement EnterPassword;

	@AndroidFindBy(id ="com.vdotok.app:id/btnSignIn")

	public MobileElement ClickSignUp;


	@AndroidFindBy(id ="com.vdotok.app:id/tv_title")

	public MobileElement homeTitle;




	@AndroidFindBy(id ="com.vdotok.app:id/groupView")

	public MobileElement OpenGroup;


	@AndroidFindBy(xpath ="//android.view.View[@content-desc=\"Add Group Chat\"]")

	public MobileElement CreateGroup;


	@AndroidFindBy(xpath ="//android.view.View[@content-desc=\"Create Group Chat\"]")

	public MobileElement createGroupTitle;


	@AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc=\"aghaaz butt\"]")

	public MobileElement SelectParticipantsA;

	@AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc=\"Zubair Tahir\"]")

	public MobileElement SelectParticipantsB;


	@AndroidFindBy(xpath ="//android.view.View[@content-desc=\"Select Contact\"]/android.view.View[1]/android.widget.ImageView")

	public MobileElement TickToCreateChat;


	@AndroidFindBy(xpath ="//*[@text='ex:Deeper Time']")

	public MobileElement enterGroupTitle;


	@AndroidFindBy(xpath ="//android.widget.Button[@content-desc=\"DONE\"]")

	public MobileElement SaveTitle;


	@AndroidFindBy(xpath ="//*[@text='Type your message']")

	public MobileElement startTyping;


	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]")

	public MobileElement sendMessage;

	@AndroidFindBy(xpath ="//android.widget.Button[@content-desc=\"LOG OUT\"]")

	public MobileElement clickLogout;





}