package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		//Launch the Browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
				
		//Load the URL
		driver.get("https://demoqa.com/alerts");
				
		Thread.sleep(2000);
		driver.findElement(By.id("alertButton")).click();
				
		//Handle the alert
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("Alert Handled");
				
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
				
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println("Cancelled");
				
		Thread.sleep(2000);
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("Epsilon");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
			
	}
}
