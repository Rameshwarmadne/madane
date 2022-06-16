package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://www.shadi.com/login.htm");
		d.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("admin");
		d.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");
			d.findElement(By.cssSelector("input[name='submit']")).click();
			Thread.sleep(5000);
			d.close();

}
	}

