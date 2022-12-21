package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CartPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver obj=new ChromeDriver();
		obj.get("https://www.demoblaze.com/index.html");
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//a[contains(text(),'Cart')]")).click();
		Thread.sleep(2000);
		
		obj.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		Thread.sleep(2000);
		
		obj.findElement(By.id("name")).click();
		obj.findElement(By.id("name")).sendKeys("Sakib");
		Thread.sleep(1000);
		
		obj.findElement(By.id("country")).click();
		obj.findElement(By.id("country")).sendKeys("Bangladesh");
		Thread.sleep(1000);
		
		obj.findElement(By.id("city")).click();
		obj.findElement(By.id("city")).sendKeys("Dhaka");
		Thread.sleep(1000);
		
		obj.findElement(By.id("card")).click();
		obj.findElement(By.id("card")).sendKeys("7802349807");
		Thread.sleep(1000);
		
		obj.findElement(By.id("month")).click();
		obj.findElement(By.id("month")).sendKeys("October");
		Thread.sleep(1000);
		
		obj.findElement(By.id("year")).click();
		obj.findElement(By.id("year")).sendKeys("2022");
		Thread.sleep(1000);
		
		obj.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		Thread.sleep(2000);
		
		
		
		
	}

}

