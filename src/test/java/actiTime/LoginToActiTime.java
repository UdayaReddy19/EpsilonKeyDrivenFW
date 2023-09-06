package actiTime;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;

public class LoginToActiTime {
	@Test
	public void loginToApp()
	{
		
		//Launch the browser
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the application
		
		driver.get("https://demo.actitime.com/login.do");
		
		//Login to Application
		
		LoginPage lp=new LoginPage(driver);
		lp.LoginToApp("admin", "manager");
		//lp.getUsernameEdt().sendKeys("admin");
		//lp.getPasswordEdt().sendKeys("manager");
		//lp.getLoginBtn().click();
		System.out.println("Logged in");
	}
}