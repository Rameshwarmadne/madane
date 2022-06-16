package windowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WtihoutQuitMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
	
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(4000);
		Set<String> AllHandels = driver.getWindowHandles();
		for(String s:AllHandels)
		{
		
			driver.switchTo().window(s).close();
		}
	//	driver.close();
	}

}
