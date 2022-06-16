package aassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class Scenariono16 {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bluestone.com/");
	
}

}
