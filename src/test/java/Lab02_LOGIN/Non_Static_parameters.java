package Lab02_LOGIN;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Non_Static_parameters {
	
	static WebDriver driver;
	String Username = "Admin", Password = "admin123";
	String jobs= "job29", jobsDescription= "job29 Desc";
	static String Test_url = "https://opensource-demo.orangehrmlive.com/";
	
  @Test
  public void admin_login() throws Exception
  {
	    
	Non_Static_parameters TN1  =new Non_Static_parameters();
	TN1.OpenChromeBrowser();
	TN1.OpenOrangeHRM(Test_url);
	TN1.login(Username,Password);
	TN1.add_jobs(jobs,jobsDescription);
   
	driver.quit();
  }
		
	
  public void login(String Username1,String Password1) throws Exception
  {
	  findElement(By.name("txtUsername")).sendKeys(Username1);
	  findElement(By.name("txtPassword")).sendKeys(Password1);
	  findElement(By.id("btnLogin")).click(); 
  }
  
 public void add_jobs(String jobs1,String jobsDescription1) throws Exception
 {
  findElement(By.id("menu_admin_viewAdminModule")).click();
  findElement(By.id("menu_admin_Job")).click();
  findElement(By.id("menu_admin_viewJobTitleList")).click();
  findElement(By.id("btnAdd")).click();
  findElement(By.id("jobTitle_jobTitle")).sendKeys(jobs1);
  findElement(By.id("jobTitle_jobDescription")).sendKeys(jobsDescription1);
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

  public void OpenOrangeHRM(String Test_url) throws Exception {
	  driver.get(Test_url);  
	  
  }
  
  public void OpenChromeBrowser() throws Exception {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;


}

  }









