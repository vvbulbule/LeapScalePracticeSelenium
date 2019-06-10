package LeapScalePractice.LeapScalePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dc_Automation {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/vbulbule/Selenium 3.14/chromedriver");
		//WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		
		driver.get("https://driverconnecttest.randmcnally.com/DriverConnectIntegrated/");
		
		driver.findElement(By.xpath("//input[@name='contactEmail']")).sendKeys("suratna.nikam@leapscale.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password");
		
		driver.findElement(By.id("submit-user-login")).click();
	}

}
