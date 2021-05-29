package qsp.demo;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	static {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Username: ");
		String un = sc.nextLine();
		System.out.println("Enter the password");
		String pwd = sc.nextLine();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys(un);

		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(pwd);

		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[21]/div/div/div/div/div[1]/div/div/li")).click();
	}

}
