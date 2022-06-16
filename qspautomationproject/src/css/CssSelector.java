package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/campaign/landing");
		d.findElement(By.cssSelector("input[name=firstname")).sendKeys("rameshwar");
		d.findElement(By.cssSelector("input[name=lastname")).sendKeys("madane");
		d.findElement(By.cssSelector("input[name=reg_email__")).sendKeys("70834935780");
		d.findElement(By.cssSelector("input[type=password]")).sendKeys("124568");          
		d.findElement(By.cssSelector("input[type=password]")).sendKeys("124568");  
		Thread.sleep(8000);
		d.close();
	}
}
