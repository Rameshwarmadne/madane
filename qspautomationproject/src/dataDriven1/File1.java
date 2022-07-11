package dataDriven1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File1{
	
	// Read the data from file
	public String ReadExcelData(String ExcelPath,String SheetName,int RowCount,int CellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(ExcelPath);
	Workbook wb = WorkbookFactory.create(fis);
	          Sheet sh = wb.getSheet(SheetName);
	          Row rw = sh.getRow(RowCount);
	          Cell cell = rw.getCell(CellCount);
	          String data = cell.getStringCellValue();
	         // return data;
			return data;
	}
	//get the row count

	public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;
	}
			
		
		
	}


