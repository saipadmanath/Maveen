package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class maintest {
	XSSFWorkbook wb= null;
	XSSFSheet sheet1= null;
	XSSFRow row= null;
	XSSFCell cell= null;
		
	public maintest(String excelpath) throws Exception
	{
		File src= new File(excelpath);
	FileInputStream fis =new FileInputStream(src);
	wb= new XSSFWorkbook(fis);

		}

public String getcelldata (int sheetnumber, int row, int coloumn)
{
	
		sheet1=wb.getSheetAt(sheetnumber);
		String data =sheet1.getRow(row).getCell(coloumn).getStringCellValue();
		return data;
}
public int getrowcount(int sheetindex)
{
	int row =wb.getSheetAt(sheetindex).getLastRowNum();
	row=row+1;
	return row;
}
}

