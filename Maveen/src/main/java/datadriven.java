import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class datadriven
{   XSSFWorkbook WB;
	XSSFSheet sheet;
			
		public datadriven (String Excelpath) throws IOException
		{
		
			File src = new File(Excelpath);
			FileInputStream fis = new FileInputStream (src);
			 WB  = new XSSFWorkbook (fis); 
			}
		
		public  String  getdata (int sheetnumber,int row,int column)
		{ 
			sheet = WB.getSheetAt(sheetnumber);
			try {
				String data = sheet.getRow(row).getCell(column).getStringCellValue();
				return data;
			} catch (NoSuchElementException e) {
				// TODO: handle exception
			}
			return null;
		}
		public int getrowcount(int sheetindex)
		{
			int row = WB.getSheetAt(sheetindex).getLastRowNum();
			row= row+1;
			return row;
			
		}

	}
