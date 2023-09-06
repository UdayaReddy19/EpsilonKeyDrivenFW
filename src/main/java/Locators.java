import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	public static void main(String[] args)
	{
		//Launch the Browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		//get URL
		driver.get("https://demo.actitime.com/login.do");
		
		//Identified the user name text field
		WebElement userNameTextField=driver.findElement(By.id("username"));
		System.out.println("Username Identified");
		userNameTextField.sendKeys("trainee");
		
		//Identify password
		WebElement passwordTextField=driver.findElement(By.name("pwd"));
		System.out.println("Password Identified");
		passwordTextField.sendKeys("trainee");
		
		//Identified the user name text field
		WebElement loginLink=driver.findElement(By.xpath("//a[@class='initial']"));
		System.out.println("login clicked");
		loginLink.click();
		
		//Link Text
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		//driver.findElement(By.cssSelector("input[name='pwd'])")).sendKeys("manager");
	}
}
