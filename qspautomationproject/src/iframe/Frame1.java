package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Frame1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");//by using string
		//driver.switchTo().frame("iframeResult");//string frame id
		//driver.switchTo().frame(0);//by using index(it is deficult)
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		//SWITCH TO MAIN PAGE
		//A[@ID='tryhome']
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//A[@ID='tryhome']")).click();
	
	}

}
