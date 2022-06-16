package dataDriven1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class WithoutDataDriven {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//we need to create the object
		FileInputStream file=new FileInputStream("./data/TestData.xlsx");
		//then go to work book factory(get the file)
		Workbook wb = WorkbookFactory.create(file);
		  //get the sheet
		 Sheet rw = wb.getSheet("valid");
		 //get the row count
		 Row cl = rw.getRow(1);
		// get the coloum count
		 Cell data = cl.getCell(0);
		// get the data of a prticuar coloum
		String validData = data.getStringCellValue();
		// then use the data for performing the action
		  
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		driver.get("http://desktop-3qkdsq4/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(validData);
		FileInputStream file1=new FileInputStream("./data/TestData.xlsx");
		  Workbook wb1 = WorkbookFactory.create(file1);
			 Sheet rw1 = wb1.getSheet("valid");
			 Row cl1 = rw.getRow(1);
			 Cell data1 = cl1.getCell(1);
			String validData1 = data1.getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(validData1);
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
	String getText = driver.findElement(By.xpath("//input[@value=\"Save Leave Time\"]")).getText();
	String actualText = "Save Leave Time";
if(getText.equals(actualText))
	{
		System.out.println("tc Pass");
		
	}
	else
	{
		System.out.println("TC fail");
		
	}
	driver.close();
		
	}

}


