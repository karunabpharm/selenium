package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_OnewaySearch {
	
	public WebDriver driver;
	public void openURL() {
		
		driver=new FirefoxDriver();
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
			
	}
	public void OnewaySearch() throws Exception {
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		driver.findElement(By.linkText("30")).click();
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("3");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("2");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("1");
		new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("INR");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
		public void ModifySearch() throws Exception {
			Thread.sleep(45000);
			driver.findElement(By.id("AvailabilitySearchInputSelectView_ButtonSubmit")).click();
			driver.findElement(By.cssSelector("selected-label")).click();
			driver.findElement(By.cssSelector("div.date-wrapper date_wrapper_2")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("30")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("AvailabilitySearchInputSelectViewdestinationStation1")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("AvailabilitySearchInputSelectViewdestinationStation1")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("AvailabilitySearchInputSelectView_ButtonSubmit")).click(); 
			
		
		}
	

	public static void main(String[] args) throws Exception {
		Spicejet_OnewaySearch karuna=new Spicejet_OnewaySearch ();
		karuna.openURL();
		karuna.OnewaySearch();
		karuna.ModifySearch();
		
		

	}

}
