package multipleBrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowsing1 {
	@Parameters("browserName")
	@Test
	
	
	public void TC1(String browserName) throws InterruptedException
	{
	WebDriver driver=null;

	
	if(browserName.equals("Chrome"))
	{
	System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
	 driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/accounts/login/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
	}
	else if(browserName.equals("firefox"))
	{

		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 driver = new FirefoxDriver();
	
	driver.get("https://www.instagram.com/accounts/login/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();

	}
		
	}
	}




