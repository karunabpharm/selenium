package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class InformationCommands {
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	 String str= driver.findElement(By.linkText("Gmail")).getText();
	 System.out.println(str);
	 String str1= driver.findElement(By.name("btnK")).getAttribute("aria-label");
	 System.out.println(str1);
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
  }

}
