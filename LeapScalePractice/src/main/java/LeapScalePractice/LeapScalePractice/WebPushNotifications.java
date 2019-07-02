package LeapScalePractice.LeapScalePractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebPushNotifications {

	public static void main(String[] args) {
		
		// In FireFox
		
		/*System.setProperty("webdriver.gecko.driver", "/home/vbulbule/Selenium 3.14/geckodriver");
		
		FirefoxOptions opt= new FirefoxOptions();
		
		opt.addPreference("dom.webnotifications.enabled", false);
		
		WebDriver driver= new FirefoxDriver(opt);
		
		driver.get("https://www.redbus.in/");
		 */
		
		// In Chrome
		System.setProperty("webdriver.chrome.driver", "/home/vbulbule/Selenium 3.14/chromedriver");
		
		ChromeOptions opt= new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver(opt);
		
		driver.get("https://www.redbus.in/");
		
	}

}
