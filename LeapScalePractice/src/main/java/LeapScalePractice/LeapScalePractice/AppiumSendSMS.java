package LeapScalePractice.LeapScalePractice;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumSendSMS {

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

		driver.findElement(By.id("com.google.android.apps.messaging:id/start_new_conversation_button")).click();


		driver.findElement(By.id("com.google.android.apps.messaging:id/recipient_text_view")).sendKeys("9595478220");


		driver.findElement(By.id("com.google.android.apps.messaging:id/contact_picker_create_group")).click();
		
		driver.findElement(By.id("com.google.android.apps.messaging:id/compose_message_text")).sendKeys("Hi");
		
		driver.findElement(By.id("com.google.android.apps.messaging:id/send_message_button_icon")).click();


	}

}


