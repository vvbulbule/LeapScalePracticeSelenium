package LeapScalePractice.LeapScalePractice;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumSensoyo {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		try {
			openSensoyo();
		}catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	
	public static void openSensoyo() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Nexus 5");//Realme 2 Pro
		cap.setCapability("udid","04d9520d03285620");//4e8b5c77
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion","6.0.1" );//9
		cap.setCapability("appPackage", "com.lsgp.sensoyo");//com.android.calculator2
		  cap.setCapability("appActivity", "com.lsgp.sensoyo.activity.SplashActivity");//com.android.calculator2.Calculator
		  
		 URL url = new URL("http://0.0.0.0:4723/wd/hub");
		   
		 driver = new AppiumDriver<MobileElement>(url,cap);
		 
		 System.out.println();
		 
		
		
	}

}
