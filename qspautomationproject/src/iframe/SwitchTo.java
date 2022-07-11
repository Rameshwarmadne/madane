package iframe;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchTo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://desktop-3qkdsq4/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[text()='Create new tasks']")).click();
		Thread.sleep(4000);
		//multiple id 
		Set<String> multipleid = driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList<String>(multipleid);
	 System.out.println(ar);
		driver.switchTo().window(ar.get(1));
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("zattupat");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@onclick='createTasks();']")).click();
		driver.switchTo().window(ar.get(0));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='SubmitTTButton']")).click();
	}
	
}
