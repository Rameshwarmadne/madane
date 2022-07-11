package aassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rfewer {
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}

}
