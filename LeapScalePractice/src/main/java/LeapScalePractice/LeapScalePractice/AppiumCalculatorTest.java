package LeapScalePractice.LeapScalePractice;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumCalculatorTest {

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

		DesiredCapabilities cap = new DesiredCapabilities();// DesiredCapabilities is the class name

		cap.setCapability("deviceName", "Nexus 5");//Realme 2 Pro
		cap.setCapability("udid","04d9520d03285620");//4e8b5c77  // 
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion","6.0.1" );//9
		cap.setCapability("appPackage", "com.google.android.calculator");//com.android.calculator2 // 
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");//	  

		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url,cap);

		System.out.println();  


		Thread.sleep(1000);


		MobileElement two= driver.findElement(By.id("com.google.android.calculator:id/digit_2"));

		two.click();

		MobileElement plus= driver.findElement(By.id("com.google.android.calculator:id/op_add"));

		plus.click();


		MobileElement three= driver.findElement(By.id("com.google.android.calculator:id/digit_3"));

		three.click();
		
		MobileElement equals= driver.findElement(By.id("com.google.android.calculator:id/eq"));

		equals.click();
		
		MobileElement result= driver.findElement(By.id("com.google.android.calculator:id/result"));
		
		
		System.out.println(result.getText());
		


	}

}
