package testNG;

import org.testng.annotations.Test;
import org.apache.jasper.tagplugins.jstl.core.If;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class ValidationCommands {
	public  WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.linkText("HMS")).click();
	  if(driver.findElement(By.name("username")).isDisplayed())
	  {
		  System.out.println("username is avialable");
		  driver.findElement(By.name("username")).sendKeys("mahesh");
	  }
	     
	  else 
	  {
		  System.out.println("username is not avialable");
		  
	  }
	 
	 
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.seleniumbymahesh.com");
	  driver.manage().window().maximize();
  }

}
