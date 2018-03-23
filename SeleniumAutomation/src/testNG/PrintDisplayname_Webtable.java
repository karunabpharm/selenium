package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;

public class PrintDisplayname_Webtable {
	public WebDriver driver;
	public void verify_HMS_Loginpage() throws Exception {
	driver.findElement(By.linkText("HMS")).click();
	driver.findElement(By.name("username")).sendKeys("user1");
	driver.findElement(By.name("password")).sendKeys("user1");
	driver.findElement(By.name("submit")).click();
	driver.findElement(By.linkText("Registration")).click();
	}
  @Test
  public void f() throws Exception{
	  verify_HMS_Loginpage();
	  String str=driver.findElement(By.xpath("html/body/div[2]/div/div[2]")).getText();
	  System.out.println(str);
	  String[] s=str.split("\n");
	  System.out.println(s.length);
	  for (int i=0;i<s.length;i++)
	  {
		  if(s[i].contains("*")){
			  if (s[i].equalsIgnoreCase("Last Name*"))
			  {
			  System.out.println(s[i]);
			  
			  }else if (s[i].equalsIgnoreCase("Gender*")){
					  System.out.println(s[i]);
			  }
		  }
	  }
	  }
	 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://www.seleniumbymahesh.com");
		driver.manage().window().maximize();
  }

}
