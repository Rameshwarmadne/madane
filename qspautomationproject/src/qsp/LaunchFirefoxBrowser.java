package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
public class LaunchFirefoxBrowser
{
static{
	System.setProperty(".gecko.driver","./drivers/geckodriver.exe");
}
	
	public static void main (String [] args)
	
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 WebDriver d=new FirefoxDriver();
		d.get("https://www.qaacharya.in/");
		
		
		
		 
	}

}
 