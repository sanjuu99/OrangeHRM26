package Lab02_LOGIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Simple_login_Practice2_FireFoxdriver {
	
	WebDriver driver;
	
  @Test
  public void Opening_HRM_Website() throws Exception
  
  {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\FireFoxDriver\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize() ;	
	  driver.get("https://opensource-demo.orangehrmlive.com/");  
	    
		
	 
	  
  }
}
