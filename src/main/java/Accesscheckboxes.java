import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Accesscheckboxes {
	public static void main(String[] args) throws InterruptedException
	{
		//Launch the Browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://demo.actitime.com/login.do");
		org.openqa.selenium.WebElement un=driver.findElement(By.name("username"));
		

		//Identified the user name text field
		WebElement userNameTextField=driver.findElement(By.id("username"));
		System.out.println("Username Identified");
		userNameTextField.sendKeys("admin");
		
		//Identify password
		WebElement passwordTextField=driver.findElement(By.className("pwdfield"));
		System.out.println("Password Identified");
		passwordTextField.sendKeys("manager");
		
		//Identified the user name text field
		WebElement loginLink=driver.findElement(By.xpath("//a[@class='initial']"));
		System.out.println("login clicked");
		loginLink.click();
		
		Thread.sleep(5000);
		//Navigate to the tasks
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		
		//Check on all the check boxes
		List<WebElement> allCheckBoxes=driver.findElements(By.xpath("//div[@class='img']"));
		for(int i=1;i<allCheckBoxes.size();i++)
		{
			for(WebElement ele:allCheckBoxes)
			{
				ele.click();
			}
		}
		System.out.println("All check boxes are clicked");
	}
}
