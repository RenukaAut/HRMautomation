package testUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readfile {
	static String data;
	
	public static String FetchDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		String path = "C:\\Users\\hp\\eclipse-workspace\\OrangeHRM\\src\\test\\resources\\files\\information.xlsx";
	
	FileInputStream file = new FileInputStream(path);
	
	Cell c = WorkbookFactory.create(file).getSheet("login").getRow(row).getCell(cell);
	
	CellType type = c.getCellType();
	
	
	if(type==CellType.STRING)
	{
		data = c.getStringCellValue();
	}
	
	else if
	(type==CellType.NUMERIC)
	{
		double d = c.getNumericCellValue();
		data = Double.toString(d);
	}
	
	else if
	(type==CellType.BLANK)
	{
		System.out.println("Get empty cell");
	}
		
return data;

}
	
}