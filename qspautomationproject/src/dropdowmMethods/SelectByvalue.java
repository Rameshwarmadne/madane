package dropdowmMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByvalue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Madane/OneDrive/Desktop/html/dropdown.html");
		Thread.sleep(4000);
		  WebElement dropdownElement=driver.findElement(By.id("menu"));
		  Select sel=new Select(dropdownElement);
		   sel.selectByValue("v8");
		   Thread.sleep(4000);
		   
		   driver.close();
		  
	}
}
