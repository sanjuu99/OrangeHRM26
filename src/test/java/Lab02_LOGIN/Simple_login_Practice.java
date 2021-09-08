package Lab02_LOGIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Simple_login_Practice {
	
	WebDriver driver;
	
  @Test
  public void Opening_HRM_Website() throws Exception
  
  {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");  
	    
		
	driver.quit();
	  
  }
}
