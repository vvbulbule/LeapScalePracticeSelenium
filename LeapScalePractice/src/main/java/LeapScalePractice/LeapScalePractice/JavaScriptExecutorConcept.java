package LeapScalePractice.LeapScalePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/vbulbule/Selenium 3.14/chromedriver");
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://freecrm.com/");
		
		WebElement login_Btn= driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[3]/ul/a"));
		
		WebElement Register_Now= driver.findElement(By.xpath("/html/body/div[1]/footer/div/div/div[1]/div/a/span[2]"));
		
		flash(login_Btn, driver);//observe carefully background color of Login Button
		
		drawBorder(login_Btn, driver);
		
		clickElementByJS(login_Btn, driver);
		
		driver.navigate().back();
		
		refreshBrowserByJS(driver);
		
		System.out.println(getTitleByJS(driver));
		
		System.out.println(getPageInnerText(driver));
		
		scrollPageDown(driver);
		
		//scrollIntoView(Register_Now, driver);
		
	}

	public static void flash(WebElement element,WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		String bgcolor= element.getCssValue("backgroundcolor");
		
		for(int i=0;i<10;i++) {
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor,element,driver);
		}
	}
	
	   public static void changeColor(String color, WebElement element, WebDriver driver) {
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

	        try {
	            Thread.sleep(20);
	        }  catch (InterruptedException e) {
	        }
	   }
	   
	   public static void drawBorder(WebElement element, WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("arguments[0].style.border='3px solid red'", element);
	    }
	   
	   public static void clickElementByJS(WebElement element, WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("arguments[0].click();", element);
	    	
	    }
	   
	   public static void refreshBrowserByJS(WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("history.go(0)");
	    }
	   
	   public static String getTitleByJS(WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	String title = js.executeScript("return document.title;").toString();
	    	return title;
	    }
	   
	   public static String getPageInnerText(WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	String pageText = js.executeScript("return document.documentElement.innerText;").toString();
	    	return pageText;
	    }
	   
	   public static void scrollPageDown(WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    }
	   
	    
	    public static void scrollIntoView(WebElement element, WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("arguments[0].scrollIntoView(true);", element);
	    }
}
