package seleniumrc;

import com.thoughtworks.selenium.DefaultSelenium;

public class Gnail_Login {

	public static void main(String[] args) throws Exception  {
		
		DefaultSelenium karuna=new DefaultSelenium
				("localhost", 5555,"firefox","http://gmail.com");
		karuna.start();
		karuna.open("//");
		karuna.windowMaximize();
		karuna.type("identifierId", "karunabpharm");
		karuna.click("identifierNext");
		Thread.sleep(3000);
		karuna.type("//*[@id='password']/div[1]/div/div[1]/input", "07429186166Kr");
		karuna.click("passwordNext");
	}
}


