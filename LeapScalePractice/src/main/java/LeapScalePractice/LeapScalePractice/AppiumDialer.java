package LeapScalePractice.LeapScalePractice;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumDialer {

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
			cap.setCapability("appPackage", "com.google.android.dialer");
			cap.setCapability("appActivity", "com.google.android.dialer.DialtactsActivity");//	  

			URL url = new URL("http://0.0.0.0:4723/wd/hub");

			driver = new AppiumDriver<MobileElement>(url,cap);


			Thread.sleep(2000);
			
			
			
			
			driver.findElement(By.id("com.google.android.dialer:id/floating_action_button")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("com.google.android.dialer:id/nine")).click();
			driver.findElement(By.id("com.google.android.dialer:id/six")).click();
			driver.findElement(By.id("com.google.android.dialer:id/five")).click();
			driver.findElement(By.id("com.google.android.dialer:id/one")).click(); 
			
			driver.findElement(By.id("com.google.android.dialer:id/dialpad_floating_action_button")).click();
	
			


		

	}

}
