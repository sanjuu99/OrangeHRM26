package Lab02_LOGIN;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Statice_method {
	
	static WebDriver driver;

	
	
  @Test
  public static void admin_login() throws Exception
  
  {
	  
	  Statice_method.OpenChromeBrowser();
	  Statice_method.login();
	  Statice_method.add_jobs();
	  driver.quit();
	 // Opening_add_Jobs_webElements_static.add_jobs_Description();
	 // Opening_add_Jobs_webElements_static.add_jobs_Description_Note();
	 // Opening_add_Jobs_webElements_static.Logout();
		
  }
  
  
	  public static void OpenChromeBrowser() throws Exception {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");  
		
	  }
		
	
	
  public static void login() throws Exception
  {
	  findElement(By.name("txtUsername")).sendKeys("Admin");
	  findElement(By.name("txtPassword")).sendKeys("admin123");
	  findElement(By.id("btnLogin")).click(); 
  }
  
  public static void add_jobs() throws Exception
  {
  findElement(By.id("menu_admin_viewAdminModule")).click();
  findElement(By.id("menu_admin_Job")).click();
  findElement(By.id("menu_admin_viewJobTitleList")).click();
  findElement(By.id("btnAdd")).click();
  findElement(By.id("jobTitle_jobTitle")).sendKeys("Job101");
  findElement(By.id("jobTitle_jobDescription")).sendKeys("Job101 Desc");
  findElement(By.id("jobTitle_note")).sendKeys("Job101 Note");
  findElement(By.id("btnSave")).click();
  
  }
  
 /* public static void add_jobs_Description () throws Exception
  {
	  findElement(By.id("jobTitle_jobDescription")).sendKeys("job9 desc");
  }*/
  
 /* public  static void add_jobs_Description_Note() throws Exception
  {
	  findElement(By.id("jobTitle_note")).sendKeys("job9 note");
	  findElement(By.id("btnSave")).click();
		
  }
  
  public  static void Logout() throws Exception {
	  findElement(By.id("welcome")).click();
	  findElement(By.className("PannelContainer")).click();
	  
	  findElement(By.linkText("Logout")).click();
  }*/
  public static  WebElement findElement(By by) throws Exception 
{

	WebElement elem = driver.findElement(by);  
	
	if (driver instanceof JavascriptExecutor) 
	{
	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
 
	}
	
	return elem;
}


}











