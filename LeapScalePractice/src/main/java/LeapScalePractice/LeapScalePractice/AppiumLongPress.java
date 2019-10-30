package LeapScalePractice.LeapScalePractice;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class AppiumLongPress {

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
		
		driver.findElement(By.id("com.google.android.apps.messaging:id/next")).click();
		
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		
		Thread.sleep(4000);

		// In latest appium handling the TouchAction is having little change (i.e ElementOption )
		TouchAction action= new TouchAction((MobileDriver)driver);
		MobileElement ele=  driver.findElement(By.id("Message from VZ-VFCARE: , Congratulations on your new 4G phone! To enjoy Vodafone SuperNet 4G speeds at 3G prices, insert your 4G SIM into slot 1 & select network type as 4G/LTE. If you haven't upgraded to a 4G SIM yet, visit our nearest store for an instant upgrade & enjoy a welcome data offer absolutely free! No documents required.. Time: 2/17/18, 14:57."));;
		action.longPress(ElementOption.element(ele)).perform().release();
		
		
		

		


	}

}


