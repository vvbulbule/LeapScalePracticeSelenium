package LeapScalePractice.LeapScalePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/vbulbule/Selenium 3.14/chromedriver");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		WebElement date= driver.findElement(By.id("DepartDate"));
		date.click();
		String dateVal="23/07/2019";
		
		selectDateBydate(driver, date, dateVal);

	}
	public static void selectDateBydate(WebDriver driver, WebElement element, String dateVal) {
		JavascriptExecutor js = ((JavascriptExecutor) driver); 	
    	js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
	}
}
