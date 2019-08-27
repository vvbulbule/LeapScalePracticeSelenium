package LeapScalePractice.LeapScalePractice;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumCalculatorRealme {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
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
		
		cap.setCapability("deviceName", "Realme 2 Pro");//
		cap.setCapability("udid","4e8b5c77");//
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion","9" );//9
		cap.setCapability("appPackage", "com.android.calculator2");//
		  cap.setCapability("appActivity", "com.android.calculator2.PortraitCalculator");//
		  
		 URL url = new URL("http://0.0.0.0:4723/wd/hub");
		   
		 driver = new AppiumDriver<MobileElement>(url,cap);
		 
		 System.out.println();
		 
		
		
	}

}
