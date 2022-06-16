package dataDriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValid {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-3qkdsq4/login.do");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//accessing the non static method;
		File file=new File();
		
		//Read the USername
	     String username = file.readExcelData("./data/TestData.xlsx", "valid", 1, 0);
		//read the password
	     String password = file.readExcelData("./data/TestData.xlsx", "valid", 1, 1);
	     //now write the code for login operation
	     driver.findElement(By.name("username")).sendKeys(username);
	     Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
			  Thread.sleep(2000);
		
			
			driver.findElement(By.id("loginButton")).click();
	}

}
