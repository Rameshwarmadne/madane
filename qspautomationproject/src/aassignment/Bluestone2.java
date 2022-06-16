package aassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Kadas']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='The Ranveer Kada for Him']")).click();
		//driver.findElement(By.xpath("//div[@class='lc-o7mqve e16i86ec1']"));
		
		
		//WebElement frame =driver.findElement(By.xpath("//iframe[@id=\"chat-widget\"]"));
		//driver.switchTo().frame(frame);
		
		//driver.findElement(By.xpath("//p[contains(.,'Leave')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value=\"Buy Now\"]")).click();
		driver.close();
		
		
	}

}
