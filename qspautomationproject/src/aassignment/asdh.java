package aassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class asdh {
public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.firefox.driver","./drivers/geckodriver.exe");
		driver.get("http://desktop-3qkdsq4/login.do");

}
}