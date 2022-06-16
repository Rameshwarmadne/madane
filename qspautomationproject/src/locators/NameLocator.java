package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shadi.com/login.htm");
	   driver.findElement(By.name("user_email")).sendKeys("akshay989057@gmail.com");
	  driver.findElement(By.name("user_pass")).sendKeys("Akshayp9890");
	  driver.findElement(By.id("submit2")).click();
	  Thread.sleep(4000);
	driver.close();
	}

}
