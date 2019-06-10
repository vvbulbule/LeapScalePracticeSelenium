package LeapScalePractice.LeapScalePractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseEvent22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 72.0.3626.121
		
		System.setProperty("webdriver.chrome.driver", "/home/vbulbule/Selenium 3.14/chromedriver");
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver");
		
		//WebDriverManager.chromedriver().version("72.0.3626.121").setup();;
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new HtmlUnitDriver();
		driver.get("https://sites.google.com/a/chromium.org/chromedriver/downloads");
		
		System.out.println(driver.getTitle());
		
		/*Actions action =new Actions(driver);	
		
		WebElement menu= driver.findElement(By.xpath(".//*[@id='post-body-4229879368008023176']/div[1]/div[2]/button"));
		
		action.moveToElement(menu).build().perform();
		
		driver.findElement(By.xpath(".//*[@id='post-body-4229879368008023176']/div[1]/div[2]/div/a[2]")).click();*/

	}

}
