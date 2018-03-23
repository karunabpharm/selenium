package corejava;

import com.thoughtworks.selenium.DefaultSelenium;

public class Sample {
	
	public void test() {
		System.out.println ("hi welcome to selenium");
	}
	public void test1() {
		System.out.println("mr shabudhin");
		
		
	}
	public void test2() {
	
	System.out.println("anil,prasanth,sha,welcome to join group");
	}
	
	public void test3() {
		DefaultSelenium karuna=new DefaultSelenium
				("localhost", 5555, "firefox", "http://www.facebook.com");
		karuna.start();
		karuna.open("facebook");
		karuna.windowMaximize();
		test2();
	}

	
	public static void main(String[] args) {
		//System.out.println("hi welcome ");
		
		Sample k=new Sample();
		k.test();
		k.test1();
		k.test2();
		k.test3();

	}

}
