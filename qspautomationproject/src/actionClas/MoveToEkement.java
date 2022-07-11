package actionClas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MoveToEkement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//find web element and store in one object
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//find web element and store in one object
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		//create object for action class
		Actions act=new Actions(driver);
		//call method is movrToElement and . perform
		act.moveToElement(login).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
