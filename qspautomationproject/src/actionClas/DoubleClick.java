package actionClas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement doubleClick = driver.findElement(By.xpath("//a[@class='_3-PJz-']"));
	Actions act=new Actions(driver);
	act.doubleClick(doubleClick).perform();
	
	
	
	
}

}
