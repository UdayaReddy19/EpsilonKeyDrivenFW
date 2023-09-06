package epsilon.WebDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;

public class DataProvider {
	@Test(dataProvider="getData")
	public void sample(String Username,String password)
	{
		System.out.println(" Username --> " +  Username  + " and Password--> " + password);
		//Launch the browser
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//Load the application
				
		driver.get("https://demo.actitime.com/login.do");
				
		//Login to Application
				
		LoginPage lp=new LoginPage(driver);
		lp.LoginToApp(Username, password);
		
		//validate for home page Title
		//String ExpTitle="actiTIME -  Enter Time-Track";
		String actTitle = driver.getTitle();
		
		//Assert.assertEquals(actTitle,ExpTitle);
		Assert.assertTrue(actTitle.contains("actiTIME"));
		System.out.println("Matched");
	}
	
	@org.testng.annotations.DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		
		
		data[0][0]="admin";
		data[0][1]="manager";
		
		data[1][0]="trainee";
		data[1][1]="trainee";
		
		data[2][0]="hi";
		data[2][1]="hello";
		
		return data;
	}
}
