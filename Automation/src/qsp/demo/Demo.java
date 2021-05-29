package qsp.demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.gecko.driver";
		String value = "./drivers/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver f = new FirefoxDriver();
		Thread.sleep(3000);
		f.close();
		
		/*String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver c = new ChromeDriver();
		Thread.sleep(5000);
		c.close();*/
		
		/*String key = "webdriver.ie.driver";
		String value = "./drivers/IEDriverServer.exe";
		System.setProperty(key, value);
		InternetExplorerDriver i = new InternetExplorerDriver();
		Thread.sleep(5000);
		i.close();*/
		
	}

}
