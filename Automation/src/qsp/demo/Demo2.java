package qsp.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		
//		Thread.sleep(2000);
//		
//		/*Dimension d = new Dimension(400, 300);
//		driver.manage().window().setSize(d);
//		
//		Thread.sleep(1000);
//		driver.manage().window().setPosition(new Point(200, 200));*/
//		
//		
//		driver.navigate().to("https://www.google.com/");
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().forward();
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().refresh();
//		
//		Thread.sleep(2000);
//		
//		driver.quit();
	}
}
