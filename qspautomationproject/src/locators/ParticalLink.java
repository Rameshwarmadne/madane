package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticalLink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.instagram.com/accounts/login/");
		d.manage().window().maximize();
		d.findElement(By.name("username")).sendKeys("ram");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.className("sqdOP  L3NKy   y3zKF     ")).click();
	Thread.sleep(5000);
		d.close();
		
	}

}
