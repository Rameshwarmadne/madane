package scroolingOperation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrollup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
         
          	WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.youtube.com/");
           Thread.sleep(5000);
           JavascriptExecutor js = (JavascriptExecutor)driver;
  	     js.executeScript("window.scrollBy(0,10000);");
  	     Thread.sleep(5000);
           js.executeScript(" window.scrollBy(0,-500)");
      

	}

}
