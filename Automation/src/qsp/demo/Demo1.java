package qsp.demo;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter the browser: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String browser = sc.nextLine();

		WebDriver driver = null;
		if (browser.equalsIgnoreCase("gc")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		Thread.sleep(2000);
		driver.close();
	}

}
