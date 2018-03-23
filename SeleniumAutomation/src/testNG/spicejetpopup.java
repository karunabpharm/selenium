package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class spicejetpopup {
	 public WebDriver driver;
	
	
  @Test
  public void f() throws Exception {
	 

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		driver.findElement(By.linkText("30")).click();
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("1");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("3");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(5000);
  }
      
  @Test//
  
  public void verifyalert() {
	  String str;
	 str= driver.switchTo().alert().getText();
	 System.out.println(str);
	  driver.switchTo().alert().accept();//ok
	  //driver.switchTo().alert().dismiss();//if we dont want or cancel command
  }
  @BeforeTest//
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
	  driver.manage().window().maximize();
	  		
  }

  @AfterTest
  public void afterTest() {
  }

}
