package Lab02_LOGIN;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_method_with_Parameters {
	
	static WebDriver driver;
    static String Username= "Admin", Password="admin123";
    static String Jobtitle= "job111",JobDescription= "job111 Desc" ,Jobnote="job111 note";
    static String Test_url = "https://opensource-demo.orangehrmlive.com/";
    
  @Test
  public void admin_login() throws Exception {
	  
	  Static_method_with_Parameters.OpenChromeBrowser(Test_url);
	  Static_method_with_Parameters.login(Username, Password);
	  Static_method_with_Parameters.add_jobs(Jobtitle,JobDescription,Jobnote);
	  driver.quit();
  }
  public static void OpenChromeBrowser(String Test_url1) throws Exception {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get(Test_url1);  
		
	  }
		
  public static void login(String Username1, String Password1 ) throws Exception
  {
	  //findElement(By.name("txtUsername")).sendKeys("Username1");
	  //findElement(By.name("txtPassword")).sendKeys("Password1");
	findElement(By.name("txtUsername")).sendKeys(Username1);
	findElement(By.name("txtPassword")).sendKeys(Password1);
	  findElement(By.id("btnLogin")).click(); 
  }
  
  public static void add_jobs(String Jobtitle1,String JobDescription1,String Jobnote1) throws Exception
  {
  findElement(By.id("menu_admin_viewAdminModule")).click();
  findElement(By.id("menu_admin_Job")).click();
  findElement(By.id("menu_admin_viewJobTitleList")).click();
  findElement(By.id("btnAdd")).click();
  findElement(By.id("jobTitle_jobTitle")).sendKeys(Jobtitle1);
  findElement(By.id("jobTitle_jobDescription")).sendKeys(JobDescription1);
  findElement(By.id("jobTitle_note")).sendKeys(Jobnote1);
  findElement(By.id("btnSave")).click();
  }
  
 
  
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