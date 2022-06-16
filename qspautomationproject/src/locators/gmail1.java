package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
         WebDriver d=new ChromeDriver();
	d.get("https://accounts.google.com/signin");
	d.manage().window().maximize();
	d.findElement(By.name("identifier")).sendKeys("jsagar1013@gmail.com");
	d.findElement(By.className("VfPpkd-vQzf8d")).click();
	Thread.sleep(4000);
	d.close();
	
}
}
