import java.time.Duration;

import org.apache.hc.core5.reactor.AbstractIOSessionPool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {
public static void main(String[] args) throws InterruptedException {
	//Launch the Browser
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	/*		
	//get URL
	driver.get("https://amazon.com");
			
	//Mouse Hovering Action
			
	WebElement element = driver.findElement(By.xpath("//div[text()='EN']"));
			
	Actions act =new Actions(driver);
	act.moveToElement(element).perform();
			
	System.out.println("Mouse Hovering done");	
	*/
	
	/*
	//Double Click
	driver.get("https://demoqa.com/buttons");
	driver.findElement(By.id("doubleClickBtn"));
	
	Actions act1=new Actions(driver);
	System.out.println("Double Click Done");
	
	WebElement rytEle=driver.findElement(By.id("rightClickBtn"));;
	act1.contextClick(rytEle).perform();
	System.out.println("Right Click Done");
	
	*/
	/*
	//Drag and Drop operation
	
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	WebElement srcElement = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
	WebElement targetElement = driver.findElement(By.xpath("//div[text()='United States']"));
	
	Actions act2=new Actions(driver);
	act2.dragAndDrop(srcElement, targetElement).perform();	
	
	*/
	
	//Move anywhere on the web page based on offset/coordinate values
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.moveByOffset(10, 10).click().perform();
	
	Thread.sleep(3000);
	act.moveByOffset(10, 10).click().perform();
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleContains("MakeMyTrip"));
	System.out.println("Condition Satisfied");
}
}