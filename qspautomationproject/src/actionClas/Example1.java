package actionClas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.bluestone.com/");
		Thread.sleep(4000);
		d.findElement(By.xpath("//div[@class='lc-1x7wur2 e1dmt1bi0']")).click();
		Thread.sleep(2000);
		d.findElement(By.id("name")).sendKeys("abhijit");
		Thread.sleep(2000);
		d.findElement(By.id("email")).sendKeys("abhijit@1234.gmail.com");
		Thread.sleep(2000);
		d.findElement(By.id("rmnfoz4hne_146917605549304831")).sendKeys("123456789");
		
	}

}
