package LeapScalePractice.LeapScalePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/vbulbule/Selenium 3.14/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div")).click();
		
		List <WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label"));
		
		System.out.println(list.size());
		
		
		// Print all elements & To Select Particular Value "Angular"
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).getText());// Print all elements
			
			//To Select Particular Value "Angular"
			
			if(list.get(i).getText().contains("Angular")) {
				list.get(i).click();
				//break;// If Found break the loop
			}
		}
		
		
		// To Select and print all the Values from dropdown
		
		/*for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).getText());// Print all elements
			
			list.get(i).click();
		}
		*/

	}

}
