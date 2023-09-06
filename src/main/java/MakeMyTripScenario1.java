import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripScenario1 {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		//Open the browser
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(15000);
		
		driver.findElement(By.className("close")).click();
		
	}
}
