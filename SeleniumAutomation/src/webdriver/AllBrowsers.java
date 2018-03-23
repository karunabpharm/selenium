package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowsers {
	public WebDriver driver;
	public void ff() {
		driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
	
	
	}
	public void ie() {
		System.setProperty("webdriver.ie.driver", "E:\\lib\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://www.google.com");
		
	}

	public void chrome() {
		System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		
		
	}
	public static void main(String[] args) {
		AllBrowsers karuna=new AllBrowsers();
		karuna.ff();
	
		karuna.chrome();
		karuna.ie();
	
		
	}

}
