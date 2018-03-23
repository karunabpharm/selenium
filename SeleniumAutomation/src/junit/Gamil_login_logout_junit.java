package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gamil_login_logout_junit {
	
	public  WebDriver Driver;
	
	@Before//pre condition
	public void setUp() throws Exception {
		Driver=new FirefoxDriver();
		Driver.get("http://www.gmail.com");
		Driver.manage().window().maximize();	
	}

	@After//post condition
	public void tearDown() throws Exception {
		Driver.quit();
	}

	@Test//Test scenario
	
	public void verifyLogin() throws Exception{
		Driver.findElement(By.id("identifierId")).sendKeys("karunabpharm");
		Driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
	    Thread.sleep(3000);
	    Driver.findElement(By.name("password")).sendKeys("07429186166Kr");
	    Driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
	    Thread.sleep(8000);	    	
	}
	@Test//Test scenario
public void verifyLogout() {
		Driver.findElement(By.cssSelector("span.gb_ab.gbii")).click();
		Driver.findElement(By.id("gb_71")).click();
	
}
}
