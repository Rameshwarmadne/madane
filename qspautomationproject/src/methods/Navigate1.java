package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		
		d.navigate().to("https://www.naukri.com/registration");
		Navigation nav=d.navigate();
		nav.forward();
		Thread.sleep(5000);
		nav.back();
		Thread.sleep(5000);
		nav.refresh();
		Thread.sleep(5000);
		d.close();
	}
}

