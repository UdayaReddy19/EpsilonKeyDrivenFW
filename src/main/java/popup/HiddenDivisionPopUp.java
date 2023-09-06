package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionPopUp {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
				
		//Load the URL
		driver.get("https://demo.actitime.com/login.do");
		
		//Login to app
		WebElement userNameTextField=driver.findElement(By.id("username"));
		userNameTextField.sendKeys("admin");
		WebElement passwordTextField=driver.findElement(By.className("pwdfield"));
		passwordTextField.sendKeys("manager");
		WebElement loginLink=driver.findElement(By.xpath("//a[@class='initial']"));
		loginLink.click();
		
		//Navigate to the tasks
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		
		//Check on check box
		driver.findElement(By.xpath("(//div[@class='img'])[2]")).click();
		
		//click on copy to
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='copyTo button']")).click();
		//click on cancel in HiddenDivisionPopup
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ok button']/following-sibling::div[@class='cancel button'])[5]")).click();
		System.out.println("Hidden Division popup Handled");
		
	}
}
