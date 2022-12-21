package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SigninPage {

	public static void main(String[] args) throws InterruptedException {			
				WebDriverManager.chromedriver().setup();
				WebDriver obj=new ChromeDriver();
				obj.get("https://www.demoblaze.com/index.html");
				Thread.sleep(2000);
				
				//click on Signup feature
				obj.findElement(By.id("signin2")).click();
				Thread.sleep(2000);

				obj.findElement(By.id("sign-username")).click();
				obj.findElement(By.id("sign-username")).sendKeys("Sakib");
				Thread.sleep(2000);

				obj.findElement(By.id("sign-password")).click();
				obj.findElement(By.id("sign-password")).sendKeys("12345");
				Thread.sleep(2000);
				
				//click on signup button
				obj.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
			}

	}

