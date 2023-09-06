import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonExample {
	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://amazon.com");
		
		//Searching for an item
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println("Search Identified");
		searchItem.sendKeys("Bluetooth Earphones");
		
		WebElement clickSearch = driver.findElement(By.id("nav-search-submit-button"));
		clickSearch.click();
		
		
		List<WebElement> itemClick=driver.findElements(By.xpath("//div[@class='sg-col-inner']"));
		System.out.println("Path accessed");
		int a=itemClick.size();
		System.out.println(a);
		
	}

}
