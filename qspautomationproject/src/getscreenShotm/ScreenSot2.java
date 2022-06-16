package getscreenShotm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenSot2 {


	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Madane\\OneDrive\\Desktop\\WCSM7 SELENIUM\\getscreenshot\\abc.png");
		Files.copy(src,dest);
		driver.close();
	}

}
