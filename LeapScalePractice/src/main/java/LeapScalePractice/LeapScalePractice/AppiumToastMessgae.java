package LeapScalePractice.LeapScalePractice;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class AppiumToastMessgae {

		static AppiumDriver<MobileElement> driver;
		
		
		 

		public static void main(String[] args) {
			try {
				readToastMessage();
			}catch (Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				exp.printStackTrace();
			}
			
		}
		
		public static void readToastMessage() throws Exception {
			
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
			 
			 driver.findElement(By.id("com.lsgp.sensoyo:id/editTextPassword")).sendKeys("vvbulbule1");
			 
			 driver.hideKeyboard();
			 
			 driver.findElement(By.id("com.lsgp.sensoyo:id/buttonLogin")).click();
			// driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			 String toastMeassage= driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
			 System.out.println(toastMeassage);
			 
			 Thread.sleep(5000);
			 
			/* driver.findElement(By.id("com.lsgp.sensoyo:id/menu_auto_renew")).click();
			 
			 Thread.sleep(2000);
			 
			 String toastMeassage= driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
			 System.out.println(toastMeassage);*/

	}}
