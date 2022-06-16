package getscreenShotm;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class GetscreenShot2 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.youtube.com/");
     	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     	//by using remote webDriver methods;
	RemoteWebDriver rw=(RemoteWebDriver)d;
	File sr=rw.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\Madane\\OneDrive\\Desktop\\WCSM7 SELENIUM\\getscreenshot\\xyz1.png");

	Files.copy(sr, des);
	d.close();
}
}
