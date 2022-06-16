package assercation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginOrangeHRM {
	WebDriver driver;
 
  @BeforeTest
  public void SetProperty() {
	  System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
  }
  @BeforeMethod
  public void LounchBrowser() {

	 WebDriver	driver= new ChromeDriver();
  }
  @Test
  public void TestCase() {
	  
  }
}
