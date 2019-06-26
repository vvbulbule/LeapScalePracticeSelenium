package LeapScalePractice.LeapScalePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandingJSExecutor {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/home/vbulbule/Selenium 3.14/chromedriver");
	

	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
	driver.manage().window().maximize();
	
	WebElement date= driver.findElement(By.id("datepicker"));
	String dateVal="10/11/1991";
	
	selectDateBydate(driver, date, dateVal);
	
	}
	
	public static void selectDateBydate(WebDriver driver, WebElement element, String dateVal) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
	}
}