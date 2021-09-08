package Lab24_Advanced_Xpaths;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC007_Ancestor {
	
	WebDriver driver;
	
	
	
	@Test
	public void Test1()throws Exception
	{
		
		//*[@id="txtUsername"]//following::input[1]
		
	    //*[@id="btnLogin"]//following::input
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		//UserName
		findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
			
		Thread.sleep(5000);
		findElement(By.xpath(" //*[@id='txtUsername']//ancestor::div[1] "));
		
			
		Thread.sleep(5000);

		findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
		Thread.sleep(5000);
		
		findElement(By.xpath(" //*[@id='txtPassword']//ancestor::div[1] "));
		
		////*[@id="btnLogin"]
		
		findElement(By.xpath(" //*[@id='btnLogin']")).click();
		
		
	}
	
	
	 public  WebElement findElement(By by) throws Exception 
		{
					
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}

	
	
	
	
	
	
	
}
