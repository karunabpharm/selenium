package IOstream;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.biff.WorkbookMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Gmail_login {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
  @Test
  public void verifylogin() throws Exception {

	  FileInputStream G =new FileInputStream("E:\\Eclips_Workspace\\SeleniumAutomation\\OR\\Login_OR.xls");

	  Workbook m=Workbook.getWorkbook(G);

	  Sheet s=m.getSheet("Sheet1");
	  Thread.sleep(30000);
	  
	  driver.findElement(By.id(s.getCell(0,1).getContents())).sendKeys("karunabpharm");
	  driver.findElement(By.cssSelector(s.getCell(1,1).getContents())).click();
	  driver.findElement(By.name(s.getCell(2,1).getContents())).sendKeys("07429186166Kr");
	  driver.findElement(By.cssSelector(s.getCell(3,1).getContents())).click();
	  Thread.sleep(8000);	  
  }
  
  @Test
  public void verifylogout() {
	 Sheet s1 = w.getSheet("Sheet2");
	  //driver.findElement(By.cssSelector("span.gb_ab.gbii")).click();
		//driver.findElement(By.id("gb_71")).click();
		driver.findElement(By.cssSelector(s1.getCell(0,1).getContents())).click();
		driver.findElement(By.id(s1.getCell(0,2).getContents())).click();
		
	  
  }
  @BeforeTest
  public void beforeTest() {
	 driver=new FirefoxDriver();
	 driver.get("http://www.gmail.com");
	 driver.manage().window().maximize();
  }

}
