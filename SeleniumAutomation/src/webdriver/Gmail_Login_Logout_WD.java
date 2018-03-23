package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Gmail_Login_Logout_WD {
	
	public  WebDriver Driver;
	public void openURL() {
		Driver=new FirefoxDriver();
		Driver.get("http://www.gmail.com");
		Driver.manage().window().maximize();
	}

	public void Verifylogin() throws Exception {
		
		Driver.findElement(By.id("identifierId")).sendKeys("karunabpharm");
		Driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
	    Thread.sleep(3000);
	    Driver.findElement(By.name("password")).sendKeys("07429186166Kr");
	    Driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
	    Thread.sleep(8000);
	    
		
	}
	public void verifylogout() {
		
		Driver.findElement(By.cssSelector("span.gb_ab.gbii")).click();
		Driver.findElement(By.id("gb_71")).click();
	}
	public static void main(String[] args) throws Exception {
		Gmail_Login_Logout_WD karuna=new Gmail_Login_Logout_WD();
		karuna.openURL();
		karuna.Verifylogin();
		karuna.verifylogout();

	}

}
