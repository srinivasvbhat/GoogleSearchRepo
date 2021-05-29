package qsp.demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class practice{
	public static void main(String[] args) throws InterruptedException {
		String key= "webdriver.gecko.driver";
		String value= "./drivers/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver f=new FirefoxDriver();
		Thread.sleep(2000);
		
	}
}
