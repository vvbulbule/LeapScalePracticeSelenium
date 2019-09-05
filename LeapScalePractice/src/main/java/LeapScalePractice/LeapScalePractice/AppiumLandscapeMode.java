package LeapScalePractice.LeapScalePractice;

import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumLandscapeMode {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			openCalculator();
		}catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}

	}

	public static void openCalculator() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Nexus 5");
		cap.setCapability("udid","04d9520d03285620");
		cap.setCapability("platformName", "Android"); 
		cap.setCapability("platformVersion","6.0.1" );
		cap.setCapability("appPackage", "com.google.android.apps.messaging");
		cap.setCapability("appActivity", "com.google.android.apps.messaging.ui.conversation.LaunchConversationActivity");//	  

		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url,cap);

		Thread.sleep(1000);
		
		ScreenOrientation CurrentOrientation = driver.getOrientation();
		System.out.println("before rotate:"+ CurrentOrientation);//PORTRAIT
		driver.rotate(ScreenOrientation.LANDSCAPE);// To Rotate to LANDSCAPE
		Thread.sleep(3000);
		CurrentOrientation = driver.getOrientation();
		driver.rotate(ScreenOrientation.PORTRAIT);
		System.out.println("After rotate:"+ CurrentOrientation);
		

	}

}


