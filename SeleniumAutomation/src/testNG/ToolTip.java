package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class ToolTip {
	public WebDriver driver;
	
  @Test
  public void f() {
	  String str;
	  str= driver.findElement(By.id("hplogo")).getAttribute("");
	  System.out.println(str);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
  }

}
