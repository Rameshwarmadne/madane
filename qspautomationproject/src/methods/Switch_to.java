package methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver");
		d.manage().window().maximize();

	d.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	Thread.sleep(4000);
	d.close();
	
		
	}

}
