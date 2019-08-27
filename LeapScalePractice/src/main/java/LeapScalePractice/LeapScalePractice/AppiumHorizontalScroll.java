package LeapScalePractice.LeapScalePractice;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class AppiumHorizontalScroll {

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

	
	//increase brightness by scolling horizontally / Progress bar
	public static void openCalculator() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Nexus 5");
		cap.setCapability("udid","04d9520d03285620");
		cap.setCapability("platformName", "Android"); 
		cap.setCapability("platformVersion","6.0.1" );
		cap.setCapability("appPackage", "com.android.settings");
		cap.setCapability("appActivity", "com.android.settings.DisplaySettings");//	  

		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url,cap);

		Thread.sleep(1000);

		driver.findElement(By.id("android:id/title")).click();
		
		//Identify progress bar
		
		WebElement scoller= driver.findElement(By.id("com.android.systemui:id/slider"));
		
		// To Move the horizontal scroll use the TouchAction class
		
		TouchAction action= new TouchAction((MobileDriver)driver);
		
		action.longPress(ElementOption.element(scoller)).moveTo(ElementOption.element(scoller,250,250)).release().perform();// Move the scoll to 250 , 250 position
		
	}

}
