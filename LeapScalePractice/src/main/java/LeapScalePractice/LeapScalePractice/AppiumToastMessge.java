package LeapScalePractice.LeapScalePractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumToastMessge {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Nexus 5");//Realme 2 Pro
		cap.setCapability("udid","04d9520d03285620");//4e8b5c77
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion","6.0.1" );//9
		cap.setCapability("appPackage", "com.msedcl.app");//com.android.calculator2
		  cap.setCapability("appActivity", "com.msedcl.callcenter.src.SplashActivity");//com.android.calculator2.Calculator
		  
		 URL url = new URL("http://0.0.0.0:4723/wd/hub");
		   
		 driver = new AppiumDriver<MobileElement>(url,cap);
		 Thread.sleep(5000);
		 driver.findElement(By.id("com.msedcl.app:id/button_one")).click();
		 driver.findElement(By.id("com.msedcl.app:id/user_name_edittext")).sendKeys("vvbulbule");
		 driver.findElement(By.id("com.msedcl.app:id/password_edittext")).sendKeys("vvbulbule");
		 driver.findElement(By.id("com.msedcl.app:id/login_button")).click();
		 
		 String toastMeassage= driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		 System.out.println(toastMeassage);
		 

	}

}
