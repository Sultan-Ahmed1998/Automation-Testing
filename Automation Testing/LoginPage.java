package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver obj=new ChromeDriver();
		obj.get("https://www.demoblaze.com/index.html");
		Thread.sleep(2000);
		
		obj.findElement(By.id("login2")).click();
		Thread.sleep(2000);
		
		obj.findElement(By.id("loginusername")).click();
		obj.findElement(By.id("loginusername")).sendKeys("Adrita");
		Thread.sleep(2000);
		
		obj.findElement(By.id("loginpassword")).click();
		obj.findElement(By.id("loginpassword")).sendKeys("12345");
		Thread.sleep(2000);
		
		// Click on the login button
		obj.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		

	}

}
