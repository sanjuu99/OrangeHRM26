package  Lab05_Data_Provider;
import CommonUtil.*;
import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
public class OHRM_DataProvider_Method_1
{
	static WebDriver driver;
	
	//if u want to execute u r test with multiple input test data , we can user Data Provider
	
	//step1
	 @DataProvider(name = "Orange10")
	  public static Object[][] Test1() throws Exception {
	 
	        return new Object[][] { 
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Job191","Job191 Decr"},
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Job192","Job192 Decr" }
	        	};
	  }
	 
	 //For Every new Test, we need to change job titles, Job Description etc.
	
@Test(dataProvider = "Orange10") //step2 u r test will be connected to dataProvider 
public void Test1(String TestURL,String UserName,String Password,String JobTitle,String JobTitle_Descr) throws Exception {   
	//step3 ensure number of parameters
		
		
		//OpenChromeBrowser
		driver = TestBrowser.OpenChromeBrowser();

		//OpenUrl
		driver.get(TestURL);
		

		//SendKeys
		 findElement(By.id("txtUsername")).sendKeys(UserName);
		 findElement(By.id("txtPassword")).sendKeys(Password);
		 findElement(By.id("btnLogin")).click();
		
			  
		 findElement(By.linkText("Admin")).click();
		 findElement(By.linkText("Job")).click();
		 findElement(By.linkText("Job Titles")).click();
		 findElement(By.name("btnAdd")).click();
		 findElement(By.id("jobTitle_jobTitle")).sendKeys(JobTitle);
		 findElement(By.id("jobTitle_jobDescription")).sendKeys(JobTitle_Descr);
		 findElement(By.id("btnSave")).click();	
		 

		 	  
		 driver.quit();	 
		 

	}
	

// Draws a red border around the found element. Does not set it back anyhow.
		public  WebElement findElement(By by) throws Exception {
			
		    WebElement elem = driver.findElement(by);
		    	    
		    // draw a border around the found element
		    if (driver instanceof JavascriptExecutor) {
		        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		        
		  //  TH3.HTMLScreenShot("Screen Shot","Click Here","Pass", HtmlOutputFileName,driver);
		        
		    }
		    return elem;
		}
		
	
	
}
	
	
	
	
	
	
	 
	













