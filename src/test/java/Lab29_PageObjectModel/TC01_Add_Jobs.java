
package  Lab29_PageObjectModel;
import org.testng.annotations.Test;
import CommonUtil.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;
public class TC01_Add_Jobs
{
	WebDriver driver;
	
	
	@BeforeTest 
	public void  TestSetup()throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	}
	
	
	@Test
	public void Add_Skills() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		LoginPage L1= new LoginPage();
		L1.LoginPage(driver);
		L1.Login();
		
		JobsPage j1= new JobsPage();
		j1.JobsPage(driver);
		j1.Add_Jobs();
		
		HomePage H1= new HomePage();
		H1.HomePage(driver);
		H1.Logout();
		
	
	}
	
	@AfterTest 
	public void  TestCloser()throws Exception {
		
		driver.quit();
	}
	
	
	
}




////menu_admin_viewCompanyStructure







