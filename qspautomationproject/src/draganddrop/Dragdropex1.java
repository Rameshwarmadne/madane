package draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdropex1 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/webpage");
		  Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("//a[text()='API Documentation']"));

		WebElement target = driver.findElement(By.xpath("//input[@type='text']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).perform();
		}
	
	}


