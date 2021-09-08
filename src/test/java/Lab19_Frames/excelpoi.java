package datadriven;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class test1 {
	
	static WebDriver driver;
	@Test
	public void f() throws Exception {

		
		FileInputStream file = new FileInputStream("C:\\Users\\Omkar\\Desktop\\testit.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file); // ref variable store as file and to connect excel
		XSSFSheet sheet = wb.getSheet("Sheet1"); // to connect sheet and naming sheet no

		int rowcount = sheet.getLastRowNum();

		for (int i = 1; i <= rowcount; i++) {
			
			// this for loop used to read each row
			XSSFRow row = sheet.getRow(i);
			

			String login = row.getCell(0).getStringCellValue();
			String pass = row.getCell(1).getStringCellValue();
			String name = row.getCell(2).getStringCellValue();
			String select = row.getCell(3).getStringCellValue();
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");

			// the below code is to inspect my webelementss
			driver.findElement(By.name("txtUsername")).sendKeys(login);
			driver.findElement(By.name("txtPassword")).sendKeys(pass);
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.linkText("Admin")).click();
			driver.findElement(By.xpath("//a[@id='menu_admin_Organization']")).click();
			driver.findElement(By.xpath("//a[@id='menu_admin_viewLocations']")).click();
			driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
			driver.findElement(By.xpath("//input[@id='location_name']")).sendKeys(name);
			Select omkar1 = new Select(driver.findElement(By.xpath("//select[@id='location_country']")));
			omkar1.selectByVisibleText(select);
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			driver.findElement(By.xpath("//a[@id='welcome']")).click();
			 Thread.sleep(3000);
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
			driver.quit();

		}

	}
}
