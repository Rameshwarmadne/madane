
package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox2 {

	public static void main(String[]args)throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	
	FirefoxDriver driver = new FirefoxDriver();//launch browser
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.Whatsapp.com");//launch the web app
		Thread.sleep(10000);
		
		driver.get("https://flipcard");
		//provide the delay of 10 second
		driver.close();//close the browser
	 
}
}