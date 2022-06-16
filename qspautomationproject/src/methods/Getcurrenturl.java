package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrenturl {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver d=new ChromeDriver();
	       d.get("https://github.com/");
	       String s = d.getCurrentUrl();

	System.out.println(s);		
	}

}