package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("java123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
	}

}
