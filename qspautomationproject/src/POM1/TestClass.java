package POM1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjectmodel.lOGINpAGE;

public class TestClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-3qkdsq4/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		lOGINpAGE log= new lOGINpAGE(driver);
	 	Homepage1 home = new Homepage1(driver);
		log.EnterUn();
		log.EnterPass();
		log.ClickToLogin();
	
	    //
		Thread.sleep(4000);
	 	home.customer();
	 	home.newUser();
		//driver.close();
	 	
		
	}

}
