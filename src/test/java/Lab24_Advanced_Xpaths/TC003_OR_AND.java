package Lab24_Advanced_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC003_OR_AND {
	
	WebDriver driver;
	
	
	//First step is copy the web element and paste as below:
	
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	
	//Now create two types of xpaths manually like Login_Xpath, Login1_Xpath1 and use in program.
	
	//<input name="txtUsername" id="txtUsername" type="text">
	
	//input[@name='txtUsername'  and  @id='txtUsername']
	
	// or will be used very rarely
	
	String  Login_Xpath="//*[@type='submit' or @name='btnReset']";
	String 	Login1_Xpath1="//input[@type='submit' and @id='btnLogin']";

	
	@Test
	public void Test1()throws Exception
	{
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		findElement(By.name("txtUsername")).sendKeys("Admin");
		findElement(By.name("txtPassword")).sendKeys("admin123");
		
		findElement(By.xpath(Login1_Xpath1)).click();			
		
		    

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
