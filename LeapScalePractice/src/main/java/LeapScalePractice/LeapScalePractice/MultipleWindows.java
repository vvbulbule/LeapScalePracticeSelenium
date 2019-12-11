package LeapScalePractice.LeapScalePractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {
    // Declaring variables
    private WebDriver driver;
    private String baseUrl;

 

    @Test
    public void testPageTitle() throws Exception {
    	
    	WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		baseUrl = "https://chandanachaitanya.github.io/selenium-practice-site/";
        // Open baseUrl in Firefox browser window
        driver.get(baseUrl);

        // Get current window handle
        String parentWinHandle = driver.getWindowHandle();
        System.out.println("Parent window handle: " + parentWinHandle);
        // Locate 'Click to open a new browser window!' button using id
        WebElement newWindowBtn = driver.findElement(By.id("win1"));
        // Click the button to open a new window
        newWindowBtn.click();
        // Get the window handles of all open windows
        Set<String> winHandles = driver.getWindowHandles();
        // Loop through all handles
        for(String handle: winHandles){
            if(!handle.equals(parentWinHandle)){
            driver.switchTo().window(handle);
            Thread.sleep(1000);
            System.out.println("Title of the new window: " +
driver.getTitle());
            System.out.println("Closing the new window...");
            driver.close();
            }
        }
        // Switching the control back to parent window
        driver.switchTo().window(parentWinHandle);
        // Print the URL to the console
        System.out.println("Parent window URL: " + driver.getCurrentUrl());

    } 

    
}