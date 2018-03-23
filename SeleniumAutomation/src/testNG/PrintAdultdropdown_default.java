package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class PrintAdultdropdown_default {
	public WebDriver driver;
  @Test
  public void f() {
	  WebElement str=(WebElement) new Select(driver.findElement(By.name("adults"))).
				 getFirstSelectedOption();
		 System.out.println(str .getText());
		 if (str.getText().equalsIgnoreCase("2"))
		 {
			 System.out.println("default value is 2");
		 }
		 else
		 {
			 System.out.println("default value not 2");
		 }
  }
  private void getFirstSelectedOption() {
	// TODO Auto-generated method stub
	
}
@BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.jet2.com");
	  driver.manage().window().maximize();
	  
  }

}
