package css;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CssofInstagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ajay");

    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("priti");
   driver.findElement(By.className("qF0y9")).click();
	  Thread.sleep(5000);
	  driver.close();
	  
	}

}
