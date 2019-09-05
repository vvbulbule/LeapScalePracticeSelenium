package LeapScalePractice.LeapScalePractice;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumOTPVerification {

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


	//
	public static void openCalculator() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Nexus 5");
		cap.setCapability("udid","04d9520d03285620");
		cap.setCapability("platformName", "Android"); 
		cap.setCapability("platformVersion","6.0.1" );
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");//	  

		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url,cap);

		Thread.sleep(1000);

		driver.findElement(By.id("OS")).click();
		
		driver.findElement(By.id("SMS Messaging")).click();
		
		driver.findElement(By.id("io.appium.android.apis:id/sms_recipient")).sendKeys("1234");
		
		driver.findElement(By.id("io.appium.android.apis:id/sms_content")).sendKeys("DEMO OTP: 9595");
		
		driver.findElement(By.id("Send")).click();
		
		//StartActivity takes two parameter appPackage, appActivity 
		// byusing this we are switch the application from A to B
		//driver.startActivity();


	}

}


