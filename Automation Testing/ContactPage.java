package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver obj=new ChromeDriver();
		obj.get("https://www.demoblaze.com/index.html");
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		Thread.sleep(2000);
		
		obj.findElement(By.id("recipient-email")).click();
		obj.findElement(By.id("recipient-email")).sendKeys("sakib@gmail.com");
		Thread.sleep(2000);
		
		obj.findElement(By.id("recipient-name")).click();
		obj.findElement(By.id("recipient-name")).sendKeys("Sakib");
		Thread.sleep(2000);
		
		obj.findElement(By.id("message-text")).click();
		obj.findElement(By.id("message-text")).sendKeys("Hello");
		Thread.sleep(2000);
		
		// Click on the login button
		obj.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
	}

}
