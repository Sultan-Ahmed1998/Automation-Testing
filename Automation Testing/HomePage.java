package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver obj=new ChromeDriver();
		obj.get("https://www.demoblaze.com/index.html");
		Thread.sleep(2000);
		
		//click on categories
		obj.findElement(By.xpath("//a[contains(text(),'Phones')]")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("//a[contains(text(),'Monitors')]")).click();
		Thread.sleep(2000);
		
		//click on next and previous button
		obj.findElement(By.id("next2")).click();
		Thread.sleep(2000);
		obj.findElement(By.id("prev2")).click();
		Thread.sleep(3000);
		
		//click on a product
		obj.findElement(By.xpath("//a[contains(text(),'Nokia lumia 1520')]")).click();
		Thread.sleep(3000);
		//click on "Add to cart" button
		obj.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		Thread.sleep(3000);
		
		
	}

}
