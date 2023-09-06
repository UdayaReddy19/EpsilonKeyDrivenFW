package epsilon.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();//It will download the updated driver executable
		WebDriver driver=new EdgeDriver();
		
		//Load the application Method used is get()
		driver.get("https://flipkart.com");
		System.out.println("Flipkart Loaded");
		
		//To get the page title -getTitle()
		String title = driver.getTitle();		
		System.out.println(title);
		
		//To get the current URL of the page -getCurrentURL()
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//To get the page source code - getPageSource();
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
		//To get the Window ID -getWindowHandle() ID varies for every run. It acts dynamically
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		driver.manage().window().maximize();
		driver.quit(); //will close all the existing tabs and browser
		System.out.println("Browser is closed");
		//driver.close(); //will close the current tab
		
		driver.findElement(null);
		}
}
