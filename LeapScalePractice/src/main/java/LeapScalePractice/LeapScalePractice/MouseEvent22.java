package LeapScalePractice.LeapScalePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseEvent22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 72.0.3626.121
		
		System.setProperty("webdriver.chrome.driver", "/home/vbulbule/Selenium 3.14/chromedriver");
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver");
		
		//WebDriverManager.chromedriver().version("72.0.3626.121").setup();;
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://sites.google.com/a/chromium.org/chromedriver/downloads");
		
		/*Actions action =new Actions(driver);
		
		WebElement menu= driver.findElement(By.xpath(".//*[@id='post-body-4229879368008023176']/div[1]/div[2]/button"));
		
		action.moveToElement(menu).build().perform();
		
		driver.findElement(By.xpath(".//*[@id='post-body-4229879368008023176']/div[1]/div[2]/div/a[2]")).click();*/

	}

}
