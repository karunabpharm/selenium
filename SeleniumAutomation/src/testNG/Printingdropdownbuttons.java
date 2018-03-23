package testNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class Printingdropdownbuttons {
	public WebDriver driver;
	public void verify_HMS_Loginpage() throws Exception {
		driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Registration")).click();
	}
  @Test
  public void f() {
	 List<WebElement> str=driver.findElements(By.tagName("select"));
	 System.out.println(str.size());
	 for (int i=0;i<str.size();i++)
	 {
		 System.out.println("Dropdown loc" + str.get(i).getAttribute("name"));
	 }
  }
  @BeforeTest
  public void beforeTest()throws Exception {
	  System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com");
		driver.manage().window().maximize();
		verify_HMS_Loginpage();
	  
  }

}
