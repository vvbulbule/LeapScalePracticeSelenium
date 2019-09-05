package LeapScalePractice.LeapScalePractice;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class AppiumCheckbox {

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

		
		//Check Box
		public static void openCalculator() throws Exception {

			DesiredCapabilities cap = new DesiredCapabilities();

			cap.setCapability("deviceName", "Nexus 5");
			cap.setCapability("udid","04d9520d03285620");
			cap.setCapability("platformName", "Android"); 
			cap.setCapability("platformVersion","6.0.1" );
			cap.setCapability("appPackage", "com.eajy.materialdesigndemo");
			cap.setCapability("appActivity", "com.eajy.materialdesigndemo.activity.MainActivity");//	  

			URL url = new URL("http://0.0.0.0:4723/wd/hub");

			driver = new AppiumDriver<MobileElement>(url,cap);

			Thread.sleep(1000);

			//driver.findElement(By.id("com.android.settings:id/switch_widget")).click();
			
			//Scolling down till we get the element Memory
			MobileElement listitem=(MobileElement) driver.findElement(
					MobileBy.AndroidUIAutomator(
							"new UiScrollable(new UiSelector()).scrollIntoView("
					+"new UiSelector().text(\"Settings\"));"));
			
			listitem.click();
			
			MobileElement listitem2=(MobileElement) driver.findElement(
					MobileBy.AndroidUIAutomator(
							"new UiScrollable(new UiSelector()).scrollIntoView("
					+"new UiSelector().text(\"Check Box Preference\"));"));
			
			listitem2.click();

			

		}


	}


