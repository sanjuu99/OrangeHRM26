package Lab02_LOGIN;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Non_static_method {
	
	static WebDriver driver;
	
	
  @Test
  public void admin_login() throws Exception
  {
	    
	Non_static_method a1  =new Non_static_method();
	
	    a1.OpenChromeBrowser();
		a1.login();
		a1.add_jobs();
		a1.add_jobs_Description();
		a1.add_jobs_Description_Note();
		driver.quit();
  }
  
  
	  public void OpenChromeBrowser() throws Exception {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");  
	
	  }
		
	
	
  public void login() throws Exception
  {
	  findElement(By.name("txtUsername")).sendKeys("Admin");
	  findElement(By.name("txtPassword")).sendKeys("admin123");
	  findElement(By.id("btnLogin")).click(); 
  }
  
  public void add_jobs() throws Exception
  {
  findElement(By.id("menu_admin_viewAdminModule")).click();
  findElement(By.id("menu_admin_Job")).click();
  findElement(By.id("menu_admin_viewJobTitleList")).click();
  findElement(By.id("btnAdd")).click();
  findElement(By.id("jobTitle_jobTitle")).sendKeys("job4");
  }
  
  public void add_jobs_Description () throws Exception
  {
	  findElement(By.id("jobTitle_jobDescription")).sendKeys("job4 desc");
  }
  
  public void add_jobs_Description_Note() throws Exception
  {
	  findElement(By.id("jobTitle_note")).sendKeys("job4 note");
	  findElement(By.id("btnSave")).click();
		
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











