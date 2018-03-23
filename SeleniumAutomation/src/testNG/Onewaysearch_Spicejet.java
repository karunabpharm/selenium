package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.Webdriver;
//import org.openqa.selenium.firefox.Firefoxd;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Onewaysearch_Spicejet {
	
public WebDriver d;

  
  public void verifyoneway(String a,String c,String i) throws Exception {
	  d.get ("http://www.spicejet.com");
	  Thread.sleep(8000);
	    d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		d.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("Bengaluru (BLR)")).click();
		d.findElement(By.linkText("30")).click();
		//Thread.sleep(3000);
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText(a);
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText(c);
		new Select(d.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText(i);
		new Select(d.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("INR");
		d.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	  
  }
  @Test(description="This test case is to verify one way to 3adults,2childs,1infants")
  public  void Test01() throws Exception {
	  verifyoneway("3","2","1");
	  
  }
  @Test(description="This test case is to verify one way to 2adults,1childs,0infants")
 
public void Test02() throws Exception {
	verifyoneway("2","1","0");
	  
  }
  @Test(description="This test case is to verify one way to 1adults,0childs,0infants")
  public void Test03() throws Exception {
	  verifyoneway("1","0","0");
	  
  }
  @BeforeTest
  
  public void beforeTest() {
	  d=new FirefoxDriver();
	  
	  d.manage().window().maximize();
	  
	  
	  
  }

}
