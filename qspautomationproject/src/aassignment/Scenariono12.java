package aassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenariono12 {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		WebElement target = driver.findElement(By.xpath("//span[text()='Offers ']"));
		Actions act=new Actions (driver);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//span[contains(text(),'Additional 50% Off on')]")).click();
		driver.close();
	}	

}


