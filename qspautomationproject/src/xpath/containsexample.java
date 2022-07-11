package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class containsexample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("madanerameshwar");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("RMdeepwards@1997");
		driver.findElement(By.xpath("//button[contains(@class,'sqdOP  L3NKy   y3zKF     ')]     ")).click();
		driver.findElement(By.xpath("//button[@class='sqdOP yWX7d    y3zKF     ']")).click();
	}

}
