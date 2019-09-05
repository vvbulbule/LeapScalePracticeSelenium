package LeapScalePractice.LeapScalePractice;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumWheelerPickerView {
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
		cap.setCapability("appPackage", "com.ojassoft.astrosage");
		cap.setCapability("appActivity", "com.ojassoft.astrosage.ui.act.HomeInputScreen");//	  

		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url,cap);

		Thread.sleep(1000);

		driver.findElement(By.id("com.ojassoft.astrosage:id/buttonCalendar")).click();
		
		/*Thread.sleep(1000);
		List<MobileElement> values= driver.findElements(By.className("android.widget.NumberPicker"));
		
		String val1= values.get(0).getAttribute("value");
	
		System.out.println(val1);*/
		
		
		driver.findElement(By.id("android:id/button2")).click();
	}




}


