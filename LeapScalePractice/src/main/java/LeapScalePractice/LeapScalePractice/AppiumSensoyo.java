package LeapScalePractice.LeapScalePractice;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
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

		System.out.println("Sensoyo App is Launched");


		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

		driver.findElement(By.id("com.lsgp.sensoyo:id/editText_email")).sendKeys("vikrant.bulbule@leapscale.com");


		driver.hideKeyboard();

		driver.findElement(By.id("com.lsgp.sensoyo:id/editTextPassword")).sendKeys("vvbulbule");

		driver.hideKeyboard();

		driver.findElement(By.id("com.lsgp.sensoyo:id/buttonLogin")).click();

		Thread.sleep(5000);

		//driver.findElement(By.id("com.lsgp.sensoyo:id/menu_auto_renew")).click();

		//Thread.sleep(5000);

		//driver.findElement(By.id("com.lsgp.sensoyo:id/item_analytics_fragment")).click();

		//Thread.sleep(5000);

		driver.findElement(By.id("com.lsgp.sensoyo:id/item_alarms_fragment")).click();


		driver.findElement(By.id("com.lsgp.sensoyo:id/spinner_plant")).click();;
		//This approach is without using scrollTo() method
		//Scolling down till we get the element Memory
		MobileElement listitem=(MobileElement) driver.findElement(
				MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector()).scrollIntoView("
				+"new UiSelector().text(\"Goa Leap and Scale\"));"));

		Thread.sleep(5000);
		
		listitem.click();

		/*driver.findElement(By.id("com.lsgp.sensoyo:id/item_report_fragment")).click();

		 driver.findElement(By.id("com.lsgp.sensoyo:id/item_settings_fragment")).click();

		 driver.findElement(By.id("com.lsgp.sensoyo:id/menu_logout")).click();

		 Thread.sleep(5000);
		 driver.findElement(By.id("android:id/button1")).click();
		 */










	}

}
