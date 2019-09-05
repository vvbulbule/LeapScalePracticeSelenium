package LeapScalePractice.LeapScalePractice;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumTextBox {

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
		cap.setCapability("appPackage", "com.google.android.keep");
		cap.setCapability("appActivity", "com.google.android.apps.keep.ui.activities.BrowseActivity");//	  

		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url,cap);

		//Thread.sleep(5000);
		
		driver.findElement(By.id("com.google.android.keep:id/skip_welcome")).click();
		
		Thread.sleep(5000);

		//Handling Text Box,Check Box in Google Keep App
		
		driver.findElement(By.id("com.google.android.keep:id/open_search_bar_text_view")).sendKeys("Sensoyo");// Enter Values in search box
		
		driver.findElement(By.id("com.google.android.keep:id/open_search_bar_text_view")).clear();
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Back\"]")).click();
		
		/*driver.findElement(By.id("com.google.android.keep:id/new_list_button")).click();
		
		driver.findElement(By.id("com.google.android.keep:id/checkbox")).click();*/
		
	

		


	}

}


