package Lab29_1_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage {
	
	
	WebDriver driver;
	
  @Test
  public void Login() throws Exception
  
       {
	  
	 
	  findElement(By.name("txtUsername")).sendKeys("Admin");
	  findElement(By.name("txtPassword")).sendKeys("admin123");
	  findElement(By.name("Submit")).click();
	  
	  
       }
  
      public WebElement findElement(By by) throws Exception
      
          {
      
             WebElement elem = driver.findElement(by);
      
             if (driver instanceof JavascriptExecutor);
             
             {
            	 
             
             ((JavascriptExecutor)driver).executeScript("arguement[0].style.border='3px Solid Red'", elem);
             
             }
      
             return elem;
    		  
               }  
      
                }
	  
  







