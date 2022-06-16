package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
	d.get("https://instagram.com");
	d.findElement(By.name("username")).sendKeys("madanerameshwar0@gmail.com");
	d.findElement(By.name("Password")).sendKeys("RMdeepwards@1997");
	
	d.findElement(By.cssSelector("button[class*='L3NKy']")).click();
	Thread.sleep(5000);
	d.close();
	
		
		
		
	}

}
