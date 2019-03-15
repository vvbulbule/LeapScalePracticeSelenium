package LeapScalePractice.LeapScalePractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverNew {

	public static WebDriver driver;
		
		@Test
		public void launchBrowser(){
			
			System.setProperty("webdriver.chrome.driver", "/home/vbulbule/Selenium 3.14/chromedriver");
	//WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
	
	driver.get("https://github.com/bonigarcia/webdrivermanager");
		
	

}}
