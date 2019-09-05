package LeapScalePractice.LeapScalePractice;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class AppiumVerticalScroll {

	static AppiumDriver<MobileElement> driver;
	static Dimension size;

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


	//
	public static void openCalculator() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Nexus 5");
		cap.setCapability("udid","04d9520d03285620");
		cap.setCapability("platformName", "Android"); 
		cap.setCapability("platformVersion","6.0.1" );
		cap.setCapability("appPackage", "com.android.settings");
		cap.setCapability("appActivity", "com.android.settings.Settings");//	  

		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url,cap);

		Thread.sleep(1000);

		//As all the elements of the screen is having the same id in the Settings so we need to capture all list items
		
		AndroidElement list=(AndroidElement) driver.findElement(By.id("com.android.settings:id/title"));
		
		
		//Scolling down till we get the element Memory
		MobileElement listitem=(MobileElement) driver.findElement(
				MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector()).scrollIntoView("
				+"new UiSelector().text(\"Memory\"));"));
		
		
		System.out.println(listitem.getLocation());
		listitem.click();

		  
		
	}


}


