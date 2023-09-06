import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement {
	public static void main(String[] args) throws InterruptedException
	{
		//Launch the Browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://demo.actitime.com/login.do");
		org.openqa.selenium.WebElement un=driver.findElement(By.name("username"));
		
		//To type the text
		un.sendKeys("Udaya");
		
		Thread.sleep(3000);
		
		//To clear the TextField
		un.clear();
		
		//To get the tagName
		String tagName=un.getTagName();
		System.out.println(tagName);
		
		//To get the Attribute name
		String attributeValue=un.getAttribute("placeholder");
		System.out.println(attributeValue);
		
		//To get the CSSValue
		String cssValue=un.getCssValue("width");
		System.out.println(cssValue);
	}
}
