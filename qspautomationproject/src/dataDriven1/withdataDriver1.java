package dataDriven1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withdataDriver1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		
		FileInputStream file=new FileInputStream("./data/TestData.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("valid");
		String userId = sh.getRow(1).getCell(0).getStringCellValue();
		
		
		driver.get("http://desktop-3qkdsq4/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(userId);
		FileInputStream file1=new FileInputStream("./data/TestData.xlsx");
		
		Sheet sh1 = WorkbookFactory.create(file1).getSheet("valid");
		String pwd = sh.getRow(1).getCell(1).getStringCellValue();
	
		
		
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
	}

}
