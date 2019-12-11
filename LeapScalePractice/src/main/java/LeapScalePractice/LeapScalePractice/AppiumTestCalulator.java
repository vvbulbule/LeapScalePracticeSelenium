
package LeapScalePractice.LeapScalePractice;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumTestCalulator {
    
    public static void main(String[] args) throws MalformedURLException {
        
        //Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Galaxy On7 Pro");
        caps.setCapability("udid", "4fd8f2e5"); //Give Device ID of your mobile phone
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "6.0.1");
        caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");//com.randmcnally.driverconnect
        caps.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
      //caps.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
        //caps.setCapability("noReset", "true");
        
        //Instantiate Appium Driver
      
                AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
            
       
    }

}