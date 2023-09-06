package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;




public class ReadDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  { {

	        //step 1: open the document in java readable format
	        FileInputStream fis = new FileInputStream("C:\\Users\\polsowja\\eclipse-workspace\\EpsilonSelenium\\src\\test\\resources\\Data.xlsx");

	        //step 2: create a workbook
	        Workbook wb = WorkbookFactory.create(fis);

	        //step 3: navigate to required sheet
	        org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Sheet1");
	        
	        //step 4: navigate to required row
	        Row rw = sh.getRow(1);

	        //step 5: navigate to required cell
	        org.apache.poi.ss.usermodel.Cell cl = rw.getCell(1);

	        String val = cl.getStringCellValue();
	        System.out.println(val);
		
	}
}
}