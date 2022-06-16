package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		  WebElement un = d.findElement(By.xpath("//input[@type='text']"));
		  un.sendKeys("1000000000");
		  Thread.sleep(2000);
		  WebElement submit = d.findElement(By.xpath("//button[@type='submit']"));
		  submit.click();
		  un.clear();
		  Thread.sleep(2000);
		
		 String s = d.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		  Thread.sleep(2000);
		System.out.println(s);
		d.close();
	}

}
