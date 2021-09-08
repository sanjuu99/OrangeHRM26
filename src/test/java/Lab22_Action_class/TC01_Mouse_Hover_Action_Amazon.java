package Lab22_Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class TC01_Mouse_Hover_Action_Amazon {
	
	
	static WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	//findElement(By.name("txtUsername")).sendKeys("Admin");
	//findElement(By.name("txtPassword")).sendKeys("admin123");
	//findElement(By.id("btnLogin")).click();
	
	WebElement Hello_SignIn=findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));
	WebElement Your_Orders=findElement(By.xpath("//*[@id='nav-al-your-account']/a[1]/span"));
	

	Actions actions = new Actions(driver);
	
	 actions.moveToElement(Hello_SignIn).
	 moveToElement(Your_Orders).click().build().perform();
		
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
