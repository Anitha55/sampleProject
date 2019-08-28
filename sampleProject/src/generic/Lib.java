package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lib implements IAutoConstant {
	public static Workbook wb;
	public static String getProperty(String CONFIG_PATH,String Key) {
		String property="";
		Properties prop=new Properties();
		try {
			prop.load(new FileInputStream(CONFIG_PATH));
		}catch (IOException e) {
			e.printStackTrace();
		}
		property=prop.getProperty(Key);
		return property;
		
	}
	public static int getRowCount(String EXCEL_PATH,String sheet) {
		int rowCount=0;
		try {
			wb=WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
		} catch (Exception e) {
			e.printStackTrace();
		}
		 rowCount = wb.getSheet(sheet).getLastRowNum();
		 return rowCount;
	}
	public static String getCellValue(String EXCEL_PATH,String sheet,int row,int column) {
		String value="";
		try {
			wb=WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		value = wb.getSheet(sheet).getRow(row).getCell(column).toString();
		return value;
	}

	
}
