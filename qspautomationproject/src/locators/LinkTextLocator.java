package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	d.findElement(By.name("txtUsername")).sendKeys("admin");
	d.findElement(By.name("txtPassword")).sendKeys("admin123");
		d.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		d.close();
		
		 
		  
		}

}
