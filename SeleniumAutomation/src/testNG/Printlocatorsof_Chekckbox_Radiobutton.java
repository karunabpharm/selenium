package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Printlocatorsof_Chekckbox_Radiobutton {
	public WebDriver driver;
  @Test
  public void f() {
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
		  driver=new FirefoxDriver();
		  driver.get("http://www.spicejet.com");
		  driver.manage().window().maximize();
		  
  }

}
