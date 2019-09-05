package LeapScalePractice.LeapScalePractice;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;



public class AppiumAutoCompleteTextView {

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


	//Auto Complete Text Box
	public static void openCalculator() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName", "Nexus 5");
		cap.setCapability("udid","04d9520d03285620");
		cap.setCapability("platformName", "Android"); 
		cap.setCapability("platformVersion","6.0.1" );
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");//	 
		cap.setCapability("unicodeKeyboard", "true");                                     
		cap.setCapability("resetKeyboard", "true");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url,cap);

		Thread.sleep(1000);
		
		driver.findElementByAccessibilityId("Views").click();

		//We don't have to scroll till the views to click as we used accessibility id
		/*MobileElement listitem=(MobileElement) driver.findElement(
				MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector()).scrollIntoView("
				+"new UiSelector().text(\"Views\"));"));
		
		listitem.click();*/
		
		driver.findElementByAccessibilityId("Auto Complete").click();
		driver.findElementByAccessibilityId("1. Screen Top").click();
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("india");
		
		
		//now click on india from the dropdown	
		// To do this we need to press down of the keyboard 
		//driver.pressKeyCode(AndroidKeyCode.ACTION_DOWN);
		//driver.pressKeyCode(AndroidKeyCode.ENTER);
		
		//driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
		//driver.pressKeyCode(AndroidKeyCode.HOME);
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.HOME));

		
		





	}

}


