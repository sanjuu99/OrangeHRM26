package Lab29_PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StructurePage {
	
	
	WebDriver driver;
	
	public void StructurePage(WebDriver driver)
	
	{
		this.driver=driver;
	}
	
	
  @Test
  public void Add_Structure() throws Exception {
	  
	  
	  
	  findElement(By.id("menu_admin_viewAdminModule")).click();
	  findElement(By.id("menu_admin_Organization")).click();
	  findElement(By.id("menu_admin_viewCompanyStructure")).click();
	  findElement(By.id("btnEdit")).click();
	  findElement(By.id("treeLink_addChild_2")).click();
	  findElement(By.id("txtName")).sendKeys("OHRM");
	  findElement(By.id("btnSave")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
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
