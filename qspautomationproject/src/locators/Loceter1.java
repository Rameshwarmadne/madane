package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loceter1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU'] ")).sendKeys("9834429688");

		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("akshay@1999");
	
		Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(@class,' _3AWRsL')]")).click();
		
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("i phone11");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	//	Thread.sleep(2000);
		//getScreenshot(driver);
		

		
	}

	private static void getScreenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

}
