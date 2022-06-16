package dataDriven;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForInvalid {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://desktop-3qkdsq4/login.do");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		//accessing the method of file
		File file = new File();
		int rc = file.getrowCount("./data/TestData.xlsx","invalid" );
		
		for(int i=1;i<=rc;i++)
		{
			String username = file.readExcelData("./data/TestData.xlsx","invalid", i, 0);
			String password = file.readExcelData("./data/TestData.xlsx","invalid", i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
		

			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}
			
	}
	}


