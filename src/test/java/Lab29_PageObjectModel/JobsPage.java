package Lab29_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JobsPage 
{
	
	
	WebDriver driver;
	
	public void JobsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
  @Test
  public void Add_Jobs() throws Exception  {
		
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Job")).click();
		findElement(By.id("menu_admin_viewJobTitleList")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("jobTitle_jobTitle")).sendKeys("Job12");
		findElement(By.id("jobTitle_jobDescription")).sendKeys("Job12 Descr");
		findElement(By.id("jobTitle_note")).sendKeys("Job12 Note");
	}
  
  
  public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
}
