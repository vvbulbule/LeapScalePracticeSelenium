package LeapScalePractice.LeapScalePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/vbulbule/Selenium 3.14/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.findElement(By.id("menu1")).click();
		
		List <WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu')]//li//a"));
		
		
		
		System.out.println(list.size());
		
		
		 //Print all elements & To Select Particular Value "Angular"
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).getText());// Print all elements
			
			//To Select Particular Value "Angular"
			
			if(list.get(i).getText().contains("JavaScript")) {
				list.get(i).click();  // When we on JavaScript then it will open new page So it will show SataleElementReferenceException So Use Break
				break;// If Found break the loop
			}
		}
		
		
		// To Select and print all the Values from dropdown
		
		/*for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).getText());// Print all elements
			
			list.get(i).click();
		}*/
		

	}

}
