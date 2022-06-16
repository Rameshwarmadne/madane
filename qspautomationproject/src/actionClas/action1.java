
package actionClas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class action1 {
		public static void main(String[] args) throws InterruptedException  {
			  System.setProperty("webdriver.chrome.driver","./Drivers/Chromedriver.exe");
				WebDriver d= new ChromeDriver();
				d.manage().window().maximize();
			
				
                d.get("https://www.google.com/");
                Thread.sleep(2000);
                
			
				d.findElement(By.name("q")).sendKeys("collection framework ");
				((WebElement) d).click();
			
		   
				
		}

}
