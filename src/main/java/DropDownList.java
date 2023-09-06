import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownList {
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.edgedriver().setup();//It will download the updated driver executable
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	
	//Load the URL
	driver.get("https://demoqa.com/select-menu");
	
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300);", "");
	
	//create an object of select class
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
	
	Select sel=new Select(dropdown);
	sel.selectByIndex(5);
	System.out.println("Data Selected");
	
	Thread.sleep(5000);
	sel.selectByValue("7");
	
	Thread.sleep(2000);
	sel.selectByVisibleText("Magenta");
	
	//Multi select dropdown
	WebElement carsdropdown = driver.findElement(By.id("cars"));
	
	Select se=new Select(carsdropdown);
	
	js.executeScript("window.scrollBy(0,300);", "");
	
	se.selectByValue("volvo");
	Thread.sleep(3000);
	se.selectByValue("audi");
	se.selectByVisibleText("Saab");
	}
}