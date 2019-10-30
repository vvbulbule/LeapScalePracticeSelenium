package LeapScalePractice.LeapScalePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/vbulbule/Selenium 3.14/chromedriver");
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("testing");
		
		

	}

}
