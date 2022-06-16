package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		FileInputStream fis=new FileInputStream("./data/TestData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		//Sheet sh= wb.getSheet("Sheet1");
		org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet("Sheet1");
		Row rw=sh.getRow(1);
		Cell cl=rw.getCell(0);
		String data=cl.getStringCellValue();
		FileInputStream fis1=new FileInputStream("./data/TestData.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1);
		
		
		driver.findElement(By.id("email")).sendKeys(data);
	
		Thread.sleep(4000);
		
		driver.findElement(By.id("pass")).sendKeys(data);
	
		Thread.sleep(4000);
	driver.findElement(By.id("loginbutton")).click();
	}

}
