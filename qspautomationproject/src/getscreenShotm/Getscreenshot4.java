package getscreenShotm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Getscreenshot4 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		  
		
File src = driver.getScreenshotAs(OutputType.FILE);
     File dest=new File("C:\\Users\\Madane\\OneDrive\\Desktop\\WCSM7 SELENIUM\\getscreenshot\\bluestone1.png");
     Files.copy(src, dest);
	}

}
