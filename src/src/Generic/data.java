package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class data {
	public static String getdata(String path, String sheet, int row, int column)
	{
		String data1 = null;
		try {
		FileInputStream f1 = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(f1);
		 data1 = book.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		}
		catch(Exception e)
		{
			
		}
		return data1;
	}

}
