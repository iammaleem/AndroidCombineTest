package vdotokPageObj;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class androidCombineOBJ {


	public androidCombineOBJ(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath ="//android.view.View[@content-desc=\"Sign In\"]")

	public MobileElement SignUpTitle;

	@AndroidFindBy(id ="com.vdotok.app:id/edtEmail")
	//@AndroidFindBy(xpath ="//android.widget.TextView[@text=‘Username/Email’]")



	public MobileElement EnterUser;

	@AndroidFindBy(id ="com.vdotok.app:id/edtPassword")
	
	
	//@AndroidFindBy(id ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")

	
	public MobileElement EnterPassword;

	@AndroidFindBy(id ="com.vdotok.app:id/btnSignIn")

	public MobileElement ClickSignUp;


	@AndroidFindBy(id ="com.vdotok.app:id/tv_title")

	public MobileElement homeTitle;


	
	@AndroidFindBy(id ="com.vdotok.app:id/groupView")

	public MobileElement openChatGroup;
	
	
	
	@AndroidFindBy(id ="com.vdotok.app:id/videoCall")

	public MobileElement startGroupCall;
	
	


	@AndroidFindBy(id ="com.vdotok.app:id/addGroup")
	
	public MobileElement AddGroup;
	
	
	
	@AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc=\"Icon video call\"])[3]")
	
	public MobileElement StartCall;
	
	
	
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	
	public MobileElement CamPermissions;
	
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	
	public MobileElement AudioPermissions;



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