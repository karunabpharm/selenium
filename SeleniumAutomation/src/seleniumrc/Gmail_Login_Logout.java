package seleniumrc;

import com.thoughtworks.selenium.DefaultSelenium;

public class Gmail_Login_Logout {
	
	public DefaultSelenium karuna=new DefaultSelenium
			("localhost", 5555,"firefox","http://gmail.com");
	public void openURL() {
		karuna.start();
		karuna.open("//");
		karuna.windowMaximize();
		
	}
	public void verifyGmaillogin() throws Exception {
		karuna.type("identifierId", "karunabpharm");
		karuna.click("identifierNext");
		Thread.sleep(3000);
		karuna.type("//*[@id='password']/div[1]/div/div[1]/input", "07429186166Kr");
		karuna.click("passwordNext");
		Thread.sleep(3000);
		
	}
	public void verifyGmaillogout() throws Exception {
		
	karuna.click("//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span");
	karuna.click("gb_71");
	
	
	}


	public static void main(String[] args) throws Exception {
		Gmail_Login_Logout g=new Gmail_Login_Logout();
		g.openURL();
		g.verifyGmaillogin ();
		g.verifyGmaillogout();
		


	}

}
