package aassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenariono15 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		  driver.findElement(By.id("denyBtn")).click();
		  Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[@title='Coins']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-2gms,m']")).click();
		driver.close();
		
	}

}
