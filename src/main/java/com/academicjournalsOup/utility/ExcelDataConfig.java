package com.academicjournalsOup.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Represents methods to invoke data from the excel sheet 
 *
 * Bugs: none known
 *
 * @author       Group
 * @version      Selenium 2020    
 */

/**
 *This class helps us in extracting data from the excel sheet, located in the computer
 */
public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;

	public ExcelDataConfig(String excelpath) {

		try {
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);	
			wb=new XSSFWorkbook(fis);
			sheet1=wb.getSheetAt(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
	}
	
	/**
	 * Creating a method to return sheetNumber, row, column
	 * @param sheetNumber
	 * @param row
	 * @param column
	 * @return
	 */
	public String getData(int sheetNumber,int row,int column) {
		sheet1=wb.getSheetAt(sheetNumber);
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	/**
	 * Creating a method to return number of rows 
	 * @param sheetIndex
	 * @return
	 */
	public int getRowCount(int sheetIndex) {
		int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		return row;
	}
	
	/**
	 * Iterating over the number of rows and extracting the data from the rows in the excel sheet
	 * @return
	 */
	public Object[][] passData() {


		int noofrows=getRowCount(0);
		Object[][] data=new Object[noofrows][3];

		for(int i=0;i<noofrows; i++) {
			data[i][0]=getData(0, i, 0);
			data[i][1]=getData(0, i, 1);
			data[i][2]=getData(0, i, 2);
		}

		return data;
	}
}
