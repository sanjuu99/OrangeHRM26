package Lab02_LOGIN;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Opening_add_Jobs_webElements2 {
	
	WebDriver driver;
	
  @Test
  public void admin_login() throws Exception
  {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");  
	  
		findElement(By.name("txtUsername")).sendKeys("Admin");
		findElement(By.name("txtPassword")).sendKeys("admin123");
		findElement(By.id("btnLogin")).click();
	    findElement(By.id("menu_admin_viewAdminModule")).click();
	    findElement(By.id("menu_admin_Job")).click();
	    findElement(By.id("menu_admin_viewJobTitleList")).click();
	    findElement(By.id("btnAdd")).click();
	    findElement(By.id("jobTitle_jobTitle")).sendKeys("job1");
		findElement(By.id("jobTitle_jobDescription")).sendKeys("job1 desc");
		findElement(By.id("jobTitle_note")).sendKeys("job1 note");
		findElement(By.id("btnSave")).click();
	    

	
	}
	
	

public  WebElement findElement(By by) throws Exception 
{

	WebElement elem = driver.findElement(by);  
	
	if (driver instanceof JavascriptExecutor) 
	{
	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", elem);
 
	}
	return elem;
}


















	
	
}











