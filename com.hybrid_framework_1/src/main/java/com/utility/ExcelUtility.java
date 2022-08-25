package com.utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class ExcelUtility extends BaseClass {
	FileInputStream fis = null;
	Workbook wb = null;
	Sheet sh = null;
	
	public String getCellData(String filePath, String name, int rownum, int coloum){
		DataFormatter df = new DataFormatter();
		try {
			fis = new FileInputStream(filePath);
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sh = wb.getSheet(name);
		Cell c = sh.getRow(rownum).getCell(coloum);
		return df.formatCellValue(c);
		
	}
	
	@Test
	public void test(){
		String jxlpath = System.getProperty("user.dir")+"/src/test/resources/test11.xls";
		String poipath = System.getProperty("user.dir")+"/src/test/resources/TestData2.xlsx";
		System.out.println(getCellData(jxlpath, "Sheet1", 0, 0));
		System.out.println(getCellData(poipath, "Sheet1", 0, 0));
	}
	
}
