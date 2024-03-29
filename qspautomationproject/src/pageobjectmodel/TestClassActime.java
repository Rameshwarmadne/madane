package pageobjectmodel;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_DDF__BaseClass_TestNG_UtilityClass.LoginPage1;

public class TestClassActime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://desktop-3qkdsq4/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		lOGINpAGE login=new lOGINpAGE(driver);
		//perform operation on login page
		login.EnterUn();
		login.EnterPass();
		login.ClickToLogin();
		Thread.sleep(2000);
		//perform operation on home page
		HomePage home=new HomePage(driver);
		home.savelivetime();
		home.getCreatNewTask().click();
		Thread.sleep(2000);
		Set<String> AllHandels = driver.getWindowHandles();
		
	}

}
