package testNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Spicejetdropdown18 {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	 List<WebElement>str=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).getOptions(); 
	  System.out.println(str.size());
  }
  @BeforeTest
  public void beforetest() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.spicejet.com");
	  driver.manage().window().maximize();
  }

}
